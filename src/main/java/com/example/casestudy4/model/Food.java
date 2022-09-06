package com.example.casestudy4.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Table(name = "food")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Category category;
    private double price;
    private int accountLike;
    private int status;
    private String imageUrl;
    @Transient
    private MultipartFile image;
    @ManyToOne
    private User user;

}
