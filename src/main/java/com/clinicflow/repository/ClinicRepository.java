package com.clinicflow.repository;
import com.clinicflow.domain.Clinic; import org.springframework.data.jpa.repository.JpaRepository;
public interface ClinicRepository extends JpaRepository<Clinic,Long> {}
