package com.gap.inventory.services.CatalogService.intrface;

import java.util.*;

import com.gap.inventory.services.CatalogService.domain.CatalogCC;

public interface CatalogService {

	public List<CatalogCC> connect(List<Map<String,String>> input);
}
