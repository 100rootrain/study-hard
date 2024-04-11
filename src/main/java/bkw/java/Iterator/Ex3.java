package bkw.java.Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Ex3
 * @since : 2024-04-11
 */
public class Ex3 {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("벤츠");
        cars.add("람보르기니");
        cars.add("쏘렌토");
        cars.add("페라리");
        cars.add("티코");

        // while문을 사용한 경우
        Iterator<String> iterator = cars.iterator();

        while(iterator.hasNext()){
            System.out.print(" cars : " + iterator.next());
        }
        System.out.println("");
        // for-each문을 사용한 경우
        for(String car : cars){
            System.out.print(" cars : " + car);
        }

    }
}
