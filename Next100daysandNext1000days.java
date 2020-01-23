package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Next100daysandNext1000days {

    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_MONTH, 100);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(month+1+" "+dayOfMonth+" "+weekday+" "+year);

        //next 1000 days
        GregorianCalendar Mybirthday = new GregorianCalendar(1999,Calendar.JANUARY, 8);
        Mybirthday.add(Calendar.DAY_OF_MONTH, 1000);
        int dayOfMonth1 = Mybirthday.get(Calendar.DAY_OF_MONTH);
        int month1 = Mybirthday.get(Calendar.MONTH);
        int year1 = Mybirthday.get(Calendar.YEAR);
        int weekday1 = Mybirthday.get(Calendar.DAY_OF_WEEK);
        System.out.println(month1+1+" "+dayOfMonth1+" "+weekday1+" "+year1);

    }
}
