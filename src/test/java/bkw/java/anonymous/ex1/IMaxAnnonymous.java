package bkw.java.anonymous.ex1;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : IMaxAnnonymous
 * @since : 2024-04-03
 */
public class IMaxAnnonymous {
    public static void main(String[] args) {
        IMax iMax = new IMax() {
            @Override
            // 외부에서 접근할 수 있도록 public 사용
            public int getMax(int x, int y) {
                return (x > y) ? x : y;
            }
        };// 객체를 생성하는 것이므로 ; 필요

        System.out.println("10과 20중에서 더 큰 숫자는 " + iMax.getMax(10,20) + "입니다.");

    }
}
