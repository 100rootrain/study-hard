package bkw.studyhard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Exercise5_4 {
    // Log4j Logger
    private static final Logger logger = LoggerFactory.getLogger(Exercise5_4.class);
    public static void main(String[] args){
        int[][]  arr={
                {5,5,5,5,5},
                {10,10,10,10,10,321},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total =0;
        float average = 0;

        //2차원 배열 arr에 담긴 모든 값의 총합, 평균 구하기
        int column=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                total += arr[i][j];
                column++;
            }
        }

        average = (total / (float)column);
//        float average1 = ((float)total / column);


        logger.info("column : "+ column);
        logger.info("total="+total);
        logger.info("average="+average);
//        logger.info("average1="+average1);

    }
}
