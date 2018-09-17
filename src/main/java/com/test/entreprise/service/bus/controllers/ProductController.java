package com.test.entreprise.service.bus.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.entreprise.service.bus.dto.ProductEntryDto;

public class ProductController {

	@RequestMapping(value = "/api/products/", method = RequestMethod.POST)
	public ResponseEntity<String> transformProduct(@RequestBody ProductEntryDto dto){
		//à faire -> appeler le service pour faire la transformation du ProductEntryDto en Product
		//ensuite appeler le service pour transformer le Product en ProductExitDto
		//envoyer via HTTP le ProductExitDto à l'application qui affichera les résultats
		return new ResponseEntity<String>("product saved", HttpStatus.OK);
	}
}
