package com.example.First_Spring_Boot_API.Model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cinemas")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String Name;
    @Column(name = "location")
    private String city;
    @Column(name = "maximum_number_of_visitors")
    private int num_visitors;

}
