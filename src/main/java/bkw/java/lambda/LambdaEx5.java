package bkw.java.lambda;

/**
 * 제네릭을 이용한 함수형 인터페이스
 *
 * @author : kma04
 * @fileName : LambdaEx5
 * @since : 2024-04-02
 */

@FunctionalInterface
interface MyFunction5<T>{
    void println(T x);
}
public class LambdaEx5 {
    public LambdaEx5() {
        MyFunction5<String> f1 = x -> {System.out.println(x.toString());};
        f1.println("String Generic 사용 람다식");
        f1.println("Yoon's Dev");

        MyFunction5<Integer> f2 = x -> {System.out.println(x.toString());};
        f2.println(Integer.valueOf(100));
    }
    public static void main(String[] args) {
        new LambdaEx5();
    }

}
