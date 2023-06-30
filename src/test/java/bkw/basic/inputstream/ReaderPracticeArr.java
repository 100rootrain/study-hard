package bkw.basic.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderPracticeArr {
    public static void main(String[] args) {
        Reader r1 = new InputStreamReader(System.in);
        char[] cArr = new char[5];
        // Reader의 read 메소드는 문자열만 받기 때문에
        // 문자열 배열을 매개값으로 받는다.

        int temp = -1;

        System.out.println("문자를 입력하세요 - - - >");

        try{
            while((temp = r1.read(cArr))!=-1){// -1이면 더이상 받을 문자열이 없음
                String str = new String(cArr,0,temp);
                // char 배열로 읽은 데이터를 담아야 하기 때문에
                // String에 담아야하며, 현재 받아들인 길이만큼만
                // 담아야한다. 0(처음부터) / temp(받아들인 길이까지)
                System.out.println(str);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                r1.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}

/*
- read ( char [] cArr ) 메서드


다만 한 글자 씩 데이터를 받을 경우 많은 문자열을 입력받을 경우 그에 따른 loop 횟수가 증가하여, 프로그램의 성능을 저하하게 만들 수 있다.
때문에 read 메소드는 char 형 배열을 매개 값으로 받을 수 도 있는데,
이 경우 해당 배열의 크기만큼 한 번에 문자들을 입력받아 전체적인 loop의 반복 횟수를 줄여 프로그램 성능을 향상시킬 수 있다.


*/