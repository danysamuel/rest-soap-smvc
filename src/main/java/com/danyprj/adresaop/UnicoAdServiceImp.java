package com.danyprj.adresaop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnicoAdServiceImp implements UnicoAdService {

	@Autowired
	private UnicoAdRepositiory unicoAdRepositiory;

	public UnicoParamPojo save(UnicoParamPojo unicoParamPojo) {

		return unicoAdRepositiory.save(unicoParamPojo);

	}

	public List<UnicoParamPojo> list() {

		return (List<UnicoParamPojo>) unicoAdRepositiory.findAll();
	}

	
}
