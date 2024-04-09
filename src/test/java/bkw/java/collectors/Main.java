package bkw.java.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collectors.joining() 탐구
 *
 * @author : kma04
 * @fileName : Main
 * @since : 2024-04-09
 */
public class Main {
    public static void main(String[] args) {

        // 1.원시문자 charArray를 문자열로 변환
        char[] charArray = {'J','a','v','a','c'};

        String string = Stream.of(charArray)
                .map(arr -> new String(arr))
                .collect(Collectors.joining());
        System.out.println(string);

        /*
        
        * Stream.of(charArray) : char배열을 스트림으로 변환
        * .map(arr -> new String(arr)) : 각 char 배열을 String으로 변환
        * .collect(Collectors.joining()) : 해당 변환된 문자열 결합
        *
        * */


        // 2. 'Character' 목록을 문자열로 변환
        List<Character> chars = Arrays.asList('A','b','z');

        string = chars.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(string);

        // 2. 과 동일한 소스
        List<Character> chars2 = Arrays.asList('A','b','z');

        StringBuilder sb = new StringBuilder();
        for(Character character : chars2){
            sb.append(character);
        }
        String st = sb.toString();
        System.out.println(st);

    }
}
