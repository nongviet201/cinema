package com.example.cinema.repository;

import com.example.cinema.entity.bill.BaseTicketPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseTicketPriceRepository extends JpaRepository<BaseTicketPrice, Integer> {
}
