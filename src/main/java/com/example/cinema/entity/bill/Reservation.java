package com.example.cinema.entity.bill;

import com.example.cinema.entity.cinema.Seat;
import com.example.cinema.entity.cinema.Showtime;
import com.example.cinema.entity.user.User;
import com.example.cinema.model.enums.ReservationType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private ReservationType status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private LocalDateTime startOrderTime;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name="showtime_id")
    private Showtime showtime;
}
