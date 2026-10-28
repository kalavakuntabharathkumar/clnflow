package com.clinicflow.web;
import com.clinicflow.domain.Invoice; import com.clinicflow.repository.InvoiceRepository; import jakarta.validation.Valid; import java.util.List; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/invoices")
public class InvoiceController {
 private final InvoiceRepository repo; public InvoiceController(InvoiceRepository repo){this.repo=repo;}
 @GetMapping public List<Invoice> all(){return repo.findAll();}
 @PostMapping public Invoice create(@Valid @RequestBody Invoice invoice){return repo.save(invoice);}
}
