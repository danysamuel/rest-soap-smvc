package com.danyprj.adresaop;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class UnicoParamReciver {
	
	@Autowired
	private UnicoAdService unicoService;
	
	@JmsListener(destination = "unicoparams", containerFactory = "myFactory")
	public void receiveMessage(UnicoParamPojo unicoParamPojo) throws IOException {
	
		unicoParamPojo.setSumNumber(unicoParamPojo.getFirstNumber() + unicoParamPojo.getSecondNumber());
		unicoParamPojo.setGcdNumber(greatestCommonDivisor(unicoParamPojo.getFirstNumber(),unicoParamPojo.getSecondNumber()));
		unicoService.save(unicoParamPojo);
		
		System.out.println("Que Received --- > "+unicoParamPojo.toString());
	}
	
	 public static int greatestCommonDivisor(int a, int b) {
  	   if (b==0) return a;
  	   return greatestCommonDivisor(b,a%b);
  	}
  
	

}
