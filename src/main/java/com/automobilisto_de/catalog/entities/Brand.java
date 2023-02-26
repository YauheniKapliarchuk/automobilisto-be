package com.automobilisto_de.catalog.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long brandId;

    @Column(name = "name")
    private String name;

    @Column(name = "label")
    private String label;

    @Column
    private String country;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "brand_id")
    private Set<Model> models = new HashSet<>();

}
