package com.example.studentsystem.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "APP_USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;

//bir öğrenci sadece bir şirkette çalışabilir
    @ManyToOne
    @JoinColumn(name="company_id") //foreign key oluşturuyoruz company_id
    private Company company;
}

