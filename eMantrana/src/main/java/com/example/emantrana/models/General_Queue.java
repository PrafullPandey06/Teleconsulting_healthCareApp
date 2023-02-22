package com.example.emantrana.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="general_queue")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class General_Queue extends BaseModel{
    private int count;
    //TODO: Forign key pointig to patient table
    @OneToOne
    @JoinColumn(name="patient_id")
    private Patient patient;

    //TODO: Forign key pointig to doctor table
    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;
}
