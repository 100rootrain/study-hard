package bkw.etc;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : nanoTime
 * @since : 2023-07-25
 */
public class nanoTime {

    public static void main(String[] args) throws InterruptedException {

        long start = System.nanoTime();
        Thread.sleep(3000);
        long end = System.nanoTime();

        System.out.println(end-start); //ns
        System.out.println(((double)(end-start))/1000000000); //s (ns -> s 변환), ns는 읽기힘드니깐

    }


}
