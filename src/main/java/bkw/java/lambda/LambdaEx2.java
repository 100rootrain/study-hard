package bkw.java.lambda;

/**
 * 인자 x를 받아들여 제곱을 리턴하는 람다식 만들기
 *
 * @author : kma04
 * @fileName : LambdaEx2
 * @since : 2024-04-02
 */

//함수형 인터페이스
@FunctionalInterface
interface Myfunction2 {
    int calc(int x);
}
public class LambdaEx2 {

    public LambdaEx2() {
        //Myfunction2 fsquare = (x) -> {return x*x;};
        Myfunction2 fsquare = x -> {return x*x;};
        System.out.println("fsquare의 결과: "+fsquare.calc(5));
    }
    public static void main(String[] args) {
        new LambdaEx2();
    }

}
