package com.wyrhero.java8.date;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.temporal.TemporalAdjusters.*;

public class LocalDateDemo {
    public static void main(String[] args) {
        //初始化日期
        LocalDate localDate = LocalDate.of(2019,10,31);
        LocalDate localDate2 = LocalDate.of(2018,11,18);

        //时间间隔
        Period period = Period.between(localDate,localDate2);
        LocalDate localDate1 = localDate.plusMonths(4);
        System.out.println(localDate1);
        System.out.println(localDate.plusMonths(5));
        System.out.println(localDate1.plusMonths(1));
        System.out.println(localDate);
        System.out.println(period);

        //时间调整
        LocalDate localDate3 =  LocalDate.of(2019,10,31);
        LocalDate with = localDate3.with(new CustomerTemporalAdjusters());
        //自定义的时间调整器 获取上个月的最后一天
        LocalDate with1 = localDate3.with(CustomerTemporalAdjusters.lastDayOfPreviousMonth());

        System.out.println(with);
        System.out.println(with1);

        System.out.println("==================测试相隔天数=========================");
        LocalDate localDate4 = LocalDate.of(2019, 10, 11);
        LocalDate localDate5 = LocalDate.of(2019, 10, 12);
        LocalDate localDate6 = LocalDate.of(2019, 10, 13);
        LocalDate localDate7 = dateToLocalDate(new Date());
        System.out.println(localDate5.until(localDate4).getDays());
        System.out.println(localDate5.until(localDate5).getDays());
        System.out.println(localDate5.until(localDate6).getDays());
        System.out.println(localDate5.until(localDate7).getDays());

        System.out.println("==================测试格式化日期=========================");
        LocalDate natureDay = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        String format = natureDay.format(DateTimeFormatter.ofPattern("yyyy-MM"));
        String format1 = now.format(DateTimeFormatter.ofPattern("yyyy-MM"));

        System.out.println(format);
        System.out.println(format1);


    }

    public static LocalDate dateToLocalDate(Date date){
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant,zoneId).toLocalDate();
    }
}
