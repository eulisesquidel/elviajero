package com.bdb.util;

public class BDBUtils {

    public BDBUtils() {
    }

    public static boolean isEmpty(Long value) {
        return isEmpty(value, true);
    }

    public static boolean isEmpty(Long value, boolean zeroIsEmpty) {
        return value == null || zeroIsEmpty && value.equals(Long.valueOf("0"));
    }

    public static boolean isEmpty(Integer value) {
        return isEmpty(value, true);
    }

    public static boolean isEmpty(Integer value, boolean zeroIsEmpty) {
        return value == null || zeroIsEmpty && value.equals(Integer.valueOf("0"));
    }

    public static boolean isEmpty(String value) {
        return value == null || "".equals(value);
    }

    public static Object updateDetect(Object value) {
        if(value instanceof String)
            return isEmpty((String)value) ? null : value;
        if(value instanceof Long)
            return isEmpty((Long)value) ? null : value;
        if(value instanceof Integer)
            return isEmpty((Integer)value) ? null : value;
        else
            return null;
    }
    
    
    public static String AdaptarCamposNulos(Object pdato){
    	//System.out.println(pdato.getClass().getName());
    	if (pdato ==null) return "";
    	return pdato.toString();
    }
   
    public static String AdaptarCamposNulos(Object pdato, String tipo){
    	//System.out.println(pdato.getClass().getName());
    	if (pdato ==null){
    		if (tipo.equals("Numerico"))
    			return "0";
    		else
    			return "";
    	}
    	return pdato.toString();
    }
    
    public static String AdaptarLike(String pdato){
    	return '%' + pdato+'%';
    }
    
    public static String AdaptarLikeIZQ(String pdato){
    	return '%' + pdato;
    }

    public static String AdaptarLikeDER(String pdato){
    	return pdato+'%';
    }
}