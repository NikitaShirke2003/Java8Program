package com.csi.jdkfeatures;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer {
	private int custId;
	private String custName;
	private double custAccBalance;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String custName, double custAccBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAccBalance = custAccBalance;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getCustAccBalance() {
		return custAccBalance;
	}

	public void setCustAccBalance(double custAccBalance) {
		this.custAccBalance = custAccBalance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAccBalance=" + custAccBalance + "]";
	}

}

public class StreamAPIEx {

	public static void main(String[] args) {

		/*
		 * List<Customer>customerList = new LinkedList<Customer>();
		 * 
		 * customerList.add(new Customer(101, "SHREE",80000.90)); customerList.add(new
		 * Customer(103, "SAI",67000.70)); customerList.add(new Customer(109,
		 * "RADHA",45000.70)); customerList.add(new Customer(180, "SWARA",88000.40));
		 * customerList.add(new Customer(110, "RAJ",56000.80));
		 */

		List<Customer> customers = Stream.of(new Customer(100, "SAI", 90000.90), new Customer(103, "SHREE", 38000.80),
				new Customer(102, "AARYA", 56000.70),// new Customer(107, "PRIYA", 28000.30),
				new Customer(99, "RAJ", 33000.90)).collect(Collectors.toList());

		// customers.stream().sorted(Comparator.comparing(Customer::getCustName).reversed()).forEach(System.out::println);
		// customers.stream().sorted(Comparator.comparingDouble(Customer::getCustAccBalance).reversed()).forEach(System.out::println);
		// customers.stream().sorted(Comparator.comparingInt(Customer::getCustId).reversed()).forEach(System.out::println);

		/*
		 * long count = customers.stream().collect(Collectors.counting());
		 * System.out.println(count);
		 */

		// customers.stream().filter(cust->
		// cust.getCustAccBalance()>=50000).forEach(System.out::println);
		// customers.stream().filter(cust->
		// cust.getCustName().equals("RAJ")).forEach(System.out::println);

		/*
		Map<Integer, Customer> customerMap = new ConcurrentHashMap<Integer, Customer>();
		for (Customer customer : customers) {
			customerMap.put(customer.getCustId(), customer);
		}
		customerMap.entrySet().stream().filter(cust->cust.getValue().getCustAccBalance()>=50000).forEach(System.out::println);

		customerMap.entrySet().stream().forEach(System.out::println);
		*/
		
		System.out.println(customers.stream().sorted(Comparator.comparingDouble(Customer::getCustAccBalance)).toList().get(0));
	}

}
