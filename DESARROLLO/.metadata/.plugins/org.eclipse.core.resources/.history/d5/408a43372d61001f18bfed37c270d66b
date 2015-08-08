package com.slort.test;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class UtilDate
{   	
	public static final int FORMATO_DD_MM_YYYY = 1;
	public static final int FORMATO_MM_DD_YYYY = 2;
	public static final int FORMATO_YYYY_MM_DD = 3;

    public static final Date sumarDias(Date fecha, int dias)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(5, dias);
        return cal.getTime();
    }

    public static final Date sumarDiasSinFinDeSemana(Date fecha, int dias)
    {
        int diasAux = dias;
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        while(diasAux > 0) 
            if(cal.get(7) == 6)
            {
                cal.add(5, 2);
            } else
            {
                cal.add(5, 1);
                diasAux--;
            }
        return cal.getTime();
    }

    public static final long diffFechas(Date fecha_ini, Date fecha_fin)
    {
        long dif = fecha_fin.getTime() - fecha_ini.getTime();
        return dif / 1000L / 60L / 60L / 24L;
    }

    public static final int diffFechasMeses(Date fecha_ini, Date fecha_fin)
    {
        int dif = 0;
        Integer mes_ini = new Integer((new SimpleDateFormat("MM")).format(fecha_ini));
        Integer mes_fin = new Integer((new SimpleDateFormat("MM")).format(fecha_fin));
        if(mes_fin.intValue() < mes_ini.intValue())
            mes_fin = new Integer(mes_fin.intValue() + 12);
        dif = mes_fin.intValue() - mes_ini.intValue();
        return dif;
    }

    public static final Date inicioMes(Date fecha)
    {
        Integer mes = new Integer((new SimpleDateFormat("MM")).format(fecha));
        Integer anio = new Integer((new SimpleDateFormat("yyyy")).format(fecha));
        String aux = new String("01/" + mes.toString() + "/" + anio.toString());
        return parseDate(aux);
    }

    public static final Date inicioMesSiguiente(Date fecha)
    {
        Integer mes = new Integer((new SimpleDateFormat("MM")).format(fecha));
        Integer anio = new Integer((new SimpleDateFormat("yyyy")).format(fecha));
        Integer mes_fin = new Integer(mes.intValue() + 1);
        String aux = new String("01/");
        if(mes_fin.intValue() > 12)
            aux = aux + "01/" + (new Integer(anio.intValue() + 1)).toString();
        else
            aux = aux + mes_fin.toString() + "/" + anio.toString();
        return parseDate(aux);
    }

    public static DateFormat getDateFormat()
    {
        return DateFormat.getDateInstance(3, new Locale("es", "AR"));
    }

    public static String formatDate(java.sql.Date fecha)
    {
        return formatDate(new Date(fecha.getTime()));
    }

    public static String formatDate(Date fecha)
    {
        DateFormat daf = getDateFormat();
        return daf.format(fecha);
    }

    public static String formatDateLong(Date fecha)
    {
        DateFormat daf = DateFormat.getDateInstance(1, new Locale("es", "AR"));
        return daf.format(fecha);
    }

    public static String formatTime(Date fecha)
    {
        SimpleDateFormat sdaf = new SimpleDateFormat("HH:mm:ss");
        return sdaf.format(fecha);
    }

    public static Date parseDate(String fecha)
    {
        try
        {
            DateFormat daf = getDateFormat();
            return daf.parse(fecha);
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
	/**
	 * 
	 * @param fecha //String de la forma que define el parametro formato.
	 * @param formato
	 * @return
	 */
    public static String convertirFechaSinFormato(String fecha, int formato)
    {
        String auxfecha[] = new String[3];
        switch(fecha.length())
        {
        case 8: 
            auxfecha[0] = "" + fecha.charAt(0) + fecha.charAt(1);
            auxfecha[1] = "" + fecha.charAt(2) + fecha.charAt(3);
            auxfecha[2] = "" + fecha.charAt(4) + fecha.charAt(5) + fecha.charAt(6) + fecha.charAt(7);
            break;

        case 7: 
            auxfecha[0] = "0" + fecha.charAt(0);
            auxfecha[1] = "" + fecha.charAt(1) + fecha.charAt(2);
            auxfecha[2] = "" + fecha.charAt(3) + fecha.charAt(4) + fecha.charAt(5) + fecha.charAt(6);
            break;

        default:
            return "No"; //"Debe ingresar una fecha válida"
        }
        return formatearFecha(auxfecha, formato);
    }
    
	public static Calendar convertirStringACalendar(String fecha, int formato)
	{
		Calendar cale = Calendar.getInstance();
      
        if(fecha.length() == 10)
        {
			switch(formato)
			{
			case 1: 
				cale.set(Calendar.DAY_OF_MONTH,Integer.parseInt(fecha.substring(0,2)));
				cale.set(Calendar.MONTH,Integer.parseInt(fecha.substring(3,5))-1);
				cale.set(Calendar.YEAR,Integer.parseInt(fecha.substring(6,10)));
				break;
			case 2: 
				cale.set(Calendar.MONTH,Integer.parseInt(fecha.substring(0,2))-1);
				cale.set(Calendar.DAY_OF_MONTH,Integer.parseInt(fecha.substring(3,5)));
				cale.set(Calendar.YEAR,Integer.parseInt(fecha.substring(6,10)));
				break;
			case 3: 
				/**cale.set(Calendar.MONTH,fecha.substring(0,1));
				cale.set(Calendar.DAY_OF_MONTH,fecha.substring(3,4));
				cale.set(Calendar.YEAR,fecha.substring(5,9));
				fechaParseada = fecha[2] + "-" + fecha[1] + "-" + fecha[0];*/
				break;
			}
        }
        else
        	System.out.println("Error en el formato de fecha");
		return cale;
	}
    
    public static String convertirCalendarAString(Calendar fecha, int formato)
    {
        String auxfecha[] = new String[3];
        if(fecha != null)
        {
            if(fecha.get(5) < 10)
                auxfecha[0] = "0" + fecha.get(5);
            else
                auxfecha[0] = "" + fecha.get(5);
            int mes = fecha.get(2) + 1;
            if(mes < 10)
                auxfecha[1] = "0" + mes;
            else
                auxfecha[1] = "" + mes;
            auxfecha[2] = "" + fecha.get(1);
            return formatearFecha(auxfecha, formato);
        } else
        {
            return null;
        }
    }
	
	/**
	 * @param fecha //String de 5 o 6 caracteres en el orden "dmmaaaa" o "ddmmaaaa" 
	 * @param formato
	 * @return String fecha con el formato que se dio como parametro 
	 */
	
    public static String setFormato(String fecha, int formato)
    {
        String auxfecha[] = new String[3];
        switch(fecha.length())
        {
        case 0:
			return "No";
        case 8: 
            auxfecha[0] = "" + fecha.charAt(0) + fecha.charAt(1);
            auxfecha[1] = "" + fecha.charAt(2) + fecha.charAt(3);
            auxfecha[2] = "" + fecha.charAt(4) + fecha.charAt(5) + fecha.charAt(6) + fecha.charAt(7);
            break;

        case 7: 
            auxfecha[0] = "0" + fecha.charAt(0);
            auxfecha[1] = "" + fecha.charAt(1) + fecha.charAt(2);
            auxfecha[2] = "" + fecha.charAt(3) + fecha.charAt(4) + fecha.charAt(5) + fecha.charAt(6);
            break;
        default:
            return "Debe ingresar una fecha válida";
        }
        return formatearFecha(auxfecha, formato);
    }
	
	//*** METODOS PRIVADOS ***//
	private static String formatearFecha(String fecha[], int formato)
	{
		String fechaParseada;
 
		if(fecha != null)
			switch(formato)
			{
			case 1: 
				fechaParseada = fecha[0] + "-" + fecha[1] + "-" + fecha[2];
				break;

			case 2: 
				fechaParseada = fecha[1] + "-" + fecha[0] + "-" + fecha[2];
				break;

			case 3: 
				fechaParseada = fecha[2] + "-" + fecha[1] + "-" + fecha[0];
				break;

			default:
				fechaParseada = "Debe especificar un formato de fecha válido";
				break;
			}
		else
			fechaParseada = "Debe especificar un formato de fecha válido";
		return fechaParseada;
	}
}