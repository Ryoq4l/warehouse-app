package com.warehouse.repository;

import com.warehouse.entity.Specifications;
import com.warehouse.entity.SpecificationID;
import com.warehouse.entity.SpecificationID;
import com.warehouse.entity.Specifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SpecificationsRepository extends JpaRepository<Specifications, SpecificationID> {
    List<Specifications> findByTtnId(Integer ttnId);
    List<Specifications> findByProductId(Integer productId);
}