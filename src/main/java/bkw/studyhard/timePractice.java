package bkw.studyhard;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class timePractice{
    private static final Logger logger = LoggerFactory.getLogger(timePractice.class);
    public static void main(String[] args){


        String today = null;
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sp.format(cal.getTime()));
        cal.add(Calendar.MINUTE,45);
        today = sp.format(cal.getTime());


        logger.info(today);


    }


}



