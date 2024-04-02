package bkw.java.lambda;

/**
 * 메소드의 인자로 람다식 전달
 *
 * @author : kma04
 * @fileName : LambdaEx4
 * @since : 2024-04-02
 */

//함수형 인터페이스
@FunctionalInterface
interface MyFunction4 {
    int calc(int x, int y);
}

public class LambdaEx4 {
    //메소드 정의 (메소드의 인자로 람다식 전달)

    static void printMultiply(int x, int y, MyFunction4 f) {
        System.out.println("실행 결과: " + f.calc(x, y));
    }
    public LambdaEx4() {
        printMultiply(100, 100, (x, y) -> {return x * y;});
    }

    public static void main(String[] args) {
        new LambdaEx4();

    }

}