package com.example.datesorter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DateSorter sorter = new DateSorter();
        List<LocalDate> dates = new ArrayList<>(Arrays.asList(
                LocalDate.parse("2005-07-01"),
                LocalDate.parse("2005-01-02"),
                LocalDate.parse("2005-01-01"),
                LocalDate.parse("2005-05-03")
        ));
        Collection<LocalDate> sortedDates = sorter.sortDates(dates);
        sortedDates.forEach(System.out::println);
    }
}
/*
        Expected result
        2005-01-01
        2005-01-02
        2005-07-01
        2005-05-03
*/
