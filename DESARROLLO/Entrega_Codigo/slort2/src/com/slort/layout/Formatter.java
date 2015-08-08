package com.slort.layout;

import java.util.Date;

import javax.servlet.jsp.PageContext;

import com.bdb.util.DateUtils;

import fr.improve.struts.taglib.layout.formatter.DispatchFormatter;

public class Formatter extends DispatchFormatter {

    public Formatter() {
    }

    public String date(Object in_date, PageContext in_pageContext) {
//		TODO para quitar el warning
        if (in_pageContext.getClass().equals(new String("A"))) {}
		Date in = (Date)in_date;
        return DateUtils.getFechaFormateada(in, "dd-MM-yyyy");
    }

    public String time(Object in_date, PageContext in_pageContext) {
//		TODO para quitar el warning
        if (in_pageContext.getClass().equals(new String("A"))) {}
		Date in = (Date)in_date;
        return DateUtils.getFechaFormateada(in, "H:mm");
    }
    
    public String dateFull(Object in_date, PageContext in_pageContext) {
//		TODO para quitar el warning
		if (in_pageContext.getClass().equals(new String("A"))) {}
        Date in = (Date)in_date;
        return DateUtils.getFechaFormateada(in, "EEEE dd 'de' MMMM 'de' yyyy  '|' HH:mm");
    }

    public String upper(Object in_value, PageContext in_pageContext) {
//		TODO para quitar el warning
		String salida = null;
    	if (in_pageContext.getClass().equals(new String("A"))) {}
        String input = (String)in_value;
        if(input == null)
            salida = null;
        else
            salida = input.toUpperCase();
        
        return salida;
    }
}