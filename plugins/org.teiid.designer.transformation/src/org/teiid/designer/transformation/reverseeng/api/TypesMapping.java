/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.transformation.reverseeng.api;

import static java.sql.Types.ARRAY;
import static java.sql.Types.BIGINT;
import static java.sql.Types.BINARY;
import static java.sql.Types.BIT;
import static java.sql.Types.BLOB;
import static java.sql.Types.BOOLEAN;
import static java.sql.Types.CHAR;
import static java.sql.Types.CLOB;
import static java.sql.Types.DATE;
import static java.sql.Types.DECIMAL;
import static java.sql.Types.DOUBLE;
import static java.sql.Types.FLOAT;
import static java.sql.Types.INTEGER;
import static java.sql.Types.LONGNVARCHAR;
import static java.sql.Types.LONGVARBINARY;
import static java.sql.Types.LONGVARCHAR;
import static java.sql.Types.NCHAR;
import static java.sql.Types.NCLOB;
import static java.sql.Types.NULL;
import static java.sql.Types.NUMERIC;
import static java.sql.Types.NVARCHAR;
import static java.sql.Types.OTHER;
import static java.sql.Types.REAL;
import static java.sql.Types.SMALLINT;
import static java.sql.Types.SQLXML;
import static java.sql.Types.TIME;
import static java.sql.Types.TIMESTAMP;
import static java.sql.Types.TINYINT;
import static java.sql.Types.VARBINARY;
import static java.sql.Types.VARCHAR;

//import java.sql.DatabaseMetaData;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A utility class that handles mappings of JDBC data types to the database types and Java
 * types. Also contains methods that provide information about JDBC types.
 */
public class TypesMapping {

    // Never use "-1" or any other normal integer, since there
    // is a big chance it is being reserved in java.sql.Types
    public static final int NOT_DEFINED = Integer.MAX_VALUE;

    // char constants for the sql data types
    public static final String SQL_ARRAY = "ARRAY";
    public static final String SQL_BIGINT = "BIGINT";
    public static final String SQL_BINARY = "BINARY";
    public static final String SQL_BIT = "BIT";
    public static final String SQL_BLOB = "BLOB";

    /**
     * @since 1.2
     */
    public static final String SQL_BOOLEAN = "BOOLEAN";

    public static final String SQL_CLOB = "CLOB";
    public static final String SQL_NCLOB = "NCLOB";
    public static final String SQL_CHAR = "CHAR";
    public static final String SQL_NCHAR = "NCHAR";
    public static final String SQL_DATE = "DATE";
    public static final String SQL_DECIMAL = "DECIMAL";
    public static final String SQL_DOUBLE = "DOUBLE";
    public static final String SQL_FLOAT = "FLOAT";
    public static final String SQL_INTEGER = "INTEGER";
    public static final String SQL_LONGVARCHAR = "LONGVARCHAR";
    public static final String SQL_LONGNVARCHAR = "LONGNVARCHAR";
    public static final String SQL_LONGVARBINARY = "LONGVARBINARY";
    public static final String SQL_NUMERIC = "NUMERIC";
    public static final String SQL_REAL = "REAL";
    public static final String SQL_SMALLINT = "SMALLINT";
    public static final String SQL_TINYINT = "TINYINT";
    public static final String SQL_TIME = "TIME";
    public static final String SQL_TIMESTAMP = "TIMESTAMP";
    public static final String SQL_VARBINARY = "VARBINARY";
    public static final String SQL_VARCHAR = "VARCHAR";
    public static final String SQL_NVARCHAR = "NVARCHAR";
    public static final String SQL_SQLXML = "SQLXML";
    public static final String SQL_OTHER = "OTHER";
    public static final String SQL_NULL = "NULL";

    // char constants for Java data types
    public static final String JAVA_LONG = "java.lang.Long";
    public static final String JAVA_BYTES = "byte[]";
    public static final String JAVA_BOOLEAN = "java.lang.Boolean";
    public static final String JAVA_STRING = "java.lang.String";
    public static final String JAVA_SQLDATE = "java.sql.Date";
    public static final String JAVA_UTILDATE = "java.util.Date";
    public static final String JAVA_BIGDECIMAL = "java.math.BigDecimal";
    public static final String JAVA_DOUBLE = "java.lang.Double";
    public static final String JAVA_FLOAT = "java.lang.Float";
    public static final String JAVA_INTEGER = "java.lang.Integer";
    public static final String JAVA_SHORT = "java.lang.Short";
    public static final String JAVA_BYTE = "java.lang.Byte";
    public static final String JAVA_TIME = "java.sql.Time";
    public static final String JAVA_TIMESTAMP = "java.sql.Timestamp";
    public static final String JAVA_BLOB = "java.sql.Blob";
    public static final String JAVA_OBJECT = "java.lang.Object";

