package bkw.etc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class htmlTest {

    @RequestMapping("/moment")//JQUERY
    public String moment() {
        return "moment";
    }


    @RequestMapping("/momentqueryselector")//DOM
    public String momentqueryselector() {
        return "momentqueryselector";
    }

    @RequestMapping("/textContent")//DOM , JQUERY
    public String textContent() {
        return "textContent";
    }

    @RequestMapping("/sortPractice")
    public String sortSort(){
        return "sortPractice";
    }



}
