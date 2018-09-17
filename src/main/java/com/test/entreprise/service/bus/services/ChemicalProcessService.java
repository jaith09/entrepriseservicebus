package com.test.entreprise.service.bus.services;

import com.test.entreprise.service.bus.dto.ChemicalProcessEntryDto;
import com.test.entreprise.service.bus.dto.ChemicalProcessExitDto;
import com.test.entreprise.service.bus.models.ChemicalProcess;

public class ChemicalProcessService {

	public static ChemicalProcess transformChemicalProcessEntry(ChemicalProcessEntryDto entry) {
		// à faire la transformation
		return null;
	}
	
	public static ChemicalProcessExitDto transformChemicalProcess(ChemicalProcess chemicalProcess) {
		// à faire la transformation
		return null;
	}
	
	public static void prepareChemicalProcess(ChemicalProcess chemicalProcess) {
		//éventuellement des modifications sur le ChemicalProcess ici
	}
	
	public static void sendChemicalProcessExitDto(ChemicalProcessExitDto chemicalProcessExitDto) {
		//à faire l'envoi par HTTP
	}
}
