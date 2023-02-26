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
@Table(name = "generation")
public class Generation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long generationId;

    @Column(name = "name")
    private String name;

    @Column(name = "production_start")
    private int productionStart = 0;

    @Column(name = "production_end")
    private int productionEnd = 0;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "generation_id")
    private Set<Body> bodies = new HashSet<>();
}
