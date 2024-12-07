package com.JFS.Hibernate_Inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Contract_employee")
public class Contract_employee extends Permanent_employee{
  
  double s_sal;
  int c_yr;
  public double getS_sal() {
    return s_sal;
  }
  public void setS_sal(double s_sal) {
    this.s_sal = s_sal;
  }
  public int getC_yr() {
    return c_yr;
  }
  public void setC_yr(int c_yr) {
    this.c_yr = c_yr;
  }
  

  

}
