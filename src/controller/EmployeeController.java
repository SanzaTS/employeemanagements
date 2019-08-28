package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import entities.EmployeeEntity;
import model.Employee;
import service.EmployeeEJB;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class EmployeeController {
	
	 @EJB
	private EmployeeEJB employeeEJB;
	
	//from form
	@ManagedProperty(value="#{employee}")
    private Employee employee;
	
	 private List<EmployeeEntity> employeeList = new ArrayList<>();
	 
	 public List<EmployeeEntity> getEmployeeList() {
	        employeeList = employeeEJB.findEmployees();
	        return employeeList;
	    }
	 
	 public String viewEmployee(){
	        return "employeeList.xhtml";
	    }
	 
	 public Employee getEmployee() {
			return employee;
		}
	 
	 public void setEmployee(Employee employee) {
			this.employee = employee;
		}


}
