package bkw.java.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Ex2
 * @since : 2024-04-08
 */
public class Ex2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hi");
        String str = (String) list.get(0); // 제네릭을 사용하지 않으면, 필요에 따라 매번 형변환을 해야 된다.

        List<String> list1 = new ArrayList<>();
        list1.add("hi");
        String str1 = list1.get(0);  //제네릭을 사용하면 형변환이 필요없다.
    }
}
