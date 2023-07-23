package bkw.etc.InetAddress;

import java.net.InetAddress;//ip 정보를 가지고 있는 네트워크 클래스


public class GetMyIpAddress {
    public static void main(String[] args) throws Exception{
        InetAddress myIp = InetAddress.getLocalHost(); //Local Host의 주소를 반환 (Local Host : 현재 사용 중인 컴퓨터 )
        System.out.println("호스트 주소 : "+myIp.getHostAddress());
        System.out.println("호스트 이름 : "+myIp.getHostName());

        myIp = InetAddress.getByName("java.sun.com"); // 해당 host의 도메인 주소와 IP주소를 담은 InetAddress 객체변환
        System.out.println("호스트 주소 : "+myIp.getHostAddress());
        System.out.println("호스트 이름 : "+myIp.getHostName());

        InetAddress sw[] = InetAddress.getAllByName("musinsa.com"); // host의 모든 도메인 주소/IP주소를 담은 InetAddress 객체를 배열로 변환
        for(InetAddress temp_sw : sw){
            System.out.println("호스트 이름 : "+temp_sw.getHostName()+" 호스트 주소 : "+temp_sw.getHostAddress());


        }
    }
}