    /**
     * Keys: SQL string type names, Values: SQL int type definitions from java.sql.Types
     */
    private static final Map<String, Integer> SQL_STRING_TYPE = new HashMap<String, Integer>();

    /**
     * Keys: SQL int type definitions from java.sql.Types, Values: SQL string type names
     */
    private static final Map<Integer, String> SQL_ENUM_TYPE = new HashMap<Integer, String>();

    /**
     * Keys: SQL int type definitions from java.sql.Types, Values: java class names
     */
    private static final Map<Integer, String> SQL_ENUM_JAVA = new HashMap<Integer, String>();

    /**
     * Keys: java class names, Values: SQL int type definitions from java.sql.Types
     */
    private static final Map<String, Integer> JAVA_SQL_ENUM = new HashMap<String, Integer>();

    static {
        SQL_STRING_TYPE.put(SQL_ARRAY, ARRAY);
        SQL_STRING_TYPE.put(SQL_BIGINT, BIGINT);
        SQL_STRING_TYPE.put(SQL_BINARY, BINARY);
        SQL_STRING_TYPE.put(SQL_BIT, BIT);
        SQL_STRING_TYPE.put(SQL_BLOB, BLOB);
        SQL_STRING_TYPE.put(SQL_BOOLEAN, BOOLEAN);
        SQL_STRING_TYPE.put(SQL_CLOB, CLOB);
        SQL_STRING_TYPE.put(SQL_NCLOB, NCLOB);
        SQL_STRING_TYPE.put(SQL_CHAR, CHAR);
        SQL_STRING_TYPE.put(SQL_NCHAR, NCHAR);
        SQL_STRING_TYPE.put(SQL_DATE, DATE);
        SQL_STRING_TYPE.put(SQL_DECIMAL, DECIMAL);
        SQL_STRING_TYPE.put(SQL_DOUBLE, DOUBLE);
        SQL_STRING_TYPE.put(SQL_FLOAT, FLOAT);
        SQL_STRING_TYPE.put(SQL_INTEGER, INTEGER);
        SQL_STRING_TYPE.put(SQL_LONGVARCHAR, LONGVARCHAR);
        SQL_STRING_TYPE.put(SQL_LONGNVARCHAR, LONGNVARCHAR);
        SQL_STRING_TYPE.put(SQL_LONGVARBINARY, LONGVARBINARY);
        SQL_STRING_TYPE.put(SQL_NUMERIC, NUMERIC);
        SQL_STRING_TYPE.put(SQL_REAL, REAL);
        SQL_STRING_TYPE.put(SQL_SMALLINT, SMALLINT);
        SQL_STRING_TYPE.put(SQL_TINYINT, TINYINT);
        SQL_STRING_TYPE.put(SQL_TIME, TIME);
        SQL_STRING_TYPE.put(SQL_TIMESTAMP, TIMESTAMP);
        SQL_STRING_TYPE.put(SQL_VARBINARY, VARBINARY);
        SQL_STRING_TYPE.put(SQL_VARCHAR, VARCHAR);
        SQL_STRING_TYPE.put(SQL_NVARCHAR, NVARCHAR);
        SQL_STRING_TYPE.put(SQL_OTHER, OTHER);
        SQL_STRING_TYPE.put(SQL_NULL, NULL);
        SQL_STRING_TYPE.put(SQL_BINARY, java.sql.Types.JAVA_OBJECT);
 

        SQL_ENUM_TYPE.put(ARRAY, SQL_ARRAY);
        SQL_ENUM_TYPE.put(BIGINT, SQL_BIGINT);
        SQL_ENUM_TYPE.put(BINARY, SQL_BINARY);
        SQL_ENUM_TYPE.put(BIT, SQL_BIT);
        SQL_ENUM_TYPE.put(BOOLEAN, SQL_BOOLEAN);
        SQL_ENUM_TYPE.put(BLOB, SQL_BLOB);
        SQL_ENUM_TYPE.put(CLOB, SQL_CLOB);
        SQL_ENUM_TYPE.put(NCLOB, SQL_NCLOB);
        SQL_ENUM_TYPE.put(CHAR, SQL_CHAR);
        SQL_ENUM_TYPE.put(NCHAR, SQL_NCHAR);
        SQL_ENUM_TYPE.put(DATE, SQL_DATE);
        SQL_ENUM_TYPE.put(DECIMAL, SQL_DECIMAL);
        SQL_ENUM_TYPE.put(DOUBLE, SQL_DOUBLE);
        SQL_ENUM_TYPE.put(FLOAT, SQL_FLOAT);
        SQL_ENUM_TYPE.put(INTEGER, SQL_INTEGER);
        SQL_ENUM_TYPE.put(LONGVARCHAR, SQL_LONGVARCHAR);
        SQL_ENUM_TYPE.put(LONGNVARCHAR, SQL_LONGNVARCHAR);
        SQL_ENUM_TYPE.put(LONGVARBINARY, SQL_LONGVARBINARY);
        SQL_ENUM_TYPE.put(NUMERIC, SQL_NUMERIC);
        SQL_ENUM_TYPE.put(REAL, SQL_REAL);
        SQL_ENUM_TYPE.put(SMALLINT, SQL_SMALLINT);
        SQL_ENUM_TYPE.put(TINYINT, SQL_TINYINT);
        SQL_ENUM_TYPE.put(TIME, SQL_TIME);
        SQL_ENUM_TYPE.put(TIMESTAMP, SQL_TIMESTAMP);
        SQL_ENUM_TYPE.put(VARBINARY, SQL_VARBINARY);
        SQL_ENUM_TYPE.put(VARCHAR, SQL_VARCHAR);
        SQL_ENUM_TYPE.put(NVARCHAR, SQL_NVARCHAR);
        SQL_ENUM_TYPE.put(SQLXML, SQL_SQLXML);
        SQL_ENUM_TYPE.put(OTHER, SQL_OTHER);
        SQL_ENUM_TYPE.put(NULL, SQL_NULL);
        SQL_ENUM_TYPE.put(java.sql.Types.JAVA_OBJECT, SQL_BINARY);

        
        SQL_ENUM_JAVA.put(BIGINT, JAVA_LONG);
        SQL_ENUM_JAVA.put(BINARY, JAVA_BYTES);
        SQL_ENUM_JAVA.put(BIT, JAVA_BOOLEAN);
        SQL_ENUM_JAVA.put(BOOLEAN, JAVA_BOOLEAN);
        SQL_ENUM_JAVA.put(BLOB, JAVA_BYTES);
        SQL_ENUM_JAVA.put(CLOB, JAVA_STRING);
        SQL_ENUM_JAVA.put(NCLOB, JAVA_STRING);
        SQL_ENUM_JAVA.put(CHAR, JAVA_STRING);
        SQL_ENUM_JAVA.put(NCHAR, JAVA_STRING);
        SQL_ENUM_JAVA.put(DATE, JAVA_UTILDATE);
        SQL_ENUM_JAVA.put(DECIMAL, JAVA_BIGDECIMAL);
        SQL_ENUM_JAVA.put(DOUBLE, JAVA_DOUBLE);
        SQL_ENUM_JAVA.put(FLOAT, JAVA_FLOAT);
        SQL_ENUM_JAVA.put(INTEGER, JAVA_INTEGER);
        SQL_ENUM_JAVA.put(LONGVARCHAR, JAVA_STRING);
        SQL_ENUM_JAVA.put(LONGNVARCHAR, JAVA_STRING);
        SQL_ENUM_JAVA.put(LONGVARBINARY, JAVA_BYTES);
        SQL_ENUM_JAVA.put(NUMERIC, JAVA_BIGDECIMAL);
        SQL_ENUM_JAVA.put(REAL, JAVA_FLOAT);
        SQL_ENUM_JAVA.put(SMALLINT, JAVA_SHORT);
        SQL_ENUM_JAVA.put(TINYINT, JAVA_SHORT);
        SQL_ENUM_JAVA.put(TIME, JAVA_UTILDATE);
        SQL_ENUM_JAVA.put(TIMESTAMP, JAVA_UTILDATE);
        SQL_ENUM_JAVA.put(VARBINARY, JAVA_BYTES);
        SQL_ENUM_JAVA.put(VARCHAR, JAVA_STRING);
        SQL_ENUM_JAVA.put(NVARCHAR, JAVA_STRING);
        SQL_ENUM_JAVA.put(SQLXML, JAVA_STRING);
        SQL_ENUM_JAVA.put(java.sql.Types.JAVA_OBJECT, JAVA_OBJECT);

        JAVA_SQL_ENUM.put(JAVA_LONG, BIGINT);
        JAVA_SQL_ENUM.put(JAVA_BYTES, BINARY);
        JAVA_SQL_ENUM.put(JAVA_BOOLEAN, BIT);
        JAVA_SQL_ENUM.put(JAVA_STRING, VARCHAR);
        JAVA_SQL_ENUM.put(JAVA_SQLDATE, DATE);
        JAVA_SQL_ENUM.put(JAVA_UTILDATE, DATE);
        JAVA_SQL_ENUM.put(JAVA_TIMESTAMP, TIMESTAMP);
        JAVA_SQL_ENUM.put(JAVA_BIGDECIMAL, DECIMAL);
        JAVA_SQL_ENUM.put(JAVA_DOUBLE, DOUBLE);
        JAVA_SQL_ENUM.put(JAVA_FLOAT, FLOAT);
        JAVA_SQL_ENUM.put(JAVA_INTEGER, INTEGER);
        JAVA_SQL_ENUM.put(JAVA_SHORT, SMALLINT);
        JAVA_SQL_ENUM.put(JAVA_BYTE, SMALLINT);
        JAVA_SQL_ENUM.put(JAVA_TIME, TIME);
        JAVA_SQL_ENUM.put(JAVA_TIMESTAMP, TIMESTAMP);

        // add primitives
        JAVA_SQL_ENUM.put("byte", TINYINT);
        JAVA_SQL_ENUM.put("int", INTEGER);
        JAVA_SQL_ENUM.put("short", SMALLINT);
        JAVA_SQL_ENUM.put("char", CHAR);
        JAVA_SQL_ENUM.put("double", DOUBLE);
        JAVA_SQL_ENUM.put("long", BIGINT);
        JAVA_SQL_ENUM.put("float", FLOAT);
        JAVA_SQL_ENUM.put("boolean", BIT);
    }

     
    /* 
     * Returns true if supplied type can have a length attribute as a part of column
     * definition.
     */
    public static boolean supportsLength(int type) {
    	        return type == Types.BINARY
    	                || type == Types.CHAR
    	                || type == Types.NCHAR
    	                || type == Types.NVARCHAR
    	                || type == Types.LONGNVARCHAR
    	                || type == Types.DECIMAL
    	                || type == Types.DOUBLE
    	                || type == Types.FLOAT
    	                || type == Types.NUMERIC
    	                || type == Types.REAL
    	                || type == Types.VARBINARY
    	                || type == Types.VARCHAR;
    }

