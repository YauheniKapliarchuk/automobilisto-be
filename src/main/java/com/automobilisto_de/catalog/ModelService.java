package com.automobilisto_de.catalog;

import com.automobilisto_de.catalog.entities.Brand;
import com.automobilisto_de.catalog.entities.Generation;
import com.automobilisto_de.catalog.entities.Model;
import com.automobilisto_de.catalog.repositories.BrandRepository;
import com.automobilisto_de.catalog.repositories.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ModelService {

    private final ModelRepository modelRepository;
    private final BrandRepository brandRepository;

    public void getModelsByBrand(String brand) {
        List<Model> models = modelRepository.findAll();

        for (Model model : models) {
            Set<Generation> generations = model.getGenerations();
        }
    }

    public void putData() {
        Brand brand = new Brand();
        brand.setName("audi");
        brand.setLabel("Audi");

        Set<Model> models = new HashSet<>();
        for (int j = 0; j < 10; j++) {

            Model model = new Model();
            model.setName("Test_model_name_" + j);

            Set<Generation> generations = new HashSet<>();

            for (int i = 0; i < 10; i++) {
                Generation generation = new Generation();

                generation.setProductionStart(2000);
                generation.setProductionEnd(2005);
                generations.add(generation);
            }
            model.setGenerations(generations);
            models.add(model);
        }

        brand.setModels(models);

        brandRepository.save(brand);
    }
}
