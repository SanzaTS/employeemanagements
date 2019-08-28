package model;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.EmployeeEntity;


@SuppressWarnings("deprecation")
@ManagedBean(name = "employee")
@SessionScoped
public class Employee implements Serializable{
	
  private static final long serialVersionUID = 1L;
 
  private String name;
  private String surName;
  private Date dateOfBirth;
/**
 * @return the name
 */
  public String getName() {
	return name;
   }
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the surName
 */
 public String getSurName() {
	return surName;
 }
/**
 * @param surName the surName to set
 */
  public void setSurName(String surName) {
	this.surName = surName;
  }
/**
 * @return the dateOfBirth
 */
  public Date getDateOfBirth() {
	return dateOfBirth;
  }
/**
 * @param dateOfBirth the dateOfBirth to set
 */
   void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
  }
   
   public EmployeeEntity getEntity()
	{
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setDateOfBirth(dateOfBirth);
		employeeEntity.setName(name);
		employeeEntity.setSurName(surName);
		return employeeEntity;
	}


}
