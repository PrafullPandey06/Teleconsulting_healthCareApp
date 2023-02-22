package com.example.emantrana.repository;

import com.example.emantrana.models.DoctorTimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorTimeTableRepo extends JpaRepository <DoctorTimeTable, Long> {
}
// Doctor : DoctorTimeTable = 1 : N
