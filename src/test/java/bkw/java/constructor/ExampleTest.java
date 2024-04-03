package bkw.java.constructor;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Example
 * @since : 2024-04-03
 */
// 기본 생성자는 아무 매개변수도 없고 내용도 없는 간단한 생성자이다.
class Example {
    // 클래스에 명시적으로 구현된 생성자가 없다면
    // 이와 같은 기본 생성자가 추가되어 컴파일된다.
//     Example() {}

    int val;
    Example(int x){
        val = x;
    }


}


public class ExampleTest {
    public static void main(String[] args) {
//        Example ex1 = new Example();
//        System.out.println(ex1);
/**
 * Example 클래스를 확인해보면 이미 Example(int x) 생성자를 가지고 있다.
 * 그렇기 때문에 컴파일러는 이미 생성자가 존재하기에 기본 생성자를 추가해주지 않는다.
 * 기본 생성자가 없는데 main 함수에서는 기본 생성자를 사용해 인스턴스를 생성하려 하기 때문에 에러가 발생한다.
 *
 * 만약에 Example클래스에 매개변수와 내용이 없는 생성자를 구현할 경우에
 * 상기의 생성자생성은 오류없이 컴파일된다.
 */
        Example ex = new Example(10);
        System.out.println(ex.val);
    }

}