    /**
     * Returns true if supplied type is a numeric type.
     * @param type 
     * @return boolean
     */
    public static boolean isNumeric(int type) {
        return type == BIGINT
                || type == BIT
                || type == DECIMAL
                || type == DOUBLE
                || type == FLOAT
                || type == INTEGER
                || type == NUMERIC
                || type == REAL
                || type == SMALLINT
                || type == TINYINT;
    }

    /**
     * Returns true if supplied type is a decimal type.
     * @param type 
     * @return boolean
     */
    public static boolean isDecimal(int type) {
        return type == DECIMAL
                || type == DOUBLE
                || type == FLOAT
                || type == REAL
                || type == NUMERIC;
    }

    /**
     * Returns an array of string names of the default JDBC data types.
     * @return String[]
     */
    public static String[] getDatabaseTypes() {
        Collection<String> types = SQL_STRING_TYPE.keySet();
        return types.toArray(new String[types.size()]);
    }

    /**
     * Method implements an algorithm to pick a data type from a list of alternatives that
     * most closely matches JDBC data type.
     * @param jdbcType 
     * @param alts 
     * @return String
     */
    protected static String pickDataType(int jdbcType, TypeInfo[] alts) {
        int len = alts.length;

        if (len == 0) {
            return null;
        }

        if (len == 1) {
            return alts[0].name;
        }

        // now the fun starts.. try to guess the right type

        String jdbcName = getSqlNameByType(jdbcType).toUpperCase();

        // 1. exact match
        for (TypeInfo alt : alts) {
            if (jdbcName.equalsIgnoreCase(alt.name)) {
                return alt.name;
            }
        }

        // 2. filter those with biggest precision
        long maxPrec = 0;
        for (TypeInfo alt : alts) {
            if (maxPrec < alt.precision) {
                maxPrec = alt.precision;
            }
        }

        List<TypeInfo> list = new ArrayList<TypeInfo>();
        for (TypeInfo alt : alts) {
            if (maxPrec == alt.precision) {
                list.add(alt);
            }
        }

        // work with smaller list now.....
        int slen = list.size();
        if (slen == 1) {
            return list.get(0).name;
        }

        // start/end match
        for (TypeInfo aList : list) {
            String uppercase = aList.name.toUpperCase();
            if (uppercase.startsWith(jdbcName) || uppercase.endsWith(jdbcName)) {
                return aList.name;
            }
        }

        // in the middle match
        for (TypeInfo aList : list) {
            String uppercase = aList.name.toUpperCase();

            if (uppercase.contains(jdbcName)) {
                return aList.name;
            }
        }

        // out of ideas... return the first one
        return list.get(0).name;
    }



