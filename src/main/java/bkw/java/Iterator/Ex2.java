package bkw.java.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Ex2
 * @since : 2024-04-11
 */
public class Ex2 {
    public static void main(String[] args) {

        // 컬렉션 생성
        ArrayList<String> cars = new ArrayList<>();
        cars.add("벤츠");
        cars.add("람보르기니");
        cars.add("쏘렌토");
        cars.add("페라리");
        cars.add("티코");

        // iterator 획득
        Iterator<String> iterator = cars.iterator();

        // while문을 사용한 경우
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.print(str + " ");
        }

        System.out.println("=====================");

        // for-each문을 사용한 경우
        for(String str : cars){
            System.out.print(str + " ");        }
    }
}
