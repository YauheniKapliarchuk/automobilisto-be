package com.automobilisto_de.carStories;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class CarStoryEntity {

    private String brandName;
    private String content;
    private List<String> images;
}
