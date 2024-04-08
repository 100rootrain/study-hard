package bkw.java.constructor.ex1;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : ThisConstructor
 * @since : 2024-04-03
 */

class ExampleA{
    int value;
    int value2;

    ExampleA(int v, int v2){
        this.value = v;
        this.value2 = v2;
    }

    //생성자를 이용한 인스턴스의 복사
    ExampleA(ExampleA ex){
        this(ex.value,ex.value2); // ExampleA(int v, int v2) 생성자 호출
    }

}

class ExampleB{
    int value1;
    int value2;

    ExampleB(){

    }
    ExampleB(int a, int b){
        value1 = a;
        value2 = b;
    }

    //int a와 int b를 매개변수로 가지는 생성자 ExampleB(int a, int b)는
    //인자들을 입력받아 멤버변수인 value1, value2를 초기화 한다.
}
public class ThisConstructor {
}
