package com.ali;

import java.util.Calendar;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("YA Ali   ");
        Calendar calendar = Calendar.getInstance();
        //calendar.add(Calendar.DAY_OF_YEAR,170);
        int i = calendar.get(Calendar.MONTH) +1;
        System.out.println(calendar.get(Calendar.YEAR) + "   " + i + "   " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(Utilities.getCurrentShamsidate(271));
    }


    public boolean f1() {
        return true;
    }

}
