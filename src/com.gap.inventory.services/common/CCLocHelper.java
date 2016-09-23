package com.gap.inventory.services.common;

import java.util.*;

import com.gap.inventory.services.CatalogService.config.CatalogServiceFactory;
import com.gap.inventory.services.CatalogService.domain.CatalogCC;
import com.gap.inventory.services.CatalogService.domain.DCLocation;
import com.gap.inventory.services.CatalogService.domain.DistributionCenter;
import com.gap.inventory.services.CatalogService.domain.Distros;
import com.gap.inventory.services.CatalogService.intrface.ICatalogService;
import com.gap.inventory.services.DF.config.DemandForecastFactory;
import com.gap.inventory.services.DF.domain.DemandForecast;
import com.gap.inventory.services.DF.domain.ForecastWeek;
import com.gap.inventory.services.DF.domain.Location;
import com.gap.inventory.services.DF.intrface.IDemandForecast;
import com.gap.nltx.EOLandPrepackPush.common.ApplicationContextUtil;
import com.gap.nltx.EOLandPrepackPush.domain.ProdLocWkFcst;

public class CCLocHelper {
	Map<String,String> strDC;
	
	public void popuateProdCCLocFcst(List<ProdLocWkFcst> prodLocList,Set<String> ccSet){
		
		for(String cc:ccSet){
			populateStrDCMap(cc);
			DemandForecast df=populateFcstFromDF(cc);
			List<ForecastWeek> fcstWks=df.getWeeks();
			for(ForecastWeek fcstWk:fcstWks){
				int yr=Integer.parseInt(fcstWk.getweek().substring(0,4));
				int wk=Integer.parseInt(fcstWk.getweek().substring(8));
				for(Location l:fcstWk.getlocations()){
					if(strDC.containsKey(l.getid())){
						String dcNbr=strDC.get(l.getid());	
						prodLocList.add(new ProdLocWkFcst(Integer.parseInt(cc),Integer.parseInt(dcNbr),
								Integer.parseInt(l.getid()),yr,wk,
								l.getbaseForecast().getforecast().doubleValue(),
								l.getpromotedForecast().getforecast().doubleValue(),0.0));
						
					}
				}
			}
		}	
	}
	
	public DemandForecast populateFcstFromDF(String pln_prd_nbr){
		
		IDemandForecast dfinst = DemandForecastFactory.createService();
		DemandForecast demandForecast;
		Map<String,String> vals;
		vals = new HashMap<String,String>();
		vals.put("brd-id",ApplicationContextUtil.getProperty("BRD_KEY"));
		vals.put("mkt-id",ApplicationContextUtil.getProperty("MKT"));
		vals.put("chnl-id",ApplicationContextUtil.getProperty("CHNL"));
		vals.put("cc-id",pln_prd_nbr);
		demandForecast = dfinst.getForecast(vals);
		return demandForecast;
	}
	
	public void  populateStrDCMap(String pln_prd_nbr){
		strDC=new HashMap<String,String>();
		CatalogCC catalogCC=callCatalogService(pln_prd_nbr);
		for(Distros d:catalogCC.getDistros()){
			for(DistributionCenter dc:d.getDistributionCenters()){
				for(DCLocation  dcL:dc.getLocations()){
					strDC.put(dcL.getStoreNumber(), dc.getDcNumber());
				}
			}
		}	
	}
	
	public CatalogCC callCatalogService(String pln_prd_nbr){
		Map<String,String> vals=new HashMap<String,String>();
		vals.put("brand",ApplicationContextUtil.getProperty("BRD_KEY"));
		vals.put("market",ApplicationContextUtil.getProperty("MKT"));
		vals.put("channel",ApplicationContextUtil.getProperty("CHNL"));
		vals.put("level","CC");
		vals.put("code",pln_prd_nbr);
		
		ICatalogService catalogService=CatalogServiceFactory.createService();
		CatalogCC catalogCC=catalogService.getCCInfo(vals);
		return catalogCC;
	}
}
