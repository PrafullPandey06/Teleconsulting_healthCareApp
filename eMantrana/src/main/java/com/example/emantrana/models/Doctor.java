package com.example.emantrana.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name="doctor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Doctor extends BaseModel{
    @Column(nullable = false)
    private String Fname;

    private String Lname;

    @Column(unique = true, nullable = false)
    private String email; // username of doctor

    @Column(nullable = false)
    private String Type;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private int parientCount;

    @OneToMany(mappedBy = "doctor")
    private List<DoctorTimeTable> doctorTimeTable;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointment;

    @OneToMany(mappedBy = "doctor")
    private List<Prescription> prescription;

    @OneToMany(mappedBy = "doctor")
    private List<General_Queue> general_queue;
}
