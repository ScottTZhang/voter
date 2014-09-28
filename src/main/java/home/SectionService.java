package home;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import Section
//import SectionDAO

@Service
@Transactional
public class SectionService {
    @Autowired
    SectionDAO sectionDao;

    public Section getSection(long id) {
        return sectionDao.getSection(id);
    }
    public void addSection(Section section) {
        sectionDao.addSection(section);
    }
    public void deleteSection(long id) {
        sectionDao.deleteSection(id);
    }
    public List<Section> findAll() {
        return sectionDao.findAll();
    }
    public void updateSection(Section section) {
        sectionDao.updateSection(section);
    }
}
