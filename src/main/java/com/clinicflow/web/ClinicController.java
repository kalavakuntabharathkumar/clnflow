package com.clinicflow.web;
import com.clinicflow.domain.Clinic; import com.clinicflow.repository.ClinicRepository; import jakarta.validation.Valid; import java.util.List; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/clinics")
public class ClinicController {
 private final ClinicRepository repo; public ClinicController(ClinicRepository repo){this.repo=repo;}
 @GetMapping public List<Clinic> all(){return repo.findAll();}
 @PostMapping public Clinic create(@Valid @RequestBody Clinic clinic){return repo.save(clinic);}
}
