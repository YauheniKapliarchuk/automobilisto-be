package com.automobilisto_de.catalog.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "specification")
public class Specification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long specificationId;

    @Column(name = "name")
    private String name = "";
    @Column(name = "country")
    private String country = "";
    @Column(name = "powertrain_architecture")
    private String powertrainArchitecture = "";
    @Column(name = "seats")
    private String seats = "";
    @Column(name = "doors")
    private String doors = "";
    @Column(name = "photos_path_file")
    private String photosPathFile = "";

    //Performance
    @Column(name = "fuel_consumption_urban")
    private String fuelConsumptionUrban = "";
    @Column()
    private String fuelConsumptionExtraUrban = "";
    @Column()
    private String fuelConsumptionCombined = "";
    @Column()
    private String fuelType = "";
    @Column()
    private String accelerationKM = "";
    @Column()
    private String accelerationMP = "";
    @Column()
    private String maxSpeed = "";
    @Column()
    private int weightToPowerRatio = 0;
    @Column()
    private int weightToTorqueRatio = 0;

    //Engine Specs
    @Column()
    private int powerHorse = 0;
    @Column()
    private String powerRPM = "";
    @Column()
    private int torque = 0;
    @Column()
    private String torqueRPM = "";
    @Column()
    private String engineLocation = "";
    @Column()
    private String engineModel = "";
    @Column()
    private int engineDisplacement = 0;
    @Column()
    private int numberOfCylinders = 0;
    @Column()
    private String positionOfCylinders = "";
    @Column()
    private int cylinderBore = 0;
    @Column()
    private int pistonStroke = 0;
    @Column()
    private int compressionRatio = 0;
    @Column()
    private int numberOfValvesPerCylinder = 0;
    @Column()
    private String fuelSystem = "";
    @Column()
    private String engineAspiration = "";
    @Column()
    private String valvetrain = "";
    @Column()
    private String engineOilCapacity = "";
    @Column()
    private String coolant = "";

    //Space, Volume and weights
    @Column()
    private int kerbWeight = 0;
    @Column()
    private int maxWeight = 0;
    @Column()
    private int maxLoad = 0;
    @Column()
    private int trunkSpaceMin = 0;
    @Column()
    private int trunkSpaceMax = 0;
    @Column()
    private int fuelTankCapacity = 0;

    //Dimensions
    @Column()
    private int length = 0;
    @Column()
    private int width = 0;
    @Column()
    private int height = 0;
    @Column()
    private int wheelbase = 0;
    @Column()
    private int frontTrack = 0;
    @Column()
    private int rearTrack = 0;
    @Column()
    private String dragCoefficient = "";
    @Column()
    private int minimumTurningCircle = 0;

    //Drivetrain, brakes and suspension specs
    @Column()
    private String driveWheel = "";
    @Column()
    private String numberOfGears = "";
    @Column()
    private String transmissionType = "";
    @Column()
    private String frontSuspension = "";
    @Column()
    private String rearSuspension = "";
    @Column()
    private String frontBrakes = "";
    @Column()
    private String rearBrakes = "";
    @Column()
    private String assistingSystems = "";
    @Column()
    private String steeringType = "";
    @Column()
    private String powerSteering = "";
    @Column()
    private String tiresSize = "";
    @Column()
    private String wheelRimsSize = "";
}
