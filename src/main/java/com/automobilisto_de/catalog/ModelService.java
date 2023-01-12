package com.automobilisto_de.catalog;

import com.automobilisto_de.catalog.entities.Generation;
import com.automobilisto_de.catalog.entities.Model;
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

    public void getModelsByBrand(String brand) {
        List<Model> models = modelRepository.getByBrand(brand);

        for (Model model : models) {
            Set<Generation> generations = model.getGenerations();
        }
    }

    public void putData() {
        Set<Generation> generations = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            Generation generation = new Generation();
            generation.setId((long) i);
            generation.setName("test_1_name_" + i);
            generation.setBrand("test_brand_1");
            generation.setProductionEnd(2005);
            generation.setProductionStart(2000);
            generations.add(generation);
        }

        Model model = new Model();
        model.setId(13L);
        model.setBrand("test_brand_1");
        model.setName("test_model_1");
        model.setGenerations(generations);
        model.setCountOfGenerations(generations.size());

        modelRepository.save(model);
    }
}
