package com.automobilisto_de.catalog.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BodyImage {

    private String sliderImage;
    private String origImage;
    private String smallImage;
    private String basicImage;
}
