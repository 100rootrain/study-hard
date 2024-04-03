package bkw.java.anonymous.ex1;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : IMaxLambda
 * @since : 2024-04-03
 */
public class IMaxLambda {
    public static void main(String[] args) {
        IMax iMax = (x,y) -> x>y ? x : y;
        System.out.println("10과 20중에서 더 큰 숫자는 " + iMax.getMax(10,20) + "입니다.");
    }
}
