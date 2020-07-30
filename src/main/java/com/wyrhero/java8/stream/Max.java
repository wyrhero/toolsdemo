package com.wyrhero.java8.stream;

import com.wyrhero.java8.stream.domain.Student;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * stream 中的max使用
 */
public class Max {

    public static void main(String[] args) {
        Student aaa = Student.builder().name("aaa").score(100).brithDay(LocalDate.of(1979,3,26)).build();
        Student bbb = Student.builder().name("bbb").score(40).brithDay(LocalDate.of(1969,1,15)).build();
        Student ccc = Student.builder().name("ccc").score(25).brithDay(LocalDate.of(1989,6,11)).build();
        Student ddd = Student.builder().name("ddd").score(10).brithDay(LocalDate.of(1959,11,21)).build();
        Student eee = Student.builder().name("eee").score(94).brithDay(LocalDate.of(1969,5,2)).build();

        List<Student> studentList = Arrays.asList(aaa,bbb,ccc,ddd,eee);
        Optional<Student> max = studentList.stream().max(Comparator.comparingInt(Student::getScore));
        if(max.isPresent()) {
            System.out.println(max.get());
        }

        Optional<Student> max1 = studentList.stream().max(Comparator.comparing(Student::getBrithDay));
        if(max1.isPresent()) {
            System.out.println("出生日期最大");
            System.out.println(max1.get());
        }
    }


}
