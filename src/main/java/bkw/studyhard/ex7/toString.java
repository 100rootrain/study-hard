package bkw.studyhard.ex7;

public class toString {
   static class Card{
        String kind;
        int number;

        Card(String kind, int number){
            this.kind=kind;
            this.number=number;
        }// 인스턴스 변수 값 초기화 생성자

        @Override
        public String toString(){
            return "Card [kind="+kind+", number="+number +"]";
        }
    }
}

class CardToString{
    public static void main(String[] args) {
        toString.Card c1 = new toString.Card("SPADE",1);
        toString.Card c2 = new toString.Card("SPADE",2);
        toString.Card c3 = new toString.Card("SPADE",3);
        toString.Card c4 = new toString.Card("SPADE",4);
        toString.Card c5 = new toString.Card("SPADE",5);
        //객체 생성

        System.out.println("Card [kind="+c1.kind+", number="+c1.number+"]");
        System.out.println("Card [kind="+c2.kind+", number="+c2.number+"]");
        System.out.println("Card [kind="+c3.kind+", number="+c3.number+"]");
        System.out.println("Card [kind="+c4.kind+", number="+c4.number+"]");
        System.out.println("Card [kind="+c5.kind+", number="+c5.number+"]");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());


    }

}
