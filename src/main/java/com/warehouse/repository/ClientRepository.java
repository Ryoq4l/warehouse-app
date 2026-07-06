package com.warehouse.repository;

import com.warehouse.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Clients, Integer> {
    List<Clients> findByType(Integer type);

}