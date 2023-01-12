package com.automobilisto_de.catalog.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "generations")
public class Generation {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "production_start")
    private int productionStart = 0;

    @Column(name = "production_end")
    private int productionEnd = 0;

//    @OneToMany(mappedBy = "generation")
//    private Set<ADBodyDetails> bodies = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private Model model;
}
