package com.automobilisto_de.catalog;

import com.automobilisto_de.catalog.entities.Brand;
import com.automobilisto_de.catalog.repositories.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandService {

    private final BrandRepository brandRepository;

    public void getModelsByBrand(String brandName) {
        Brand brand = brandRepository.getBrandByName(brandName);
        System.out.println("TT: ");
    }
}
