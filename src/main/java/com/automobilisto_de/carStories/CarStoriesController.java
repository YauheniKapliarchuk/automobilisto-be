package com.automobilisto_de.carStories;

import com.automobilisto_de.catalog.entities.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carStories")
@RequiredArgsConstructor
public class CarStoriesController {

    private final CarStoriesService carStoriesService;

    public CarStoryEntity getCarStoryByBrand(String brand) {
        return new CarStoryEntity("Acura", "Acura Content", new ArrayList<>());
    }

    @GetMapping("/count_models")
    public int getCountOfModels(@RequestParam String brandName) {
        return carStoriesService.getCountModelsByBrandName(brandName);
    }

    @GetMapping("/photo_tab")
    public List<Model> getModelsAndGenerations(@RequestParam String brandName, @RequestParam int page) {
        return carStoriesService.getModelsAndGenerationsByBrand(brandName, page);
    }
}
