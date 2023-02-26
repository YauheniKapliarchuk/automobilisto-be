package com.automobilisto_de.catalog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Modifications")
public class ADModification {

    @Id
    private Long id;

    private Long bodyId;
    private String brand = "";
    private String model = "";
    private String generationName = "";
    private String body = "";

    private String name = "";
    private boolean awd = false;
    private String transmission = "";
    private String hp = "";
    private int productionStart = 0;
    private int productionEnd = 0;
    private String maxSpeed = "";
    private String accelerationKm = "";
    private String accelerationMp = "";
    private String fuelConsumptionPer100Km = "";
    private String fuelConsumptionPerUSPmg = "";
    private String fuelConsumptionPerUKPmg = "";
    private String fuelConsumptionPerLiter = "";

}
