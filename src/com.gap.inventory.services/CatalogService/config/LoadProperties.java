package com.gap.inventory.util;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.io.FileInputStream;

public final class LoadProperties {
  private static Properties configProperties;

  private LoadProperties() {
    
  }
  public static String getProperty(final String propertyName) {
    String value = configProperties.getProperty(propertyName);
    if (value != null) {
      value = value.trim();
    }
    return value;
  }
  public static synchronized void initializeApplicationContext() throws IOException {
	  if (configProperties == null) {
	      configProperties = new Properties();
	      String configFile="C:/opt/apps/AllocTuning/conf/configPeteService.properties";
	
	      final InputStream inputStream=new FileInputStream(configFile);
	      if (inputStream != null) {
	          configProperties.load(inputStream);
	        }
	      }
	    }
  }