package bkw.java.lambda;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Ex2
 * @since : 2024-04-09
 */
public class Ex2 {
    public static void main(String[] args) {
        String str = "VACBDZE";

        String[] stringArr = str.split(""); // new String[] {"V","A","C","B","D","Z","E"}
//        for(var i=0; i<stringArr.length; i++){
//            System.out.println(stringArr[i]);
//        }

        String streamSortAsc = Stream.of(stringArr).sorted().collect(Collectors.joining());
        String streamSortDesc = Stream.of(stringArr).sorted(Comparator.reverseOrder()).collect(Collectors.joining());

        //Lambda
        String streamSortAscLambda = Stream.of(stringArr).sorted((a1, a2) -> a1.compareTo(a2)).collect(Collectors.joining());
        String streamSortDescLambda = Stream.of(stringArr).sorted(((o1, o2) -> o2.compareTo(o1))).collect(Collectors.joining());

        System.out.println(streamSortAsc);
        System.out.println(streamSortDesc);
        System.out.println(streamSortAscLambda);
        System.out.println(streamSortDescLambda);

    }
}
