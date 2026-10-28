package com.clinicflow.domain;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.time.LocalDateTime;
@Entity
public class Appointment {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String patientName;
 @NotBlank private String clinicianName;
 @NotNull private LocalDateTime scheduledAt;
 @Enumerated(EnumType.STRING) private Status status=Status.BOOKED;
 public enum Status { BOOKED, CONFIRMED, COMPLETED, CANCELLED }
 public Appointment(){}
 public Long getId(){return id;} public String getPatientName(){return patientName;} public void setPatientName(String v){patientName=v;}
 public String getClinicianName(){return clinicianName;} public void setClinicianName(String v){clinicianName=v;}
 public LocalDateTime getScheduledAt(){return scheduledAt;} public void setScheduledAt(LocalDateTime v){scheduledAt=v;}
 public Status getStatus(){return status;} public void setStatus(Status v){status=v;}
}
