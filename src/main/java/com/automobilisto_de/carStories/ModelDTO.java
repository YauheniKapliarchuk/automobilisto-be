package com.automobilisto_de.carStories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
public class ModelDTO {

    private Long id;
    private String name;
    private Set<GenerationDTO> generations = new HashSet<>();
}
