package com.wyrhero.java8.stream.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class Student {
    private String name;
    private Integer score;
    private LocalDate brithDay;
}
