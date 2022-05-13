package com.example.First_Spring_Boot_API.Model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cinemas")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String Name;
    @Column(name = "location")
    private String city;
    @Column(name = "maximum number of visitors")
    private int mnum_visitors;

}
