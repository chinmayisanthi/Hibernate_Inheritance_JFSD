package com.JFS.Hibernate_Inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue(value= "Permanent_employee")
public class Permanent_employee extends Employee {

  String dept;
  double sal;

public String getDept() {
  return dept;
}
public void setDept(String dept) {
  this.dept = dept;
}
public double getSal() {
  return sal;
}
public void setSal(double sal) {
  this.sal = sal;
}

  

}