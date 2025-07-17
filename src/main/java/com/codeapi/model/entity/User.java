package com.codeapi.model.entity;

import com.codeapi.model.enums.Roles;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "full_name")
    private String fullName;

    private String email;
    private String password;

    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Roles role;


}
