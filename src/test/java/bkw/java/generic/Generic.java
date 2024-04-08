package bkw.java.generic;

/**
 * 제네릭의 이해
 *
 * @param <T> the type parameter
 * @author : kma04
 * @since : 2024-04-02
 */
public class Generic<T> {


    /**
     * 제네릭을 사용할 경우 Generic1 클래스에서 printValue 메소드를 3개 쓰는것을
     * 한번만 쓰면 된다.
     *
     * @param value the value
     */
    public void printValue(T value) {
        System.out.println("value is '" + value + "'");
    }

    public static void main(String[] args) {
        System.out.println("============================제네릭 사용O =============================");
        Generic<String> genericString = new Generic<>();
        genericString.printValue("Hello, world!");

        Generic<Integer> genericInteger = new Generic<>();
        genericInteger.printValue(123);

        Generic<MyValue> genericMyValue = new Generic<>();
        MyValue myValue = new MyValue();
        myValue.setHappy(500);
        genericMyValue.printValue(myValue);

        System.out.println("============================제네릭 사용X =============================");
        Generic1 generic1 = new Generic1();
        generic1.printValue(12345);
        generic1.printValue("안녕하세요.");
//        MyValue myValue = new MyValue();
        myValue.happy = 3000;
        generic1.printValue(myValue);
    }

}

class Generic1 {
    public void printValue(int value) {
        System.out.println("value is '" + value + "'");
    }

    public void printValue(String value) {
        System.out.println("value is '" + value + "'");
    }

    public void printValue(MyValue value) {
        System.out.println("value is '" + value + "'");
    }

}

class MyValue {
    Integer happy;

    public Integer getHappy() {
        return happy;
    }

    public void setHappy(Integer happy) {
        this.happy = happy;
    }

    //java에서는 모든 클래스가 java.lang.Object 클래스를 상속한다.
    //toString(), equals(Object obj), hashCode(), getClass(), finalize(), clone()
    //오버라이드로 상속한 다음, 사용자 입맛에 맞게 수정하자. 나는 happy값을 보는게 목적이라서.
    @Override
    public String toString() {
        return "MyValue{" +
                "happy=" + happy +
                '}';
    }
}