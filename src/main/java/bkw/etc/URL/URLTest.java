package bkw.etc.URL;

import java.io.BufferedReader;

//해당 URL 객체와 연결을 생성하고 연결을 읽어들이는 InputStream 객체 반환
import java.io.InputStream;
import java.io.InputStreamReader;

//URL(Uniform Resource Locator):웹상의 자원을 가리키는 pointer
//자원은 파일, 폴더, 쿼리와 같은 객체 등이 포함됨
import java.net.URL;

public class URLTest {
    public URLTest(String s) throws Exception{
        //URL 클래스 객체 생성
        URL url = new URL(s);

        //접속한 컴퓨터의 스트림 이용
        InputStream in = url.openStream();

        // 데이터를 가져와서 저장 후 콘솔에 출력
        String ss;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        //데이터를 계속 읽어들일 수 있는 상태라면 콘솔에 출력
        while((ss=br.readLine()) !=null){
            System.out.println(ss);
            // 파일에 출력 : FileOutputStram, FileWriter
        }

        //스트림 사용 후 메모리 해제
        in.close();
        br.close();

    }

    public static void main(String[] args) throws Exception{
        //URL Test 객체 생성
        //URLTest ult = new URLTest("https://www.naver.com");
        //URLTest ult = new URLTest("http://www.naver.com"); //차단한 경우 302 Found 코드출력
        //URLTest ult = new URLTest("https://www.garmin.co.kr/");
        //URLTest ult = new URLTest("https://www.strava.com/athletes/59903138");
    }
}
