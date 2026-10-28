package com.clinicflow.domain;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity
public class Clinic {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank private String name;
 @NotBlank private String address;
 public Clinic() {}
 public Clinic(String name,String address){this.name=name;this.address=address;}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
 public String getAddress(){return address;} public void setAddress(String v){address=v;}
}
