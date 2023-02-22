package com.example.emantrana.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="appointment")
public class Appointment extends BaseModel{
    @Column(nullable = false) // should it be unique or not
    private String AppointmentIn;

    @Column(nullable = false)
    private String AppointmentOut;

    //TODO: Forign key pointig to doctor table
    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

    //TODO: Forign key pointig to patient table
    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patient;
}
