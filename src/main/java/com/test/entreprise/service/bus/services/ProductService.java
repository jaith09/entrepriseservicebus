package com.test.entreprise.service.bus.services;

import com.test.entreprise.service.bus.dto.ProductEntryDto;
import com.test.entreprise.service.bus.dto.ProductExitDto;
import com.test.entreprise.service.bus.models.Product;

public class ProductService {

	public static Product transformProductEntry(ProductEntryDto entry) {
		// à faire la transformation
		return null;
	}
	
	public static ProductExitDto transformProduct(Product product) {
		// à faire la transformation
		return null;
	}
	
	public static void prepareProduct(Product product) {
		//éventuellement des modifications sur le produit ici
	}
	
	public static void sendProductExitDto(ProductExitDto productExitDto) {
		//à faire l'envoi par http
	}
}
