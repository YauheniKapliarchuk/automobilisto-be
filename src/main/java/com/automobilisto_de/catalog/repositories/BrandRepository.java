package com.automobilisto_de.catalog.repositories;

import com.automobilisto_de.catalog.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
    Brand getBrandByName(String brandName);
}
