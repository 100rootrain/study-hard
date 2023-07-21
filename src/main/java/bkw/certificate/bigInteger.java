package bkw.certificate;

import java.math.BigInteger;

public class bigInteger {
    public static void main(String[] args) {

        BigInteger x = new BigInteger("12345");

        BigInteger y = new BigInteger("54321");

        System.out.println(x.compareTo(y));

        int x1 = x.intValue();
        int y1 = y.intValue();

        System.out.println(Integer.compare(x1,y1)); // 기준값 < 비교값 : -1

        int a = 1;
        int b = 1;

        System.out.println(Integer.compare(a,b)); //기준값 = 비교값 : 0

        a = 2;
        b = 1;

        System.out.println(Integer.compare(a,b)); //기준값 > 비교값  : 1
    }
}
