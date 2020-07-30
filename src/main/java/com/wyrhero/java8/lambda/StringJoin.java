package com.wyrhero.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringJoin {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> collect = list.stream().filter(o -> o.length() > 0).collect(Collectors.toSet());
        System.out.println(collect);
       /* list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        String result = list.stream().collect(Collectors.joining("-"));
        System.out.println(result);

        result = null;
      switch (result){
          case "":
              System.out.println(1111);
              break;
          case "123":
              System.out.println(222);
              break;
          default:
              System.out.println(444);
              break;

      }
        List<Integer> integers = Arrays.asList(1);*/
    }
}
