package com.example.emantrana.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="doctor_time_table")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DoctorTimeTable extends BaseModel{
    @Column(nullable = false)
    private String day;

    @Column(nullable = false)
    private String time_in;

    @Column(nullable = false)
    private String time_out;

    // Forign key pointig to doctor table
    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;
    //TODO: Forign key pointig to doctor table
}
