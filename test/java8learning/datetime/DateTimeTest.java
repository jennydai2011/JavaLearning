/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8learning.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.text.DateFormatter;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Tony
 */
public class DateTimeTest {

    @Test
    public void getCurrentDate() {
        LocalDate today = DateTimeUtil.getCurrentDate();
        System.out.println(today.toString());
        assertTrue("2017-03-04".equals(today.toString()));

    }
    
    @Test
    public void getCurrentYearMonthDay(){
        LocalDate today=LocalDate.now();
        System.out.println("year:"+today.getYear());
        System.out.println("month:"+today.getMonth());
        System.out.println("day of month:"+today.getDayOfMonth());
        System.out.println("day of week:"+today.getDayOfWeek());
        System.out.println("day of year:"+today.getDayOfYear());
    }
    
    @Test
    public void getSpecificDay(){
        LocalDate someday = LocalDate.of(2017, Month.MARCH, 15);
        System.out.println("someday:"+someday);
    }
    
    @Test
    public void isDateEquals(){
        LocalDate today = LocalDate.now();
        LocalDate otherDate = LocalDate.of(2017, Month.MARCH, 04);
        assertTrue(otherDate.equals(today));
    }
    
    @Test
    public void isSpecificDay(){
        LocalDate birthday = LocalDate.of(1974, Month.MARCH, 04);
        MonthDay dob = MonthDay.of(Month.MARCH, 04);
        LocalDate today = LocalDate.now();
        MonthDay todayMonthDay = MonthDay.of(today.getMonth(), today.getDayOfMonth()) ;
        assertTrue(todayMonthDay.equals(dob));        
    }
    
    @Test
    public void getCurrentTime(){
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime:"+currentTime);
    }
    
    @Test
    public void getHoursLater(){
        LocalTime currentTime = LocalTime.now();
        System.out.println("2 hours time:"+currentTime.plusHours(2));
    }
    
    @Test
    public void getWeeksLater(){
        LocalDate today = LocalDate.now();
        System.out.println("2 weeks later:"+today.plus(2, ChronoUnit.WEEKS));
        
    }
    
    @Test
    public void getDateFromString(){
        String dayAfterTomorrow = "20170306";
        LocalDate formatted = LocalDate.parse(dayAfterTomorrow, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("Date genereated from string %s is %s %n", dayAfterTomorrow, formatted);
        
    }
    
    @Test
    public void getDateFromAnyFormat(){
        String goodFriday ="Apr 18 2014";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
        LocalDate holiday = LocalDate.parse(goodFriday, formatter);
        System.out.println("holiday is:"+holiday);
    }
}
