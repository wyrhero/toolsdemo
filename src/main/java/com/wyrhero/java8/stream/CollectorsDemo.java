package com.wyrhero.java8.stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsDemo {

    public static void main(String[] args) {
        IntStream range = IntStream.rangeClosed(1, 10);
        //List<Integer> collect = range.boxed().collect(Collectors.toList());
        //System.out.println(range.count());
        //System.out.println(range.boxed().collect(Collectors.maxBy(Integer::compareTo)));
        //System.out.println(range.boxed().collect(Collectors.summarizingInt(Integer::intValue)));
        //System.out.println(range.boxed().collect(Collectors.summingInt(Integer::intValue)));
        //System.out.println(range.boxed().map(o -> o.toString()).collect(Collectors.joining(",")));
        System.out.println(range.sum());
    }
}
