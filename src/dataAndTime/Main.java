package dataAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*long l = System.currentTimeMillis();
        System.out.println(l);

        Date date = new Date();
        *//*System.out.println("Year: " + date.getYear());
        System.out.println("Date: " + date.getDate());
        System.out.println("Day: " + date.getDay());
        System.out.println("Hours: " + date.getHours());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Minutes: " + date.getMinutes());
        System.out.println("Seconds: " + date.getSeconds());
        System.out.println("Time: " + date.getTime());
        System.out.println();
        date.setTime(1100000000L);
        System.out.println(date);
        */

        /*Date date1 = new Date(); // now (2026)
        Date date2 = new Date(1100000000L);// (1970)
        *//*System.out.println(date1.after(date2));
        System.out.println(date1.before(date2));*//*

        System.out.println(date1.compareTo(date2));//2026.compareTo(1970)
        System.out.println(date2.compareTo(date1));//1970.compareTo(2026)
*/
        //date1 > date2 => +1
        //date1 < date2 => -1
        //date1 = date2 => 0

        //Calendar
        /*Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));*/

        //LocalDate
        /*LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.parse("2020-01-08");
        System.out.println("localDate1: " + localDate1);

        boolean leapYear = localDate.isLeapYear();//kabisa yilimi yo'qmi shuni aniqlab beradi
        System.out.println("leapYear: " + leapYear);*/

        //LocalTime
        /*LocalTime localTime = LocalTime.now();
        LocalTime localTime2 = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(localTime);
        System.out.println(localTime2);
        System.out.println(localTime.isAfter(localTime2));*/

        //LocalDateTime
        /*ocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);*/

        //LocalDateTimeFormatter
        LocalDate localDate1 = LocalDate.parse("2021-11-09");
        System.out.println(localDate1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate2 = LocalDate.parse("27/11/2021", formatter);
        System.out.println(localDate2);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse("05:58:44", formatter2);
        System.out.println(localTime);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse("01/11/2022 04:58:44", formatter3);
        System.out.println(localDateTime);
    }
}
