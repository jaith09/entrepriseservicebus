package com.test.entreprise.service.bus.services;

import com.test.entreprise.service.bus.dto.ProductEntryDto;
import com.test.entreprise.service.bus.dto.ProductExitDto;
import com.test.entreprise.service.bus.models.Product;

public class ProductService {

	public static Product transformProductEntry(ProductEntryDto entry) {
		// � faire la transformation
		return null;
	}
	
	public static ProductExitDto transformProduct(Product product) {
		// � faire la transformation
		return null;
	}
	
	public static void prepareProduct(Product product) {
		//�ventuellement des modifications sur le produit ici
	}
	
	public static void sendProductExitDto(ProductExitDto productExitDto) {
		//� faire l'envoi par http
	}
}
