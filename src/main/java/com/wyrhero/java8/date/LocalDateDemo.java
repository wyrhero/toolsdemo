package com.wyrhero.java8.date;


import java.time.*;

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


    }
}
