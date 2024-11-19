package com.example.fuchione.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank(message = "Please enter user name")
    @Column(name = "full_name")
    private String fullname;

    @NotBlank(message = "Please enter email")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "hello")
    @Column(name = "password")
    private String password;


}
