package com.gap.inventory.services.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jndi.toolkit.url.Uri;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Hpatki on 8/29/2016.
 */
public class RestService
{
    private String baseURL;
    private RestTemplate rstTmpl;

    public RestService (String baseURI)
    {
        baseURL = baseURI;
        rstTmpl = new RestTemplate ();
    }

    public <T> T getObjectUsingPostMethod (String resource, Object objects, Class<T> type)
    {
        String response = invokeHTTP(resource,objects);
        ObjectMapper obj = new ObjectMapper();
        Object objRef = null;
        try
        {
            objRef = obj.readValue(response, type);
        }
        catch(Exception err)
        {
            objRef = null;
        }

        return (T)objRef;
    }

    public <T> List<T> getCollectionUsingPostMethod (String resource, Object objects, Class<T> type)
    {
        String response = invokeHTTP(resource, objects);
        ObjectMapper obj = new ObjectMapper();
        Object objRef = null;
        try
        {
            objRef = obj.readValue(response, new TypeReference<List<T>>() {});
        }
        catch(Exception err)
        {

        }
        return (List<T>)objRef;
    }

    public <T> T getObjectUsingGetMethod (String resource, Class<T> type)
    {
         return null;
    }

    public <T> T getCollectionUsingGetMethod (String resource, Class<T> type)
    {
         return null;
    }

    private String invokeHTTP (String resource, Object objects)
    {
        String resp = null;

        HttpHeaders hdr = new HttpHeaders();
        hdr.setContentType(MediaType.APPLICATION_JSON);
        ObjectMapper obj = new ObjectMapper();

        try
        {
            String str = obj.writeValueAsString(objects);
            HttpEntity<String> entity = new HttpEntity<String>(str, hdr);
            resp = rstTmpl.postForObject(baseURL+resource,entity, String.class);
        }
        catch(Exception err)
        {
            //log a message
            resp = null;
        }

        return resp;
    }
}
