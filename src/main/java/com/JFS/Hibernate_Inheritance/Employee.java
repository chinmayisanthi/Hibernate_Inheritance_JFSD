package com.JFS.Hibernate_Inheritance;


import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@DiscriminatorColumn(name = "type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "Employee")
@Table (name = "emp1")
public class Employee {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int eid;
  String fname;
  String lname;
  
  public int getEid() {
    return eid;
  }
  public void setEid(int sid) {
    this.eid = eid;
  }
  public String getFname() {
    return fname;
  }
  public void setFname(String fname) {
    this.fname = fname;
  }
  public String getLname() {
    return lname;
  }
  public void setLname(String lname) {
    this.lname = lname;
  }
  
  
  

}
