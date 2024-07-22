package com.example.cinema.model.entity.bill;
import com.example.cinema.model.entity.cinema.Seat;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "bill_seat")
public class BillSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    BigDecimal price;

    @ManyToOne
    @JoinColumn(name= "bill_id")
    Bill bill;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    Seat seat;
}
