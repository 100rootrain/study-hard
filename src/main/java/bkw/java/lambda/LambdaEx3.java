package bkw.java.lambda;

/**
 * 매개변수가 없는 람다식 만들기
 *
 * @author : kma04
 * @fileName : LambdaEx3
 * @since : 2024-04-02
 */

//함수형 인터페이스
@FunctionalInterface
interface MyFunction3 {
    void print();
}
public class LambdaEx3 {


    public LambdaEx3() {
        //MyFunction3 fprint = () -> {System.out.println("abcdefg");};
        MyFunction3 fprint = () -> System.out.println("abcdefg");// 한문장이면서 return을 하지않으므로 {} 안감싸도 된다.
        fprint.print();
    }
    public static void main(String[] args) {
        new LambdaEx3();
    }

}


