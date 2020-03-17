package com.wyrhero.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FaltMatDemo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<String> result = words.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct().collect(toList());
        System.out.println(result);


        List<Integer> numbers = Arrays.asList(2,5,1,2,7,43,2,4,6,3,2);
        Optional<Integer> reduce = numbers.stream().reduce(Integer::max);
        reduce.ifPresent(o -> System.out.println(o));

        //5.2.1  练习
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //(1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
        System.out.println("第一题");
        List<Transaction> transactions1 = transactions.stream().filter(o -> o.getYear() == 2011).sorted((Comparator.comparing(o -> Integer.valueOf(o.getValue())))).collect(toList());
        System.out.println(transactions1);


        //(2) 交易员都在哪些不同的城市工作过？
        System.out.println("第二题");
        List<String> city = transactions.stream().map(o -> o.getTrader().getCity()).distinct().collect(toList());
        System.out.println(city);


        //(3) 查找所有来自于剑桥的交易员，并按姓名排序。
        System.out.println("第三题");
        List<Trader> trader = transactions.stream().map(Transaction::getTrader).filter(o -> o.getCity().equals("Cambridge")).distinct().sorted(Comparator.comparing(o -> o.getName())).collect(toList());
        System.out.println(trader);



        //(4) 返回所有交易员的姓名字符串，按字母顺序排序。
        System.out.println("第四题");
        List<String> traderName = transactions.stream().map(o -> o.getTrader().getName()).sorted(Comparator.comparing(o -> o)).distinct().collect(toList());
        System.out.println(traderName);


        //(5) 有没有交易员是在米兰工作的？
        System.out.println("第五题");
        boolean isMilan = transactions.stream().anyMatch(o -> o.getTrader().getCity().equals("Milan"));
        System.out.println(isMilan);


        //(6) 打印生活在剑桥的交易员的所有交易额。
        System.out.println("第六题");
        transactions.stream().filter(o -> o.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue).forEach(System.out::println);


        //(7) 所有交易中，最高的交易额是多少？
        System.out.println("第七题");
        transactions.stream().map(Transaction::getValue).max(Comparator.comparing(o -> o)).ifPresent(
                o -> {
                    System.out.println(o);
                }
        );


        //(8) 找到交易额最小的交易。
        System.out.println("第八题");
        transactions.stream().map(Transaction::getValue).min(Comparator.comparing(o -> o)).ifPresent(
                o -> {
                    System.out.println(o);
                }
        );


        System.out.println("勾股定理");
        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a ->
                                IntStream.rangeClosed(a, 100)
                                        .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                                        .mapToObj(b ->
                                                new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
                        );
        pythagoreanTriples.forEach(o -> {
            System.out.println(o[0] + "-" + o[1] + "-" + o[2]);
        });

        System.out.println("Stream.of");

        Stream.of("123","456").forEach(System.out::println);

        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
      //  Stream.iterate(0,n -> (n + 1) % 1).forEach(System.out::println);

    }


}

class Trader{
    private final String name;
    private final String city;
    public Trader(String n, String c){
        this.name = n;
        this.city = c;
    }
    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }

    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }
}
class Transaction{
    private final Trader trader;
    private final int year;
    private final int value;
    public Transaction(Trader trader, int year, int value){
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    public Trader getTrader(){
        return this.trader;
    }
    public int getYear(){
        return this.year;
    }
    public int getValue(){
        return this.value;
    }
    public String toString(){
        return "{" + this.trader + ", " +
                "year: "+this.year+", " +
                "value:" + this.value +"}";
    }
}
