package com.gap.inventory.services.CatalogService.implementation;

import java.io.IOException;
import java.util.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gap.inventory.services.CatalogService.domain.CatalogCC;
import com.gap.inventory.services.CatalogService.intrface.ICatalogService;
import com.gap.inventory.services.common.ApplicationContextUtil;
import com.gap.inventory.services.common.RestService;

public class CatalogServiceImpl implements ICatalogService {
	private RestService endPoint;
	public CatalogServiceImpl ()
    {
        String baseURL = ApplicationContextUtil.getProperty ("baseurl");
        endPoint = new RestService(baseURL);
    }
	@Override
	public CatalogCC getCCInfo(Map<String,String> input) {
		
		String resource = ApplicationContextUtil.getProperty ("ccSearch");
		CatalogCC response=endPoint.getObjectUsingPostMethod(resource, input, CatalogCC.class);
		return response;
	}
	
	@Override
	public List<CatalogCC> getCCInfoCollection(List<Map<String,String>> input) {
		
		String resource = ApplicationContextUtil.getProperty ("ccSearch");
		List<CatalogCC> response=endPoint.getCollectionUsingPostMethod(resource, input, CatalogCC.class);
		return response;
	}
}
