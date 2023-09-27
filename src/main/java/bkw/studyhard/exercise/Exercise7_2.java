package bkw.studyhard.exercise;


public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

//        System.out.println(deck.pick(0));
//        System.out.println(deck.pick());
        deck.shuffle();
        System.out.println();

        for(int i=0; i<deck.cards.length;i++){
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();
//        System.out.println(deck.pick(0));
    }

}


/**
 *     void shuffle(){
 *         for(int i=0; i<cards.length;i++){
 *             int j = (int)(Math.random()*cards.length);
 *
 *             //cards[i]와 cards[j]의 값을 서로 바꾼다.
 *             SutdaCard tmp = cards[i];
 *             cards[i] = cards[j];
 *             cards[j] = tmp;
 *         }
 *     }
 *
 *     SutdaCard pick(int index){
 *         if(index<0||index>=CARD_NUM) // index의 유효성을 검사한다.
 *             return null;
 *         return cards[index];
 *     }
 *
 *     SutdaCard pick(){
 *         int index = (int)(Math.random()*cards.length);
 *         return pick(index); //pick(int index)를 호출한다.
 *     }
 */