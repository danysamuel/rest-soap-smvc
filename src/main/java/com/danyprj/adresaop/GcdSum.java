package com.danyprj.adresaop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gcdNumber"
})
@XmlRootElement(name = "gcdSum")
public class GcdSum {
	
	private Integer gcdNumber;

	public Integer getGcdNumber() {
		return gcdNumber;
	}

	public void setGcdNumber(Integer gcdNumber) {
		this.gcdNumber = gcdNumber;
	}

	
}
