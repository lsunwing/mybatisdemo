package com.liuwei.mybatisdemo.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DataTimeUtil {

    public static String DATE_FORMAT_0 = "yyyy-MM-dd";
    public static String DATE_FORMAT_1 = "yyyy/MM/dd";
    public static String DATE_FORMAT_2 = "yyyyMMdd";

    public static String DATE_TIME_FORMAT_0 = "yyyy-MM-dd HH:mm:ss";
    public static String DATE_TIME_FORMAT_1 = "yyyy/MM/dd HH:mm:ss";
    public static String DATE_TIME_FORMAT_2 = "yyyyMMddHHmmss";

    private static Map<String, DateFormat> formatMap = new HashMap<>();

    static String getCurrentDateTime() {
        return getCurrentDateTime(DATE_TIME_FORMAT_0);
    }

    static String getCurrentDateTime(String pattern) {
        DateFormat format = getDateFormat(pattern);
        return format.format(new Date());
    }

    private static DateFormat getDateFormat(String pattern) {
        DateFormat format = formatMap.get(pattern);
        if (format == null) {
            format = new SimpleDateFormat(pattern);
            formatMap.put(pattern, format);
        }
        return format;
    }

    /***
     * 返回当前日,如：26
     * @return
     */
    public static String getCurrentDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
    }

    public static void main(String[] args) {
        System.out.println(getCurrentDateTime());
    }
}
