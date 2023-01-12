package com.automobilisto_de.catalog.repositories;

import com.automobilisto_de.catalog.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> getByBrand(String brand);
}
