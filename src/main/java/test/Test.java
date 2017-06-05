package test;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by lijie on 17/6/1.
 */
public class Test {
    public static void main(String[] args) throws Exception{
        String date = "Thu Jun 01 16:55:52 CST 2017";
        SimpleDateFormat sdf=new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK);
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        System.out.println(sdf.parse(date));
    }
}
