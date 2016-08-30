package com.gap.inventory.services.common;

import com.fasterxml.jackson.databind.ObjectMapper;
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
        /*Map<String,String> vals = new HashMap<>();
        vals.put("brand","4");
        vals.put("market","JPN");
        vals.put("channel","RTL");
        vals.put("level","CC");
        vals.put("code","161054006");
        RestService inst = new RestService("https://allocation-catalog-service-dev.cf.rc.gid.gap.com");
        List<String> ret = inst.getCollectionUsingPostMethod("/allocation/in-season/allocated-customer-choices/search",vals,String.class);

        RestService df = new RestService("https://demand-forecast-service-dev.cf.rc.gid.gap.com");
        inst.getObjectUsingGetMethod("/analytics/demand-forecast/customer-choice-by-weeks/{cc-id}?brandId={brd-id}&marketId={mkt-id}&channelId={chnl-id}");
        */

        RestTemplate restTemplate = new RestTemplate();
        MockRestServiceServer server = MockRestServiceServer.bindTo(restTemplate).build();

        //server.expect(ExpectedCount.manyTimes(), requestTo("/hotels/42")).andExpect(method(HttpMethod.GET))
        //        .andRespond(withSuccess("{ \"id\" : \"42\", \"name\" : \"Holiday Inn\"}", MediaType.APPLICATION_JSON));

        //Hotel hotel = restTemplate.getForObject("/hotels/{id}", Hotel.class, 42);
        // Use the hotel instance...

        // Verify all expectations met
        server.verify();

    }
}
