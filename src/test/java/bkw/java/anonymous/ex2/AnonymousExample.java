package bkw.java.anonymous.ex2;

/**
 * 외부객체.
 * Anonymous 클래스를 사용하는 외부클래스이다.
 * @author : kma04
 * @fileName : AnonymousExample
 * @since : 2024-04-03
 */
public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous a = new Anonymous();

        //방법1 : 익명객체 필드 사용
        a.spider1.attack();

        //방법2 : 익명객체 로컬 변수 사용
        a.method1();

        //방법3 :매개변수로 익명객체 사용
        a.method2(new Insect(){
            String name = "타란툴라";

            void cobweb(){
                System.out.println("그냥 마구잡이로 침");
            }

            @Override
            void attack() {
                System.out.println(name + "공격 안하고 후퇴한다.");
            }
        });
//익명객체 내부에서 새롭게 정의된 필드,메서드는 부모객체로 생성된 spider1에서 접근할 수 없음!!!
//        a.spider1.name = "왕거미"; //익명객체에서 새롭게 정의된 필드 (접근불가)
//        a.spider1.cobweb(); //익명객체에서 새롭게 정의된 메서드 (접근불가)
        a.spider1.attack(); //부모클래스 Insect에서 오버라이딩해서 재정의한 메서드 (접근가능)


    }
}
