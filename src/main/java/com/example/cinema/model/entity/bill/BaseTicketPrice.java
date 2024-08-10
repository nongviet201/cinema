package com.example.cinema.model.entity.bill;

import com.example.cinema.model.entity.cinema.Auditorium;
import com.example.cinema.model.entity.cinema.Cinema;
import com.example.cinema.model.enums.*;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "base_ticket_prices")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseTicketPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Enumerated(EnumType.STRING)
    SeatType seatType; // Loại ghế NORMAL, VIP, COUPLE

    @Enumerated(EnumType.STRING)
    GraphicsType graphicsType; // Loại phim 2D, 3D

    @Enumerated(EnumType.STRING)
    ScreeningTimeType screeningTimeType; // Loại suất chiếu: SUAT_CHIEU_SOM, SUAT_CHIEU_THEO_LICH

    @Enumerated(EnumType.STRING)
    DayType dayType; // Loại ngày áp dụng giá vé: WEEKDAY, WEEKEND

    @Enumerated(EnumType.STRING)
    AuditoriumType auditoriumType; // Loại phòng chiếu STANDARD, IMAX

    long price; // Giá vé

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    Cinema cinema;
}
