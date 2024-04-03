package bkw.java.anonymous.ex2;

/**
 * 자식객체 : 익명클래스
 * Insect를 상속받아서 구현한다.
 * @author : kma04
 * @fileName : Annoymous
 * @since : 2024-04-03
 */
public class Anonymous {

    //방법1 : 필드에 익명자식 객체를 생성
    Insect spider1 = new Insect(){
      String name = "무당거미";

      void cobweb(){
          System.out.println("사각형으로 거미줄을 침");
      }

        @Override
        void attack() {
            System.out.println(name + "독을 발사한다.");
        }
    };


    //방법2 : 로컬변수의 초기값으로 대입
    void method1(){
        Insect spider2 = new Insect(){
            String name = "늑대거미";
            void cobweb(){
                System.out.println("육각형으로 거미줄을 침");
            }

            @Override
            void attack() {
                System.out.println(name + "앞니로 문다.");
            }
        };

        spider2.attack(); //로컬변수이기 때문에 메서드에서 바로 사용
    }

    //방법3 : 익명객체 매개변수로 대입
    void method2(Insect spider){
        spider.attack();
    }

}
