package bkw.etc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    @RequestMapping("/headerFixedOnScroll")
    public String hfOs(){return "header_fixed_on_scroll";}

    @RequestMapping("/contenteditable")
    public String cdcd(){return "contenteditable";}
    @RequestMapping("/jsonTest")
    public String jsts(){return "jsonTest";}

    @RequestMapping("/sessionStorage")
    public String sessionStorage(){return "sessionStorage";}

    @RequestMapping("/gnb_vertical_test")
    public String gnb_vertical_test(){return "gnb_vertical_test";}

    @GetMapping("/asideSlideMenu")
    public String asideSlideMenu(){return "AsideSlideMenu_withToggleSwitch_mouseoverEffect";}

    @GetMapping("/slidebar")
    public String slidebar(){return "slidebar";}

    @GetMapping("/fmKoreaGnb")
    public String fmKoreaGnb(){return "fmKoreaGnb";}

    /**
     * 테이블 행 열 반대로(모바일 참고)
     *
     * @return the string
     */
    @GetMapping("/tableOpposite")
    public String table_opposite(){return "table_opposite";}

    /**
     * 테이블 열(사이즈 줄이고 늘리고)
     *
     * @return the string
     */
    @GetMapping("/tableResize")
    public String table_resize(){return "resize_table_column";}


}
