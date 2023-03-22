package com.springboot.demo.mycoolapp.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private int age;
    private String address;
    private String email;
    private String phone;
    private String gender;

}
