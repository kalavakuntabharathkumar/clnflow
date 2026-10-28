package com.clinicflow.domain;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.math.BigDecimal;
@Entity
public class Invoice {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotNull private Long appointmentId;
 @NotNull @DecimalMin("0.00") @Column(precision=12,scale=2) private BigDecimal amount;
 @Enumerated(EnumType.STRING) private PaymentStatus paymentStatus=PaymentStatus.UNPAID;
 public enum PaymentStatus { UNPAID, PAID, VOID }
 public Invoice(){}
 public Long getId(){return id;} public Long getAppointmentId(){return appointmentId;} public void setAppointmentId(Long v){appointmentId=v;}
 public BigDecimal getAmount(){return amount;} public void setAmount(BigDecimal v){amount=v;}
 public PaymentStatus getPaymentStatus(){return paymentStatus;} public void setPaymentStatus(PaymentStatus v){paymentStatus=v;}
}
