package com.POC.MicroServices_School.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "School")
public class School {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

}
