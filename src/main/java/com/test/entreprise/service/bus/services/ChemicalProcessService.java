package com.test.entreprise.service.bus.services;

import com.test.entreprise.service.bus.dto.ChemicalProcessEntryDto;
import com.test.entreprise.service.bus.dto.ChemicalProcessExitDto;
import com.test.entreprise.service.bus.models.ChemicalProcess;

public class ChemicalProcessService {

	public static ChemicalProcess transformChemicalProcessEntry(ChemicalProcessEntryDto entry) {
		// � faire la transformation
		return null;
	}
	
	public static ChemicalProcessExitDto transformChemicalProcess(ChemicalProcess chemicalProcess) {
		// � faire la transformation
		return null;
	}
	
	public static void prepareChemicalProcess(ChemicalProcess chemicalProcess) {
		//�ventuellement des modifications sur le ChemicalProcess ici
	}
	
	public static void sendChemicalProcessExitDto(ChemicalProcessExitDto chemicalProcessExitDto) {
		//� faire l'envoi par HTTP
	}
}
