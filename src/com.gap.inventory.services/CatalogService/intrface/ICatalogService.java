package com.gap.inventory.services.CatalogService.intrface;

import java.util.*;

import com.gap.inventory.services.CatalogService.domain.CatalogCC;

public interface ICatalogService {

	public List<CatalogCC> getCCInfo(List<Map<String,String>> input);
}
