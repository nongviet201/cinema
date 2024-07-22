package com.example.cinema.model.entity.bill;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    BigDecimal discountPrice;
    int limitAmount;
    String code;
    LocalDate startDate;
    LocalDate endDate;
}
