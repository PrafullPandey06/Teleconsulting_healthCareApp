package com.example.emantrana.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity(name="prescription")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Prescription extends BaseModel{
    @Column(nullable = false)
    private Date preseciptionDate;

    @Column(nullable = false)
    private String day;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String medicine;

    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patient;
}
