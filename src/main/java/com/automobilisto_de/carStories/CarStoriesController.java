package com.automobilisto_de.carStories;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/carStories")
public class CarStoriesController {

    public CarStoryEntity getCarStoryByBrand(String brand) {
        return new CarStoryEntity("Acura", "Acura Content",  new ArrayList<>());
    }
}
