package com.gap.inventory.services.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jndi.toolkit.url.Uri;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

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

    public <T> T getUsingPostMethod (String resource, Object objects, Class<T> type)
    {
        Object objRet = null;

        HttpHeaders hdr = new HttpHeaders();
        hdr.setContentType(MediaType.APPLICATION_JSON);
        ObjectMapper obj = new ObjectMapper();
        String str = null;
        try
        {
            str = obj.writeValueAsString(objects);
            HttpEntity<String> entity = new HttpEntity<String>(str, hdr);
            String resp = rstTmpl.postForObject(baseURL+resource,entity, String.class);

            objRet = obj.readValue (resp, type);
        }
        catch(Exception err)
        {
            //log a message
            objRet = null;
        }

        return (T)objRet;
    }
}
