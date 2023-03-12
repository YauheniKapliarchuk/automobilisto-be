package com.automobilisto_de.catalog.repositories;

import com.automobilisto_de.catalog.entities.Model;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    @Query("SELECT m FROM Model m where m.brandId = ?1")
    List<Model> findAllByBrandId(Long brandId, Pageable pageable);

    @Query("SELECT count(m) FROM Model m where m.brandId = ?1")
    int getCountOfModelsByBrandId(Long brandId);
}
