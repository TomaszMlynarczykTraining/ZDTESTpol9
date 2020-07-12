package dodatkowe_zadania.galaxy.rest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateExercies {

    public static void main(String[] args) {

        LocalDate date = parseToLocalDate("18.01.2018");
        LocalTime time = parseToLocalTime("12.20.20");


        // System.out.println(date);
        // System.out.println(time);

        //System.out.println(combineDateAndTime(date, time));

        //System.out.println("Is year leap year? -> " + isLeap(2012));

        //showDateInFormat("2018-06-22");

        showHowManyDaysMonthAndYear(date);

    }


    private static LocalDate parseToLocalDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(date, formatter);
    }

    private static LocalTime parseToLocalTime(String time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");
        return LocalTime.parse(time, formatter);
    }

    private static LocalDateTime combineDateAndTime(LocalDate date, LocalTime time) {
        return LocalDateTime.of(date, time);
    }

    private static boolean isLeap(int year) {
        return Year.of(year).isLeap();
    }


    private static void showDateInFormat(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Formatted date " + localDate.format(outputFormatter));
    }


    private static void showHowManyDaysMonthAndYear(LocalDate date) {
        LocalDate now = LocalDate.now();

        long days = DAYS.between(date, now);

        System.out.println("Days left: " + days);
        System.out.println("Months left: " + days / 30);
        System.out.println("Years left: " + days / 365);

    }
}
