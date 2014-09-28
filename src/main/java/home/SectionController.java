package home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;


import java.util.List;

@Controller
public class SectionController {

    @Autowired
    SectionService sectionService;

    /**
     * This handler method is invoked when
     * http://localhost:8080/voter/section is requested.
     * The method returns view name "section"
     * which will be resolved into /WEB-INF/views/section.jsp.
     *  See src/main/webapp/WEB-INF/servlet-context.xml
     */
    @RequestMapping(value = "/sections", method = RequestMethod.GET)
        @ResponseBody
        public ModelAndView list(@RequestParam(value="message", required=false) String msg) {
            ModelAndView mav = new ModelAndView("sections");
            mav.addObject("message", msg);
            List<Section> sections = sectionService.findAll();
            mav.addObject("sections", sections);
            return mav;//sections.jsp
        }

    @RequestMapping(value = "/section/add", method = RequestMethod.GET)
        public ModelAndView add(){
            ModelAndView mav = new ModelAndView("add-section-form");
            mav.addObject("sec", new Section());
            return mav;
        }

    @RequestMapping(value = "/section/add", method = RequestMethod.POST)
        public ModelAndView adding(@ModelAttribute Section section) {
            ModelAndView mav = new ModelAndView("redirect:/sections");//jsp
            section.setStatus(1);
            sectionService.addSection(section);
            String msg = "Section was successfully added.";
            mav.addObject("message", msg);
            //List<Section> sections = sectionService.findAll();
            //mav.addObject("sections", sections);
            return mav;
        }

    @RequestMapping(value = "/section/edit/{id}", method = RequestMethod.GET)
        public ModelAndView edit(@PathVariable long id) {
            ModelAndView mav = new ModelAndView("edit-section-form");
            Section section = sectionService.getSection(id);
            mav.addObject("sec", section);
            return mav;
        }

    @RequestMapping(value = "/section/edit/{id}", method = RequestMethod.POST)
        public ModelAndView editting(@ModelAttribute Section section, @PathVariable long id){
            ModelAndView mav = new ModelAndView("redirect:/sections");
            sectionService.updateSection(section);
            String msg = "Section was successfully editted.";
            mav.addObject("message", msg);
            //List<Section> sections = sectionService.findAll();
            //mav.addObject("sections", sections);
            return mav;
        }

    @RequestMapping(value = "section/delete/{id}", method = RequestMethod.GET)
        public ModelAndView delete(@PathVariable long id){
            ModelAndView mav = new ModelAndView("sections");
            sectionService.deleteSection(id);
            String msg = "Section was successfully deleted.";
            mav.addObject("message", msg);
            List<Section> sections = sectionService.findAll();
            mav.addObject("sections", sections);
            return mav;
        }
}
