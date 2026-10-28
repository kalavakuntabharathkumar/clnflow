package com.clinicflow.repository;
import com.clinicflow.domain.Invoice; import org.springframework.data.jpa.repository.JpaRepository;
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {}
