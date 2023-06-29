package bkw.studyhard.ex6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Data3{int x;}
public class Ex6_8 {
    final static Logger logger= LoggerFactory.getLogger(Ex6_8.class);
    public static void main(String[] args){
        Data3 d = new Data3();
        d.x=10;

        Data3 d2 = copy(d);
        logger.info("d.x =" + d.x);
        logger.info("d2.x="+d2.x);
    }
    static Data3 copy(Data3 d){
        Data3 tmp = new Data3(); //새로운 객체 tmp 생성
        tmp.x = d.x; // d.x의 값을 tmp.x에 복사한다.
        return tmp; // 복사한 객체의 주소를 반환한다.
    }
}
