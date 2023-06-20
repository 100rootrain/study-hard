package bkw.studyhard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//참조형 매개변수
class Data2 {
    int x;
}
class Ex6_7 {
    final static Logger logger = LoggerFactory.getLogger(Ex6_7.class);
    public static void main(String[] args){
        Data2 d = new Data2();
        d.x = 10;
        logger.info("main() : x = "+d.x);

        change(d);
        logger.info("After change(d)");
        logger.info("main() : x = " + d.x);
    }
    static void change(Data2 d){//참조형 매개변수
        d.x = 1000;
        logger.info("change() : x = "+ d.x);
    }

}
