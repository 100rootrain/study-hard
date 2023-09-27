package bkw.studyhard.exercise;


import nonapi.io.github.classgraph.json.JSONUtils;

class outer{
    static class Inner{
        int iv = 200;
    }
}
public class Exercise7_7 {

    public static void main(String[] args) {


    }



}

//    Outer o  = new Outer();
//    outer.Inner ii = new outer.Inner();
//    System.out.println(ii.iv);

/*
스태틱 클래스 는 (static inner class) 인스턴스 클래스와 달리 외부 클래스의 인스턴스를 생성하지 않고도 사용할 수 있다
마치 static 멤버를 인스턴스 생성없이 사용할 수 있는 것처럼.
 */