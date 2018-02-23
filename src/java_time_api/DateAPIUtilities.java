package java_time_api;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/*
Create By: Ron Rith
Create Date: 2/23/2018
*/
public class DateAPIUtilities {
    public static void main(String args[]) {
        LocalDate today = LocalDate.now();

        System.out.println("Year: " + today.getYear() + " Leap Year: " + today.isLeapYear());

        System.out.println("Today is before 01/01/2015? " + today.isBefore(LocalDate.of(2015, 01, 01)));
        System.out.println("10 days after today will be: " + today.plusDays(10));
        System.out.println("3 weeks after today will be: "+today.plusWeeks(3));
        System.out.println("20 months after today will be: "+today.plusMonths(20));
        System.out.println("10 days before today will be: "+today.minusDays(10));
        System.out.println("3 weeks before today will be: "+today.minusMonths(3));
        System.out.println("20 months before today will be: "+today.minusMonths(20));
        System.out.println("First date of this month will be: "+today.with(TemporalAdjusters.firstDayOfMonth()));

        LocalDate lastDaysOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last day of this year will be: "+lastDaysOfYear);

        Period period = today.until(lastDaysOfYear);
        System.out.println("Period format: " + period);
        System.out.println("Month remaining in the year: " + period.getMonths());
    }
}
