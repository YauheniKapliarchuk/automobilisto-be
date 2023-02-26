package com.automobilisto_de.carStories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class GenerationDTO {

    private Long generationId;
    private String name;
    private int productionStart = 0;
    private int productionEnd = 0;
//    private Set<Body> bodies = new HashSet<>();
}
