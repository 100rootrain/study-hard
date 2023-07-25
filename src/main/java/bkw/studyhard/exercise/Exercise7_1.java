package bkw.studyhard.exercise;

/**
 * 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
 * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한쌍씩 있고, 숫자가 1,3,8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다. 즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야 한다.
 */


/**
 * 1.메서드명 : shuffle
 *   기능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.
 *   반환타입 : 없음
 *   매개변수 : 없음
 *
 * 2.메서드명 : pick
 *   기능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
 *   반환타입 : SutdaCard
 *   매개변수 : int index  - 위치
 *
 * 3.메서드명 : pick
 *   기능 : 배열 cards에서 임의의 위치를 StudaCard를 반환한다.
 *   반환타입 : SutdaCard
 *   매개변수 : djqtdma
 *
 */
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        /** 7-1
         * 배열 SutdaCard를 적절히 초기화 하시오.
         */

    }


    /** 7-2
     * (1)위에 정의된 세 개의 메서드를 작성하시오.
     */







}



class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    //info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}

/**
 * 결과 : 1k,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
 *
 *
 *
 *
 * 답
 * for (int i = 0; i < cards.length; i++) {
 * int num = i % 10 + 1;
 * boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
 * cards[i] = new SutdaCard(num, isKwang);
 *
 * }
 */

