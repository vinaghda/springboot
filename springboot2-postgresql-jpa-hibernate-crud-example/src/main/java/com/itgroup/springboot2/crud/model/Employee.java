package com.itgroup.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "karyawan")
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
 
    public Employee() {
  
    }
 
    public Employee(String firstName, String lastName) {
         this.firstName = firstName;
         this.lastName = lastName;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "nama_depan", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    @Column(name = "nama_belakang", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
 
}
