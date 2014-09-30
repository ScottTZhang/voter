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
public class SurveyDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * @Transactional annotation below will trigger Spring Hibernate transaction manager to automatically create
     * a hibernate session. See src/main/webapp/WEB-INF/dispatcher-servlet.xml
     */

    public List<Survey> findAllBySectionId(long id) {
        Session session = getCurrentSession();
        List surveys = session.createQuery("from Survey as survey where survey.status!=0 and survey.sectionId = :id").setParameter("id", id).list();
        return surveys;
    }

    public void addSurvey(Survey survey){
        getCurrentSession().save(survey);
    }

    public void updateSurvey(Survey survey){
        Survey surveyToUpdate = getSurvey(survey.getId());
        surveyToUpdate.setTitle(survey.getTitle());
        surveyToUpdate.setDescription(survey.getDescription());
        getCurrentSession().update(surveyToUpdate);
    }

    public Survey getSurvey(long id){
        Survey survey = (Survey)getCurrentSession().get(Survey.class, id);
        return survey;
    }

    public void deleteSurvey(long id){
        Survey survey = getSurvey(id);
        if(survey != null){
            survey.setStatus(0);
            getCurrentSession().update(survey);
        }
    }
}
