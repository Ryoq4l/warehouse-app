package com.warehouse.repository;

import com.warehouse.entity.Ttn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface TtnRepository extends JpaRepository<Ttn, Integer> {
    List<Ttn> findBySenderId(Integer senderId);
    List<Ttn> findByReceiverId(Integer receiverId);
    List<Ttn> findByTtnDateBetween(LocalDate start, LocalDate end);
}