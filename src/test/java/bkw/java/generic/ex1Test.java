package bkw.java.generic;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : ex1Test
 * @since : 2024-04-08
 */
public class ex1Test {
    public static void main(String[] args) {
        //T는 인스턴스를 생성할때 구체적인 타입으로 변경 된다.
        Test<String> test1 = new Test<>();
        test1.setGenericTest("test입니다.");
        String str = test1.getGenericTest();
        System.out.println(str);

        Test<Integer> test2 = new Test<>();
        test2.setGenericTest(995959);
        int num = test2.getGenericTest();
        System.out.println(num);

        //제네릭은 클래스를 설계할 때 구체적인 타입을 명시하지 않고,
        // 타입 파라미터로 대체했다가 실제 클래스가 사용될 때 구체적인 타입을 지정함으로써
        // 타입변환을 최소화 시킨다.

    }
}
