package com.workintech.s18d1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name ="burger", schema ="s18d4")
public class Burger {
    // İçerisinde instance variable olarak id, name, price, isVegan, breadType, contents isminde 6 tane değişken oluşturun.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Double price;

    @Column(name = "is_vegan")
    private Boolean isVegan;
    @Column(name = "bread_type")
    @Enumerated(EnumType.STRING)
    private BreadType breadType;
    private String contents;
}