package com.itheima.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtils {
    public static Date stringToDate(String str,String pattern){
        try {
            return new SimpleDateFormat(pattern).parse(str);
        } catch (ParseException e) {
           throw new RuntimeException(e);
        }
    }

}
