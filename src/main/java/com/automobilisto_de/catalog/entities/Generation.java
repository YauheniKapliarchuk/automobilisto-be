package com.automobilisto_de.catalog.entities;

import jakarta.persistence.*;
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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "generation_id")
    private Set<Body> bodies = new HashSet<>();
}
