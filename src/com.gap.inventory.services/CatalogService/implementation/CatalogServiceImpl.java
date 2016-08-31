package com.gap.inventory.services.CatalogService.implementation;

import java.io.IOException;
import java.util.*;

import com.gap.inventory.services.CatalogService.config.LoadProperties;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gap.inventory.services.CatalogService.domain.CatalogCC;
import com.gap.inventory.services.CatalogService.intrface.CatalogService;


public class CatalogServiceImpl implements CatalogService {
	
	
	@Override
	public List<CatalogCC> connect(List<Map<String,String>> input) {
		try {
			LoadProperties.initializeApplicationContext();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		String baseurl = LoadProperties.getProperty("baseUrl");
		String resource="/allocation/in-season/allocated-customer-choices/search";
		RestTemplate rstTmpl = new RestTemplate ();
		List<CatalogCC> catalogCC=null;
		HttpHeaders hdr = new HttpHeaders();
		hdr.setContentType(MediaType.APPLICATION_JSON);
		ObjectMapper obj = new ObjectMapper();
		String str = null;
		try {
			str = obj.writeValueAsString(input);
			HttpEntity<String> entity = new HttpEntity<String>(str,hdr);
			catalogCC = rstTmpl.postForObject(baseurl+resource,entity,List.class);
			
		} catch (JsonProcessingException e) {
			System.out.println("Exception:"+e.getMessage());
		}
		return catalogCC;
		
	}

}
