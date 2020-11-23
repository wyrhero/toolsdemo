package com.wyrhero.java8.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {
        //初始化
        Optional<String> stringOptinal = Optional.empty();
        //输出 Optional.empty
        System.out.println(stringOptinal);
        //抛异常
        //System.out.println(systemOptinal.get());
        //非空赋值
        stringOptinal = Optional.of("123");
        //输出 Optional[123]   看来不可以直接输出
        System.out.println(stringOptinal);
        //输出 123
        System.out.println(stringOptinal.get());

        //嵌套Optional
        Optional<Optional<String>> testOptinal = Optional.of(stringOptinal);
        //使用Optional.map进行获取数据  map提取后会重新封装到一个Optional中
        Optional<String> optionalS = testOptinal.map(Optional::get);
        //输出 123
        System.out.println(optionalS.get());

        Optional<String> sss = stringOptinal.map(String::toString);
        //输出 123
        System.out.println(sss.get());

        //测试缺失值时候自动赋默认值
        Optional<String> ccc = Optional.empty();
        System.out.println(ccc.orElse("没有值"));

        //测试缺失值的时候抛异常
        /*ccc.orElseThrow(() ->
            new Exception("异常")
        );*/

        //测试  void ifPresent(Consumer<? super T> consumer)
        stringOptinal.ifPresent(o -> {
            //输出 123
            System.out.println(o);
        });

        //测试  void ifPresent(Consumer<? super T> consumer)
        //输出 123
        stringOptinal.ifPresent(System.out::println);


    }
}
