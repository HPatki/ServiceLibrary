package com.gap.inventory.services.common;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.ArrayList;
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
        List<Main> objects = new ArrayList<Main>();
        for (int i=0; i<1; ++i) {
            Main inst = new Main();
            inst.a = i+1;
            inst.b = "Harshad" + Integer.toString(i+1);
            objects.add(inst);
        }

        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(objects);

    }
}
