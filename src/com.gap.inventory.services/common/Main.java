package com.gap.inventory.services.common;

import com.fasterxml.jackson.databind.ObjectMapper;

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
        vals.put("brand","4");
        vals.put("market","JPN");
        vals.put("channel","RTL");
        vals.put("level","CC");
        vals.put("code","161054006");
        RestService inst = new RestService("https://allocation-catalog-service-dev.cf.rc.gid.gap.com");
        List<String> ret = inst.getCollectionUsingPostMethod("/allocation/in-season/allocated-customer-choices/search",vals,String.class);
    }
}
