package com.bdb.util;

import java.math.BigDecimal;

public class NumberUtils {

    public NumberUtils() {
    }

    public static Double roundUp(Double valor, int prec) {
        double ret = roundUp(valor.doubleValue(), prec);
        return new Double(ret);
    }

    public static double roundUp(double valor, int prec) {
        BigDecimal ret = new BigDecimal(valor);
        ret = ret.setScale(prec, 4);
        return ret.doubleValue();
    }

    public static Double roundDown(Double valor, int prec) {
        double ret = roundDown(valor.doubleValue(), prec);
        return new Double(ret);
    }

    public static double roundDown(double valor, int prec) {
        BigDecimal ret = new BigDecimal(valor);
        ret = ret.setScale(prec, 1);
        return ret.doubleValue();
    }
    
    public static boolean isDouble(String cadena){
    	try {
    		Double.parseDouble(cadena);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
    	}
    }
}