package com.danyprj.adresaop;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class UnicoAdSoapEndpoint {


	@Autowired
	private UnicoAdService unicoService;
	
	@ResponsePayload
	public GcdSum gcdSum() {
		GcdSum response = new GcdSum();
		
		List<Integer> iList = new ArrayList<Integer>();

		for(UnicoParamPojo u : unicoService.list()) {
			iList.add(u.getFirstNumber());
		
		}
		LongAdder a = new LongAdder();
		iList.parallelStream().forEach(a::add);
		response.setGcdNumber(a.intValue());
		return response;
	}
	
	@ResponsePayload
	public GcdList gcdList() {
		GcdList response = new GcdList();
		
		List<Integer> iList = new ArrayList<Integer>();

		for(UnicoParamPojo u : unicoService.list()) {
			iList.add(u.getGcdNumber());
		
		}
		response.setGcdList(iList);
		return response;
	}
	 
}
