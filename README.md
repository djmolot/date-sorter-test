# DateSorter
DateSorter is an implementation of interface IDateSorter.

The Date sorter interface, implement the single method within this interface:

Collection<LocalDate> sortDates(List<LocalDate> unsortedDates);

The implementation of this method should sort dates. The output should be in the following order: Dates with an 'r' in the month, sorted ascending (first to last), then dates without an 'r' in the month, sorted descending (last to first). For example, October dates would come before May dates, because October has an 'r' in it. thus: (2005-07-01, 2005-01-02, 2005-01-01, 2005-05-03) would sort to (2005-01-01, 2005-01-02, 2005-07-01, 2005-05-03)