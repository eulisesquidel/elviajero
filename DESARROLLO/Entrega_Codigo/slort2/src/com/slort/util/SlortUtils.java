// Decompiled by DJ v3.7.7.81 Copyright 2004 Atanas Neshkov  Date: 20/06/2004 11:12:34 p.m.
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3) nonlb 
// Source File Name:   SlortUtils.java

package com.slort.util;

// import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SlortUtils {

    public SlortUtils() {
    }


    public static int getActualYear() {
        Calendar today = Calendar.getInstance();
        // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        return today.get(1);
    }

    public static String getMaxAnio() {
        int actualYear = getActualYear();
        return "" + (actualYear + 10);
    }
    
    
}