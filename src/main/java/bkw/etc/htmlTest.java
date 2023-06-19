package bkw.etc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class htmlTest {

    @RequestMapping("/moment")
    public String moment() {
        return "moment";
    }

//    @RequestMapping("/moment")
//    public ModelAndView home() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("moment");
//        return mv;
//    }


}
