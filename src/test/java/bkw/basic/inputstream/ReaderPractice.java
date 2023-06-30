package bkw.basic.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderPractice {
    public static void main(String[] args) {
        Reader r1 = new InputStreamReader(System.in);
        // 그냥 Read 메소드는 한개의 문자를 읽고
        // int 형 타입으로 리턴한다.

        int temp = -1;// 입력받을 문자를 임시로 담아둘 변수
        System.out.println("문자를 입력하세요 - - - >");
        try{
            while((temp = r1.read()) != -1){// -1이면 더이상 받을 문자열이 없음
                char ch1 = (char) temp;
                // 때문에 read로 받은 문자를 읽을려면
                // (char) 같이 강제 형변환을 해주어야 한다.
                System.out.println(ch1);

            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                r1.close();// 사용끝났으면 닫아주기
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}

/*
- 정의
Reader는 FileReader / BufferedReader / InputStreamReader의 최상위 클래스이다.

- 특징
Reader reader = System.in;
기존의 inputstream은 System.in을 매개 값으로 받아 객체를 생성할 수 있었다.
하지만 Reader 클래스의 경우 문자열 스트림이기 때문에 직접적으로 inputstream을 받아들일 수 없고 반드시 문자열 스트림 타입으로 변환된 자식 클래스를 받아들여야지 객체가 생성된다.
( Reader 역시 추상 클래스이기 때문에 자기 자신을 new 연산자를 통해 객체를 생성할 수 없다.)


Reader r1 = new InputStreamReader(System.in);
선언시 Reader의 자식 클래스와 이 자식 클래스의 생성자에 inputstream을 넣어주어 문자열 기반 스트림으로 변경된 객체를 만들게 된다.

- read () 메소드
read 메서드는 한 개의 문자를 읽고 이를 int형으로 리턴하게 된다.
여기서 temp 변수는 이러한 read메서드로 리턴된 인트형 데이터를 담아둘 변수이며,
이 temp 값이 -1일 경우 받은 문자 데이터가 더 이상 없다는 의미이기 때문에 while문이 종료되게 된다.
이후 문자 char형으로 강제 타입 변환을 하면, read로 입력받은 문자 데이터를 확인할 수 있다.
(Hello를 입력받아 각각 하나의 char형 데이터 ( H, e, l, l, o)로 분해되어 출력되는 것을 알 수 있다.)

*/
