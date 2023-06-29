package bkw.studyhard.ex6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//기본형 매개변수
class Data{
    int x;
}
public class Ex_6_6 {
    final static Logger logger = LoggerFactory.getLogger(Ex_6_6.class);
    public static void main(String[] args){
        Data d = new Data();
        d.x = 10;
        logger.info("main() : x = " + d.x);
        change(d.x);
        logger.info("After change(d.x)");
        logger.info("main() : x = " + d.x);


    }

    static void change(int x){ //기본형 매개변수
        x=1000;
        logger.info("change() : x = " + x);
    }

}
