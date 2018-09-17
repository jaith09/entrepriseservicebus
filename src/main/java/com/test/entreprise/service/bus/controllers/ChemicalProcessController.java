package com.test.entreprise.service.bus.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.entreprise.service.bus.dto.ChemicalProcessEntryDto;
import com.test.entreprise.service.bus.dto.ProductEntryDto;

public class ChemicalProcessController {
	@RequestMapping(value = "/api/processes/", method = RequestMethod.POST)
	public ResponseEntity<String> transformProduct(@RequestBody ChemicalProcessEntryDto dto){
		//à faire -> appeler le service pour faire la transformation du ChemicalProcessEntryDto en ChemicalProcess
		//ensuite appeler le service pour transformer le ChemicalProcess en ChemicalProcessExitDto
		//envoyer via HTTP le ChemicalProcesstExitDto à l'application qui affichera les résultats
		return new ResponseEntity<String>("product saved", HttpStatus.OK);
	}
}
