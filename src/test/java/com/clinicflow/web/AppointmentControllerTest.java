package com.clinicflow.web;
import com.clinicflow.domain.Appointment; import com.clinicflow.repository.AppointmentRepository; import java.time.LocalDateTime; import java.util.Optional;
import org.junit.jupiter.api.Test; import org.springframework.beans.factory.annotation.Autowired; import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import org.springframework.boot.test.mock.mockito.MockBean; import org.springframework.http.MediaType; import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.ArgumentMatchers.any; import static org.mockito.Mockito.*; import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*; import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
@WebMvcTest(AppointmentController.class)
class AppointmentControllerTest {
 @Autowired MockMvc mvc; @MockBean AppointmentRepository repo;
 @Test void createsAppointment() throws Exception {when(repo.save(any(Appointment.class))).thenAnswer(i->{Appointment a=i.getArgument(0);return a;});mvc.perform(post("/api/appointments").contentType(MediaType.APPLICATION_JSON).content("{"patientName":"Asha","clinicianName":"Dr Rao","scheduledAt":"2026-10-20T10:30:00"}")).andExpect(status().isOk()).andExpect(jsonPath("$.patientName").value("Asha"));}
 @Test void missingAppointmentReturns404() throws Exception {when(repo.findById(99L)).thenReturn(Optional.empty());mvc.perform(patch("/api/appointments/99/status?value=CANCELLED")).andExpect(status().isNotFound());}
}
