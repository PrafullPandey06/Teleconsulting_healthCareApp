package com.example.emantrana.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="admin")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Admin extends BaseModel{
    @Column(unique = true, nullable = false)
    private String email; // userId of admin
    @Column(unique = true, nullable = false)
    private String password;
}
