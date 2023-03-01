package com.example.datesorter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DateSorter implements IDateSorter {
    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> rDates = new ArrayList<>();
        List<LocalDate> nonRDates = new ArrayList<>();

        for (LocalDate date : unsortedDates) {
            String month = date.getMonth().name().toLowerCase();
            if (month.contains("r")) {
                rDates.add(date);
            } else {
                nonRDates.add(date);
            }
        }

        rDates.sort(null);

        Comparator<LocalDate> descendingComparator = Collections.reverseOrder();
        nonRDates.sort(descendingComparator);

        List<LocalDate> sortedDates = new ArrayList<>();
        sortedDates.addAll(rDates);
        sortedDates.addAll(nonRDates);

        return sortedDates;
    }
}
