package com.example.emantrana.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity(name="patient")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Patient extends BaseModel{
    @Column(unique = true, nullable = false)
    private String phoneNumber; // userId of patient

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String Fname;

    private String Lname;
    private String email;

    @Column(name="date_of_birth", nullable = false)
    private String dateOfBirth; // should it be string or date data type??

    @Column(nullable = false)
    private String Gender;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointment;

    @OneToMany(mappedBy = "patient")
    private List<Prescription> prescription;

    @OneToMany(mappedBy = "patient")
    private List<MedicalRecords> medicalRecords;

    @OneToOne(mappedBy = "patient")
    private General_Queue general_queue;

    @OneToMany(mappedBy = "patient")
    private List<Doctor_Patient> doctor_patient;
}
