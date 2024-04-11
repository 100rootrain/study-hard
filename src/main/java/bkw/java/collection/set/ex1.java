package bkw.java.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : ex1
 * @since : 2024-04-11
 */

public class ex1 {

    public static void main(String[] args){
//        toArray();
//        addAll();
//        retainAll();
        retainAll2();
    }

    private static void toArray() {
        HashSet<Integer> hs = new HashSet<Integer>();
        Random rm = new Random();

        for (int i = 0; i < 10; i++) {
            hs.add(rm.nextInt(10));
        }
        System.out.println("hs.size() : " + hs.size());

        Integer[] array = hs.toArray(new Integer[hs.size()]);

        for (Integer itm : array) {
            System.out.println(itm);
        }

    }

    private static void addAll() {
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> hs3 = new HashSet<Integer>();
        Random rm = new Random();

        for (int i = 0; i < 10; i++) {
            hs.add(rm.nextInt(10));
            hs3.add(rm.nextInt(10));
        }
        System.out.println("hs : " + hs);
        System.out.println("hs3 : " + hs3);
        System.out.println(hs3.containsAll(hs)); // hs3에 hs 전체가 포함돼있으면 true 아닐경우 false

        hs3.addAll(hs);//h3 요소에 hs요소를 합친다. 중복X
        System.out.println(hs3);
//        System.out.println(hs3.containsAll(hs)); // hs+hs3 라서 무조건 true가 나온다.
    }

    private static void retainAll() {
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> hs3 = new HashSet<Integer>();

        hs.add(2);
        hs.add(3);

        hs3.add(0);
        hs3.add(1);
        hs3.add(8);
        hs3.add(4);
        System.out.println(hs3.retainAll(hs));
        System.out.println("hs3: " + hs3);
    }

    private static void retainAll2(){
        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
        list1.add("AA");
        list1.add("BB");
        list1.add("CC");
        list1.add("DD");

        ArrayList<String> list2 = null;
        try{
            list2.retainAll(list1);
            list1.retainAll(list2);
        }catch(Exception e){
            e.printStackTrace();
        }


        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }

}
