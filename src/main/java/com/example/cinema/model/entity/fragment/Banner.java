package com.example.cinema.model.entity.fragment;
import com.example.cinema.model.entity.media.Image;
import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "banner")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean active;
    private int position;

    @OneToOne
    @JoinColumn(name = "image_id")
    private Image image;
}
