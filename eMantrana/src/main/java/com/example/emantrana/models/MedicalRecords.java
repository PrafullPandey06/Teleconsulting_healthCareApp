package com.example.emantrana.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="medical_records")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MedicalRecords extends BaseModel{
    @Column(unique = true, nullable = false)
    private String recordImageLink;

    // Forign key pointig to patient table
    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patient;
}
