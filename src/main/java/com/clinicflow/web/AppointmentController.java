package com.clinicflow.web;
import com.clinicflow.domain.Appointment; import com.clinicflow.repository.AppointmentRepository; import jakarta.validation.Valid; import java.util.List; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import org.springframework.web.server.ResponseStatusException;
@RestController @RequestMapping("/api/appointments")
public class AppointmentController {
 private final AppointmentRepository repo; public AppointmentController(AppointmentRepository repo){this.repo=repo;}
 @GetMapping public List<Appointment> all(){return repo.findAll();}
 @PostMapping public Appointment create(@Valid @RequestBody Appointment appointment){return repo.save(appointment);}
 @PatchMapping("/{id}/status") public Appointment status(@PathVariable Long id,@RequestParam Appointment.Status value){Appointment a=repo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Appointment not found"));a.setStatus(value);return repo.save(a);}
}
