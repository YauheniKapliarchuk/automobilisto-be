package com.automobilisto_de.carStories;

import com.automobilisto_de.catalog.entities.Brand;
import com.automobilisto_de.catalog.repositories.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarStoriesService {

    private final BrandRepository brandRepository;

    public Set<ModelDTO> getModelsAndGenerationsByBrand(String brandName) {
        Brand brand = brandRepository.getBrandByName(brandName);

        Set<ModelDTO> models = brand.getModels().stream()
                .map(model -> {
                    ModelDTO modelDTO = new ModelDTO();

                    modelDTO.setId(model.getModelId());
                    modelDTO.setName(model.getName());

                    Set<GenerationDTO> generations = model.getGenerations().stream()
                            .map(generation -> {
                                GenerationDTO generationDTO = new GenerationDTO();

                                generationDTO.setGenerationId(generation.getGenerationId());
                                generationDTO.setProductionStart(generation.getProductionStart());
                                generationDTO.setProductionEnd(generationDTO.getProductionEnd());
                                generationDTO.setName(generation.getName());

                                return generationDTO;
                            })
                            .collect(Collectors.toSet());

                    modelDTO.setGenerations(generations);

                    return modelDTO;
                })
                .collect(Collectors.toSet());

        return models;
    }
}
