package com.gap.inventory.services.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gap.inventory.services.DF.config.DemandForecastFactory;
import com.gap.inventory.services.DF.domain.DemandForecast;
import com.gap.inventory.services.DF.intrface.IDemandForecast;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.ExpectedCount;
import org.springframework.web.context.request.WebRequest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Hpatki on 8/29/2016.
 */
public class Main implements Serializable
{
    private String b;
    private int a;

    public int geta ()
    {
        return a;
    }

    public String getb ()
    {
        return b;
    }

    public static void main (String[] args) throws Exception
    {
        Map<String,String> vals = new HashMap<>();
        vals.put("brd-id","4");
        vals.put("mkt-id","JPN");
        vals.put("chnl-id","RTL");
        vals.put("cc-id","123456");
        //vals.put("code","161054006");
        /*RestService inst = new RestService("https://allocation-catalog-service-dev.cf.rc.gid.gap.com");
        List<String> ret = inst.getCollectionUsingPostMethod("/allocation/in-season/allocated-customer-choices/search",vals,String.class);
        */
        IDemandForecast dfinst = DemandForecastFactory.createService();
        DemandForecast df = dfinst.getForecast(vals);
        List<DemandForecast> dfCollection = dfinst.getForecastCollection(vals);
        DemandForecast fcst = dfCollection.get(0);

    }
}
