package bkw.java.constructor;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Constructor
 * @since : 2024-04-03
 */
public class Constructor {

    //매개변수가 없는 생성자
    Constructor(){

    }

    //매개변수가 있는 생성자
    Constructor(int a, int b){

    }

    Constructor c = new Constructor();
    /**
     - 연산자 new에 의해서 메모리 (heap) 에 해당 클래스의 인스턴스가 생성된다.
     - 생성자가 호출되어 초기화 등의 작업을 수행한다.
     - 연산자 new의 결과로 생성된 인스턴스의 주소를 참조변수(c)에 저장한다.
     **/

}
