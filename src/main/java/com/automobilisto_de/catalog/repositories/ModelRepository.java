package com.automobilisto_de.catalog.repositories;

import com.automobilisto_de.catalog.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
//    @Query("SELECT m FROM Model m where m.brand_id = ?1")
//    List<Model> getModelsByBrandId(Long brandId);
}
