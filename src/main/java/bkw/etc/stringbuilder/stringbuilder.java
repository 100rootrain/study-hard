package bkw.etc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class stringbuilder {
    private static Logger logger = LoggerFactory.getLogger(stringbuilder.class);

    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abcd").append("근우");
        String str = stringBuilder.toString();
        logger.info(str);
        logger.info(stringBuilder.toString());

        //StringBuilder 초기화
        stringBuilder.setLength(0);

        ArrayList<String> list =  new ArrayList<>();

        for(int i=0; i<5; i++){
            list.add(i+"번");
        }

        for(int i=0; i<list.size();i++){
            stringBuilder.append(list.get(i));
        }
        logger.info(stringBuilder.toString());

    }


}
