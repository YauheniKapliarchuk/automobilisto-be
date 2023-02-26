package com.automobilisto_de.catalog;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/catalog")
@RequiredArgsConstructor
public class CatalogController {

    private final ModelService modelService;
    private final BrandService brandService;

    @GetMapping(value = "/")
    public String getModelsByBrand(@RequestParam String brand) {
        brandService.getModelsByBrand(brand);

        return "Done!";
    }

    @GetMapping(value = "/test")
    public String putData() {
        modelService.putData();
        return "Data was pushed";
    }
}
