package bkw.studyhard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testArrayList {
    public static void main(String[] args) {
/*
        String[] strs = {"alpha", "beta", "charlie"};
        System.out.println(Arrays.toString(strs));   // [alpha, beta, charlie]

        List<String> lst = Arrays.asList(strs); // new ArrayList<String>(); 대신에 사용
        System.out.println(lst);  // [alpha, beta, charlie]

        lst.add("ttt");     // error : asList()로 List를 생성하면 원소를 새롭게 추가할 수 없음

        // Changes in array or list write thru
        strs[0] += "88";
        lst.set(2, lst.get(2) + "99"); // 2번째 인덱스 원소에 charlie99 넣음
        System.out.println(Arrays.toString(strs)); // [alpha88, beta, charlie99] , lst배열에 추가햇는데 strs원본배열까지 변경됨
        System.out.println(lst);  // [alpha88, beta, charlie99]

        // Initialize a list using an array
        List<Integer> lstInt = Arrays.asList(22, 44, 11, 33);
        System.out.println(lstInt);  // [22, 44, 11, 33]

*/
        String[] strs = {"alpha", "beta", "charlie"};
        System.out.println(Arrays.toString(strs));   // [alpha, beta, charlie]

        List<String> lst = new ArrayList<String>(Arrays.asList(strs));
        System.out.println(lst);  // [alpha, beta, charlie]

        lst.add("ttt");     // 이제는 에러가 나지 않고 데이터를 추가 시킬 수 있다.

        // Changes in array or list write thru
        strs[0] += "88";
        lst.set(2, lst.get(2) + "99"); // 2번째 인덱스 원소에 charlie99 넣음
        System.out.println(Arrays.toString(strs)); // [alpha88, beta, charlie]
        System.out.println(lst);  // [alpha, beta, charlie99, ttt]

        // Initialize a list using an array
        List<Integer> lstInt = Arrays.asList(22, 44, 11, 33);
        System.out.println(lstInt);  // [22, 44, 11, 33]


    }
}
