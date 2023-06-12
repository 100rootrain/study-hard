package bkw.wrong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//못풀었던문제
public class Exercise5_5 {
    private static Logger logger = LoggerFactory.getLogger(Exercise5_5.class);
    public static void main(String[] args){
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        //배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
        for(int i=0; i<ballArr.length; i++){
            int j = (int)(Math.random()*ballArr.length);
            int tmp = 0;

            //
            tmp = ballArr[i];
            ballArr[i]=ballArr[j];
            ballArr[j]=tmp;

        }

        //배열 ballArr의 앞에서 3개의 수를 배열 ba113로 복사한다.
        for(int i=0; i<ball3.length;i++){
            System.arraycopy(ballArr,0,ball3,0,3);
        }


    }
}
