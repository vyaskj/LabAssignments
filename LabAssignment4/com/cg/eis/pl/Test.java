package com.cg.eis.pl;
import com.cg.eis.service.Service;
import java.util.ServiceConfigurationError;
import com.cg.eis.bean.Employee;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Creating the new Service.
		 */
		Service service = new Service();
		/**
		 * Invoking various services for new Employee.
		 * Getting the new employee details.
		 * Finding the appropriate insurance scheme for an employee.
		 * Displaying the necessary details.
		 */
		Employee newEmployee =  service.getEmployeeDetails();
		String insuranceScheme = service.findInsuranceScheme(newEmployee);
		newEmployee.setInsuranceScheme(insuranceScheme);
		service.displayDetails(newEmployee);
	}
}