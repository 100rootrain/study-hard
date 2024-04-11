package bkw.java.Iterator;

import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 컬렉션의 요소 순회
 *
 * @author : kma04
 * @fileName : Ex1
 * @since : 2024-04-11
 */
public class Ex1 {


    public static void main(String[] args) {
        ex1(); // java 6 이전까지 컬렉션의 엘레먼트를 순회하기 위해 Iterator 객체 이용
        ex2(); // for each 구문을 이용해서 단순화
        ex3(); // java 8 이후 스트림을 이용한 단순화
    }


    private static void ex1() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();

            if (StringUtils.equals(value, "b")) {
                System.out.println("값: " + value);
            }

        }
    }

    public static void ex2() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c"));

        for(String value : list){
            if(StringUtils.equals(value,"b")){
                System.out.println("값 : " + value);
            }
        }
    }

    public static void ex3(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
        list.stream()
                .filter("b"::equals)
                .forEach(System.out::println);
    }
}