package home;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SurveyService {
    @Autowired
    SurveyDAO surveyDao;

    public Survey getSurvey(long id) {
        return surveyDao.getSurvey(id);
    }
    public void addSurvey(Survey section) {
        surveyDao.addSurvey(section);
    }
    public void deleteSurvey(long id) {
        surveyDao.deleteSurvey(id);
    }
    public List<Survey> findAllBySectionId(long sectionId) {
        return surveyDao.findAllBySectionId(sectionId);
    }
    public void updateSurvey(Survey section) {
        surveyDao.updateSurvey(section);
    }
}
