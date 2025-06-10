package com.example.studentsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COMPANY")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="COMPANY_NAME")
    private String companyName;
    @Column(name="LOCATİON")
    private String location;
    @Column(name="SECTOR")
    private String sector;
    @Column(name = "PUBLIS_DATE")
    private LocalDate publishDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID", referencedColumnName = "id")
    private User user;

    public void setSector(String sector) {
    }
}
