package com.itheima.utils;

import com.alibaba.druid.util.StringUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

//自定义类型转换器：实现字符串转timestamp类型
@Component
public class StringToTimeStampConverter implements Converter<String, Timestamp> {

    @Override
    public Timestamp convert(String source) {
        try {
            //判断
            if (StringUtils.isEmpty(source)) {
                return null;
            }
            Date date =  new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(source);
            //创建时间戳
            Timestamp timestamp = new Timestamp(date.getTime());
            return timestamp;
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }


}
