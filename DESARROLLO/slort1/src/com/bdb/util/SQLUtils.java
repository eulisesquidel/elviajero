package com.bdb.util;


public class SQLUtils {

    public SQLUtils() {
    }

    public static final String QUERY_OPERATOR_EQUALS = " = ";
    public static final String QUERY_OPERATOR_NOT_EQUALS = " <> ";
    public static final String QUERY_OPERATOR_IN = " IN ";
    public static final String QUERY_OPERATOR_NOT_IN = " NOT IN ";
    public static final String QUERY_OPERATOR_LIKE = " LIKE ";
    public static final String QUERY_OPERATOR_GREATER_THAN = " > ";
    public static final String QUERY_OPERATOR_LESS_THAN = " < ";
    public static final String QUERY_OPERATOR_GREATER_THAN_OR_EQUALS = " >= ";
    public static final String QUERY_OPERATOR_LESS_THAN_OR_EQUALS = " <= ";
    public static final String QUERY_OPERATOR_IS_NULL = " is null ";
    public static final String QUERY_OPERATOR_IS_NOT_NULL = " is not null ";
    public static final Byte QUERY_DATATYPE_STRING = new Byte((byte)1);
    public static final Byte QUERY_DATATYPE_LONG = new Byte((byte)2);
    public static final Byte QUERY_DATATYPE_INTEGER = new Byte((byte)3);
    public static final Byte QUERY_DATATYPE_ARRAY = new Byte((byte)4);
    public static final Byte QUERY_DATATYPE_DATE = new Byte((byte)5);
    public static final Byte QUERY_DATATYPE_BOOLEAN = new Byte((byte)6);

}