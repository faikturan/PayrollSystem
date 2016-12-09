package com.faikturan;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;

	public HourlyEmployee(String first, String last, String ssn, double hourlyWage, 
			double hoursWorked) {
		super(first, last, ssn);
		setWage(hourlyWage);
		setHours(hoursWorked);
	}

	
	public double getWage() {
		return wage;
	}


	public void setWage(double wage) {
		this.wage = wage;
	}


	public double getHours() {
		return hours;
	}


	public void setHours(double hours) {
		this.hours = hours;
	}


	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}

}
