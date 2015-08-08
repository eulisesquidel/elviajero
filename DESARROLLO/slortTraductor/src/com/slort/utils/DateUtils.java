package com.slort.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

public class DateUtils {
    private static final Logger log;

    static  {
        log = Logger.getLogger( com.slort.utils.DateUtils.class);
    }
	
    public DateUtils() {
    }

    private static long MILLIS_POR_DIA = 1000 * 60 * 60 * 24;
    
    public static long deltaDias( Date desde, Date hasta ) {
      long deltaMillis = hasta.getTime() - desde.getTime();
      
      return deltaMillis / MILLIS_POR_DIA;
    }
    
    public static String getFechaActual() {
        String ret = null;
        ret = getFechaActual("dd-MM-yyyy");
        log.debug("getFechaActual() retorna " + ret);
        return ret;
    }
    
    

    
    
    public static String getAnioyyyy() {
        String ret = null;
        ret = getFechaActual("yyyy");
        log.debug("getFechaActual() retorna " + ret);
        return ret;
    }
    
    public static String getMesMM() {
        String ret = null;
        ret = getFechaActual("MM");
        log.debug("getFechaActual() retorna " + ret);
        return ret;
    }
    
    
    public static String getFechaActual1() {
        String ret = null;
        ret = getFechaActual("dd-MM-yyyy");
        log.debug("getFechaActual() retorna " + ret);
        return ret;
    }

    public static String sumarRestarfechaActual(Integer dias) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String ret = null;
        Calendar c1 = Calendar.getInstance();
        c1.add(Calendar.DATE, dias);
        ret = sdf.format(c1.getTime()); 
        log.debug("getFechaActual(dd-MM-yyyy) retorna " + ret);
        return ret;
    }
    

    
    public static String getFechaActual(String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        String ret = null;
        ret = sdf.format(new Date());
        log.debug("getFechaActual(" + formato + ") retorna " + ret);
        return ret;
    }
    
    
    public static Date getFechaActualasDate() {
        
    	log.debug("getFechaActual(" + new Date() + ") retorna ret"  +  new Date());
        String ret = null;
        return new Date();
    }
    

    
    public static String getFechaFormateada(Date fecha) {
        String convertedDateString = "";
        convertedDateString = getFechaFormateada(fecha, "dd-MM-yyyy");
        convertedDateString = getFechaFormateadaUpper(convertedDateString, "dd-MM-yyyy");
        log.debug("getFechaFormateada() retorna " + convertedDateString);
        return convertedDateString;
    }

    public static String getFechaFormateada(Date fecha, String formato) {
        String convertedDateString = "";
        if(fecha != null) {
            SimpleDateFormat displayDateFormat = new SimpleDateFormat(formato);
            convertedDateString = displayDateFormat.format(fecha);
            convertedDateString = getFechaFormateadaUpper(convertedDateString, formato);
            log.debug("getFechaFormateada(" + fecha.toString() + ", " + formato + ") retorna " + convertedDateString);
        }
        return convertedDateString;
    }

    

    public static Date getFechaFormateada(String fecha, String formato) {
        Date date = null;
        try {
            SimpleDateFormat sdfInput = new SimpleDateFormat(formato);
            date = sdfInput.parse(fecha);
            log.debug("getFechaFormateada() retorna " + date.toString());
        }
        catch(Exception e) {
            log.error(e.toString());
        }
        return date;
    }

    public static Date getFechaFormateada(String fecha) {
        Date date = null;
        try {
            if(fecha != null) {
                SimpleDateFormat sdfInput = new SimpleDateFormat("dd-MM-yyyy");
                date = sdfInput.parse(fecha);
                log.debug("getFechaFormateada() retorna " + date.toString());
            }
        }
        catch(Exception e) {
            log.error(e.toString());
        }
        return date;
    }

    public static String getFechaFormateadaUpper(String sDate, String sFormat) {
        int pos;
        if((pos = sFormat.toUpperCase().indexOf("MMM")) > 0)
            try {
                sDate = sDate.substring(0, pos) + sDate.substring(pos, pos + 1).toUpperCase() + sDate.substring(pos + 1);
            }
            catch(Exception exception) { }
        if((pos = sFormat.toUpperCase().indexOf("EEE")) > 0)
            try {
                sDate = sDate.substring(0, pos) + sDate.substring(pos, pos + 1).toUpperCase() + sDate.substring(pos + 1);
            }
            catch(Exception exception1) { }
        log.debug("getFechaFormateadaUpper(" + sDate + ", " + sFormat + ") retorna " + sDate);
        return sDate;
    }
    
    
    public static long DateDiffMinutes(Date fechaUno, Date fechaDos){
        long diff = fechaUno.getTime() -  fechaDos.getTime();
        return (diff / (60 * 1000));
    }
    
    public static Date sumarRestarfechaActualHoras(Date fechahora, int horas) {
    	
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String ret = null;
        Calendar c1 = Calendar.getInstance();
        c1.setTime(fechahora);
        c1.add(Calendar.HOUR, horas);
        log.debug("sumarRestarfechaActualHoras (dd-MM-yyyy  HH:mm:ss) retorna " + sdf.format(c1.getTime()));
        return c1.getTime(); 
    }
    
    
}