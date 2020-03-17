package com.wyrhero.java8.date;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        LocalDate localDate6 = LocalDate.of(2020, 10, 13);

        System.out.println(localDate5.until(localDate4).getDays());
        System.out.println(localDate5.until(localDate5).getDays());
        System.out.println(localDate5.until(localDate6).getDays());
        System.out.println(localDate5.until(localDate6).getDays());
        System.out.println(localDate5.isAfter(localDate4));
        System.out.println(localDate5.isAfter(localDate5));
        System.out.println(localDate5.isAfter(localDate6));
        System.out.println("以下测试until");
        System.out.println(localDate.until(localDate2));
        System.out.println(localDate.until(localDate6, ChronoUnit.DAYS));
        System.out.println(LocalDate.of(2018,12,26).until(LocalDate.of(2020,01,9), ChronoUnit.DAYS));

        System.out.println("==================测试格式化日期=========================");
        LocalDate natureDay = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        String format = natureDay.format(DateTimeFormatter.ofPattern("yyyy-MM"));
        String format1 = now.format(DateTimeFormatter.ofPattern("yyyy-MM"));

        System.out.println(format);
        System.out.println(format1);


        System.out.println("==================测试LocalDate和Date互相格式化=========================");
        LocalDate localDate7 = dateToLocalDate(new Date());
        Date localDate8 = localDateToDate(LocalDate.now());
        System.out.println(localDate7);
        System.out.println(localDate8);


        System.out.println("==================测试String转LocalDate========================= yyyy-MM-dd HH:mm:ss:SSS ");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate9 = LocalDate.parse("2019-12-16", fmt);
        System.out.println(localDate9);

        List<Integer> abc = new ArrayList();
        abc.add(1);
        abc.add(2);
        abc.add(3);
        abc.add(4);
        abc.add(4);
        abc.add(4);
        Collections.reverse(abc);
        System.out.println(abc);
        Set<Integer> collect = abc.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }

    public static LocalDate dateToLocalDate(Date date){
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant,zoneId).toLocalDate();
    }

    public static Date localDateToDate(LocalDate localDate){
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(zoneId);
        return Date.from(zonedDateTime.toInstant());
    }
}
