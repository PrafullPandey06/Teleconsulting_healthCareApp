package com.example.emantrana.repository;

import com.example.emantrana.models.MedicalRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientMedicalRecordsRepo extends JpaRepository<MedicalRecords, Long> {
}
// Patient : MedicalRecords = 1 : N
