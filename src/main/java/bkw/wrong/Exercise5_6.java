package bkw.wrong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

class Exercise5_6 {

    public static void main(String args[]){
        Logger logger = LoggerFactory.getLogger(Exercise5_6.class);

        String[] words = {"television","computer","mouse","phone"};

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<words.length;i++){
            char[]question=words[i].toCharArray(); //String을 char[]로 변환

            //
            for(int j=0;j<question.length;j++){
                int idx = (int)(Math.random()*question.length);

                char tmp = question[i];
                question[i] = question[idx];
                question[idx] = tmp;
            }

            //
            System.out.printf("Q%d. %s의 정답을 입력하세요.>",i+1,new String(question));
            String answer = scanner.nextLine();

            //trim으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
            if(words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다..%n%n");

        }
    }
}
