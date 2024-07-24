package com.example.cinema.model.entity.cinema;


import com.example.cinema.model.enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "seat")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Enumerated(EnumType.STRING)
    SeatType type;
    boolean status;
    int seatRow;
    String seatColumn;

    @ManyToOne
    @JoinColumn(name= "auditorium_id")
    Auditorium auditorium;
}
