package com.automobilisto_de.catalog.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADBody {

    private int id;
    private String name;
    private String bodyType;
    private String generation = "";
    private int productionStart = 0;
    private int productionEnd = 0;
    private int powerFrom = 0;
    private int powerTo = 0;
    private String dimensions = "";
    private int countOfNew = 0;
    private int countOfUse = 0;
    private String photoLink = "";
    private String link = "";

}
