package com.gap.inventory.intrface;

import java.util.*;

import com.gap.inventory.domain.CatalogCC;

public interface CatalogService {

	public List<CatalogCC> connect(List<Map<String,String>> input);
}
