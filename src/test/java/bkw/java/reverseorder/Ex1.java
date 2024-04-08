package bkw.java.reverseorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Ex1
 * @since : 2024-04-08
 */
public class Ex1 {
    public static void main(String[] args) {
        // 1. 숫자 배열 역순 정렬
        Integer[] numbers = {5,2,8,1,9,3,6};

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("역순 정렬된 숫자 배열" + Arrays.toString(numbers));

        // 2. 문자열 리스트
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("orange");

        Collections.sort(words, Collections.reverseOrder());
        System.out.println(words);

    }
}
