package bkw.studyhard;

public class ExampleClass {
 //   private static int staticVariable = 10; // 정적 변수

    private int instanceVariable; // 인스턴스 변수

    public void setInstanceVariable(int value) {
        this.instanceVariable = value; // 인스턴스 변수 설정
    }

//    public int getStaticVariable() {
//        return staticVariable; // 정적 변수 반환
//    }

    public static void main(String[] args) {
        ExampleClass obj = new ExampleClass(); // 인스턴스 생성

        obj.setInstanceVariable(20); // 인스턴스 변수 설정

//        int staticValue = obj.getStaticVariable(); // 정적 변수 접근

        System.out.println("Instance Variable: " + obj.instanceVariable); // 인스턴스 변수 출력
//        System.out.println("Static Variable: " + staticValue); // 정적 변수 출력
    }
}