package com.gap.inventory.services.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

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
        String response = invokePOST(resource, objects);
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
        String response = invokePOST(resource, objects);
        return deSerialise(response, type);
    }

    public <T> T getObjectUsingGetMethod (String resource, Class<T> type, Map<String,?> params)
    {
        List<HttpMessageConverter<?>> converters = new ArrayList<>();
        converters.add(new MappingJackson2HttpMessageConverter());
        rstTmpl.setMessageConverters(converters);

        T obj1 = rstTmpl.getForObject(baseURL+resource, type, params);

        resetConverters();

        return obj1;
    }

    public <T> List<T> getCollectionUsingGetMethod (String resource, Class<T> type, Map<String,?> params)
    {
        String obj1 = rstTmpl.getForObject(baseURL+resource, String.class, params);
        return deSerialise(obj1, type);

    }

    private void resetConverters ()
    {
        List<HttpMessageConverter<?>> converters = new ArrayList<>();

        //necessitated
        converters.add(new ByteArrayHttpMessageConverter());
        converters.add(new StringHttpMessageConverter());
        converters.add(new ResourceHttpMessageConverter());
        converters.add(new SourceHttpMessageConverter());
        converters.add(new AllEncompassingFormHttpMessageConverter());

        rstTmpl.setMessageConverters(converters);
    }

    private String invokePOST (String resource, Object objects)
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

    private <T> List<T> deSerialise (String response, Class<T> type)
    {
        ObjectMapper obj = new ObjectMapper();
        Object objRef = null;
        try
        {
            objRef = obj.readValue(response, obj.getTypeFactory().constructCollectionType(List.class, type));
        }
        catch(Exception err)
        {
            objRef = null;
        }

        return (List<T>)objRef;
    }
}
