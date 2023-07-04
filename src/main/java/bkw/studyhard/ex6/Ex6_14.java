package bkw.studyhard.ex6;

import java.util.HashMap;

public class Ex6_14 {
    static{//클래스 초기화 블럭
        System.out.println("static {}");
    }

    {//인스턴스 초기화 블럭
        System.out.println("{}");
    }
    public Ex6_14(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("ex6_14 bt = new Ex6_14();");
        Ex6_14 bt = new Ex6_14();
        bt.map.put(1,1);
        bt.map.put(3,1);
        System.out.println(bt.map);

        System.out.println("ex6_14 bt2 = new Ex6_14();");
        Ex6_14 bt2 = new Ex6_14();
        System.out.println(bt2.map);
    }

    //
    HashMap<Integer,Integer> map;

     {
        map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);

    }

}
