package com.csi.jdk8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
	private int empId;
	private String empName;
	private String empAddress;
	private double empSalary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String empAddress, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary="
				+ empSalary + "]";
	}

}

public class ForEachEx {

	public static void main(String[] args) {
		
		
		List<Employee>employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(101, "RADHA", "KARAD", 900000.90));
        employeeList.add(new Employee(105, "SHREE", "SATARA", 870000.80));
        employeeList.add(new Employee(109, "GATHA", "PUNE", 770000.50));
		employeeList.add(new Employee(110, "VEERA", "SANGALI", 40000.90));
		
		/*for(Employee employee : employeeList)
		{
			if(employee.getEmpSalary()>=80000.00)
			{
				System.out.println(employee);
			}
		}*/
		
		//employeeList.forEach(emp->System.out.println(emp.getEmpId() +"\t"+emp.getEmpName()));
		//employeeList.forEach(System.out::println);
		
		Map<Integer, Employee>employeeMap=new HashMap<Integer, Employee>();
		
		for(Employee employee: employeeList)
		{
			employeeMap.put(employee.getEmpId(), employee);
		}
		/*for(Map.Entry<Integer, Employee> m : employeeMap.entrySet())
		{
			System.out.println(m.getKey() + ":" + m.getValue());
		}*/
		//employeeMap.forEach((k,v)->System.out.println(k + ":" + v));
		
		employeeMap.entrySet().stream().forEach(emp-> System.out.println(emp));
		
	}

}
