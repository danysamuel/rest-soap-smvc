package com.danyprj.adresaop;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gcdList"
})

@XmlRootElement(name = "gcdList")
public class GcdList {

	private List<Integer> gcdList;

	public List<Integer> getGcdList() {
		return gcdList;
	}

	public void setGcdList(List<Integer> gcdList) {
		this.gcdList = gcdList;
	}
}
