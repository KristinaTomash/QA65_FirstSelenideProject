package com.sconto.utils;

import java.util.Properties;

public class PropertiesLoader {

    private static final String PROF_FILE="/test.properties";
    private  PropertiesLoader(){

    }
    public static String loadProperty(String name){
        Properties properties = new Properties();

        properties.load(PropertiesLoader.class.getResourceAsStream(PROF_FILE));

    }
}
