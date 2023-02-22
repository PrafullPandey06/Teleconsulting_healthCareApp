package com.example.emantrana.repository;

import com.example.emantrana.models.General_Queue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorGeneral_QueueRepo extends JpaRepository<General_Queue, Long> {
}
// Doctor : General_queue = 1 : N
