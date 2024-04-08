package bkw.java.lambda;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Ex1
 * @since : 2024-04-08
 */

@FunctionalInterface
interface LambdaPrinter{
//    public void print();
    public void print(String msg);
}

public class Ex1 {
    public static void main(String[] args) {
//        LambdaPrinter lp = new LambdaPrinter() {
//            @Override
//            public void print() {
//                System.out.println("익명 구현 객체 방식으로 override된 메소드");
//            }//구현
//        };
//        lp.print(); //호출

//        LambdaPrinter lp = () -> System.out.println("이것이 람다식");
//        lp.print(); // 호출

        LambdaPrinter p1 = (String msg) ->{
            System.out.println(msg);
        };
        p1.print("lambda 1........");

        LambdaPrinter p2 = (String msg)-> System.out.println(msg);
        p2.print("lambda 2........");

        LambdaPrinter p3 = (msg)-> System.out.println(msg);
        p3.print("lambda 3........");

        LambdaPrinter p4 = msg -> System.out.println(msg);
        p4.print("lambda 4........");

    }

}