    /**
     * Returns a String representation of the SQL type from its JDBC code.
     * @param type 
     * @return String
     */
    public static String getSqlNameByType(int type) {
        return SQL_ENUM_TYPE.get(type);
    }

 

    /**
     * Get the corresponding Java type by its java.sql.Types counterpart. Note that this
     * method should be used as a last resort, with explicit mapping provided by user used
     * as a first choice, as it can only guess how to map certain types, such as NUMERIC,
     * etc.
     * @param type 
     * 
     * @return Fully qualified Java type name or null if not found.
     */
    public static String getJavaBySqlType(int type) {
        return SQL_ENUM_JAVA.get(type);
    }

 
//    protected Map<Integer, List<TypeInfo>> databaseTypes = new HashMap<Integer, List<TypeInfo>>();
//
//    public TypesMapping(DatabaseMetaData metaData) throws SQLException {
//        // map database types to standard JDBC types
//        ResultSet rs = metaData.getTypeInfo();
//
//        try {
//            while (rs.next()) {
//                TypeInfo info = new TypeInfo();
//                info.name = rs.getString("TYPE_NAME");
//                info.jdbcType = rs.getInt("DATA_TYPE");
//                info.precision = rs.getLong("PRECISION");
//
//                Integer key = info.jdbcType;
//                List<TypeInfo> infos = databaseTypes.get(key);
//
//                if (infos == null) {
//                    infos = new ArrayList<TypeInfo>();
//                    databaseTypes.put(key, infos);
//                }
//
//                infos.add(info);
//            }
//        }
//        finally {
//            rs.close();
//        }
//
//        // do some tricks to substitute for missing datatypes
//
////        // 1. swap TIMESTAMP - DATE
////        swapTypes(TIMESTAMP, DATE);
////
////        // 2. Swap CLOB - LONGVARCHAR
////        swapTypes(CLOB, LONGVARCHAR);
////
////        // 3. Swap BLOB - LONGVARBINARY
////        swapTypes(BLOB, LONGVARBINARY);
////
////        // 4. Swap NCLOB - LONGNVARCHAR
////        swapTypes(NCLOB, LONGNVARCHAR);
//    }

//    private void swapTypes(int type1, int type2) {
//        List<TypeInfo> type1Info = databaseTypes.get(type1);
//        List<TypeInfo> type2Info = databaseTypes.get(type2);
//
//        if (type1Info != null && type2Info == null) {
//            databaseTypes.put(type2, type1Info);
//        }
//        if (type2Info != null && type1Info == null) {
//            databaseTypes.put(type1, type2Info);
//        }
//    }

    /** Stores (incomplete) information about database data type */
    static class TypeInfo {

        String name;
        int jdbcType;
        long precision;

        @Override
        public String toString() {
            return "[   TypeInfo: " + name + "\n    JDBC Type: " + TypesMapping.getSqlNameByType(jdbcType)
                    + "\n    Precision: " + precision + "\n]";
        }
    }

}
