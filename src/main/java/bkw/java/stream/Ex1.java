package bkw.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : ex1
 * @since : 2024-04-11
 */
public class Ex1 {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(0);

        // 컬렉션에서 스트림 생성
        Stream<Integer> stream = list.stream();

        // forEach() 메소드를 이용한 스트림 요소의 순차 접근
        stream.forEach(System.out::println);

        String[] arr = new String[]{"넷", "하나", "셋", "둘"};

        // 배열에서 스트림 생성
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(e-> System.out.print(e + " "));
        System.out.println();

        // 배열의 특정 부분만을 이용한 스트림 생성
        Stream<String> stream2 = Arrays.stream(arr,1,3);
        stream2.forEach(e-> System.out.print(e + " "));

    }

}
