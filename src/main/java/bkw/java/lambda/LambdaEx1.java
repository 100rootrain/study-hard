package bkw.java.lambda;

/**
 * 인자 x, y를 받아들여 x+y를 리턴하는 람다식 만들기
 *
 * @author : kma04
 * @fileName : LamdaEx1
 * @since : 2024-04-02
 */

@FunctionalInterface //함수형 인터페이스
interface MyFunction {
    int calc(int x, int y);
}

public class LambdaEx1 /*extends Math*/{

    public LambdaEx1() {

//        MyFunction f = new MyFunction() {
//
//            @Override
//            public int calc(int x, int y) {
//                return x+y;
//            }
//
//        };

        MyFunction f1 = (x, y) -> {
            return x + y;
        };
        System.out.println("f1의 결과: " + f1.calc(22, 100));

        MyFunction f2 = (x, y) -> {
            return x - y;
        };
        System.out.println("f2의 결과: " + f2.calc(99, 9));


//        System.out.println(calc(10,20));
//        System.out.println(square(2));
    }

    public static void main(String[] args) {
        new LambdaEx1();
    }

}

