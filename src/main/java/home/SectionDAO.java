package home;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@SuppressWarnings({"unchecked", "rawtypes"})
public class SectionDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * @Transactional annotation below will trigger Spring Hibernate transaction manager to automatically create
     * a hibernate session. See src/main/webapp/WEB-INF/dispatcher-servlet.xml
     */

    public List<Section> findAll() {
        Session session = getCurrentSession();
        List sections = session.createQuery("from Section as section where section.status!=0").list();
        return sections;
    }

    public void addSection(Section section){
        getCurrentSession().save(section);
    }

    public void updateSection(Section section){
        Section sectionToUpdate = getSection(section.getId());
        sectionToUpdate.setName(section.getName());
        sectionToUpdate.setDescription(section.getDescription());
        getCurrentSession().update(sectionToUpdate);
    }

    public Section getSection(long id){
        Section section = (Section)getCurrentSession().get(Section.class, id);
        return section;
    }

    public void deleteSection(long id){
        Section section = getSection(id);
        if(section != null){
            section.setStatus(0);
            getCurrentSession().update(section);
        }
    }
}
