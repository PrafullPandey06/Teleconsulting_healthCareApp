package com.example.emantrana.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity(name="doctor_patient")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Doctor_Patient extends BaseModel{
}
