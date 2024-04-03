package bkw.java.anonymous.ex1;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : AminAnnonymous
 * @since : 2024-04-03
 */
public class AminAnnonymous {
    public static void main(String[] args) {
        AMin aMin = new AMin() {
            @Override
            // 외부에서 접근할 수 있도록 public 사용
            public int getMin(int x, int y) {
                if(x < y) {
                    return x;
                }else {
                    return y;
                }
            }
        };// 객체를 생성하는 것이므로 ; 필요
        System.out.println("10과 20중에서 더 작은 숫자는 " + aMin.getMin(10,20) + "입니다.");
    }
}


