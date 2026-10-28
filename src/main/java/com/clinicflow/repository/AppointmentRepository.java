package com.clinicflow.repository;
import com.clinicflow.domain.Appointment; import org.springframework.data.jpa.repository.JpaRepository;
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {}
