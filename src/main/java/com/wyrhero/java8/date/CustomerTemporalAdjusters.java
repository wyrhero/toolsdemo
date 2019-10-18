package com.wyrhero.java8.date;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

public class CustomerTemporalAdjusters implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.minus(1, MONTHS).with(lastDayOfMonth());
    }

    public static TemporalAdjuster lastDayOfPreviousMonth() {
        return temporal -> temporal.minus(1, MONTHS).with(lastDayOfMonth());
    }
}
