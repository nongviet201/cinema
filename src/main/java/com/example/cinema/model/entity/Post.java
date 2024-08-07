package com.example.cinema.model.entity;

import com.example.cinema.model.entity.user.User;
import com.example.cinema.model.enums.PostType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto tăng id
    private Integer id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String slug;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String thumbnail;
    private boolean status;
    private PostType type;
    private Integer view;
    private LocalDate createdAt;
    private LocalDate updateAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
