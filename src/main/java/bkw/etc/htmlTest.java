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

    @RequestMapping("/sortPractice") //오름차순,내림차순,프로그래머스문제, Object정렬, 동적접근
    public String sortSort(){
        return "sortPractice";
    }

    @RequestMapping("/tdColorChange") //td 클릭시 색깔 변하게
    public String tdCg(){return "tdColorChange";}



}
