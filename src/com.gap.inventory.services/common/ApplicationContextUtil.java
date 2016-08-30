package com.gap.inventory.services.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Created by Hpatki on 8/29/2016.
 */
public class ApplicationContextUtil
{
    private static Properties configProperties;

    private ApplicationContextUtil() {
        //Dummy constructor to avoid creation of object for this class.
    }

    public boolean getBooleanProperty(final String propertyName) {
        final String value = getProperty(propertyName);
        boolean returnValue = false;
        if (value != null) {
            returnValue = Boolean.parseBoolean(value);
        }
        return returnValue;
    }

    public double getDoubleProperty(final String propertyName) {
        final String value = getProperty(propertyName);
        double returnValue = 0;
        if (value != null) {
            try {
                returnValue = Double.parseDouble(value);
            } catch (final NumberFormatException e) {
                returnValue = 0;
            }
        }
        return returnValue;
    }

    public int getIntProperty(final String propertyName) {
        final String value = getProperty(propertyName);
        int returnValue = 0;
        if (value != null) {
            try {
                returnValue = Integer.parseInt(value);
            } catch (final NumberFormatException e) {
                returnValue = 0;
            }
        }
        return returnValue;
    }

    public List<String> getListProperty(final String propertyName, final String delimiter) {
        List<String> returnValue = null;
        final String value = configProperties.getProperty(propertyName);
        if (value != null) {
            final String[] values = value.split(delimiter);
            returnValue = Arrays.asList(values);
        }
        return returnValue;
    }


    public static String getProperty(final String propertyName) {
        String value = configProperties.getProperty(propertyName);
        if (value != null) {
            value = value.trim();
        }
        return value;
    }

    public static void initializeApplicationContext() throws IOException
    {
        String configFile = "config/services.properties";
        initializeApplicationContext(configFile);
    }

    public static synchronized void initializeApplicationContext(final String... configFiles) throws IOException
    {
        if (configProperties == null)
        {
            for (final String configFile : configFiles)
            {
                final InputStream inputStream=new FileInputStream(configFile);
                if (inputStream != null)
                {
                    configProperties.load(inputStream);
                }
            }
        }
    }
}
