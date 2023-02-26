package com.automobilisto_de.catalog.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "body")
public class Body {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long bodyId;

    @Column(name = "name")
    private String name;

    @Column(name = "body_type")
    private String bodyType;

    @Column(name = "productionStart")
    private int productionStart = 0;

    @Column(name = "productionEnd")
    private int productionEnd = 0;

    @Column(name = "power_from")
    private int powerFrom = 0;

    @Column(name = "power_to")
    private int powerTo = 0;

    @Column(name = "dimensions")
    private String dimensions = "";

    @Column(name = "photo_link")
    private String photoLink = "";

    @Column(name = "link")
    private String link = "";

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "body_id")
    private Set<Specification> specifications = new HashSet<>();
}
