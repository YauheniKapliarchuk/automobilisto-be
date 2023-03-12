package com.automobilisto_de.carStories;

import com.automobilisto_de.catalog.entities.Model;
import com.automobilisto_de.catalog.repositories.BrandRepository;
import com.automobilisto_de.catalog.repositories.ModelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@Service
@RequiredArgsConstructor
public class CarStoriesService {

    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;

    @Value("${pagination.size}")
    private int paginationSize;

    public int getCountModelsByBrandName(String brandName) {
        Long brandId = brandRepository.getBrandIdByBrandName(brandName);
        return modelRepository.getCountOfModelsByBrandId(brandId) / paginationSize + 1;
    }

    public List<Model> getModelsAndGenerationsByBrand(String brandName, int page) {
        Long brandId = brandRepository.getBrandIdByBrandName(brandName);
        Pageable pageable = PageRequest.of(page - 1, paginationSize, Sort.by("name").ascending());

//        Set<ModelDTO> modelsDto = models.stream()
//                .sorted(Comparator.comparing(Model::getName))
//                .map(model -> {
//                    ModelDTO modelDTO = new ModelDTO();
//
//                    modelDTO.setId(model.getModelId());
//                    modelDTO.setName(model.getName());
//
//                    Set<GenerationDTO> generations = model.getGenerations().stream()
//                            .map(generation -> {
//                                GenerationDTO generationDTO = new GenerationDTO();
//
//                                generationDTO.setGenerationId(generation.getGenerationId());
//                                generationDTO.setProductionStart(generation.getProductionStart());
//                                generationDTO.setProductionEnd(generation.getProductionEnd());
//                                generationDTO.setName(generation.getName());
//
//                                return generationDTO;
//                            })
//                            .collect(Collectors.toSet());
//
//                    modelDTO.setGenerations(generations);
//
//                    return modelDTO;
//                })
//                .collect(Collectors.toSet());

        return modelRepository.findAllByBrandId(brandId, pageable);
    }
}
