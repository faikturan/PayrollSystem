package com.faikturan;

public class PayrollSystemTest {

	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = 
				new SalariedEmployee("Kadir", "Büyük", "111-11-1111", 8000);
		HourlyEmployee hourlyEmployee = 
				new HourlyEmployee("Turgay", "Öztürk", "222-22-2222", 1000, 40);
		CommissionEmployee commissionEmployee = 
				new CommissionEmployee("Metin", "Hasdemir", "333-33-3333", 2000, 0.25);
		BasePlusCommissionEmployee basePlusCommissionEmployee = 
				new BasePlusCommissionEmployee("Hamide", "Atakul", "444-44-4444", 
			 +2500, .40, 3000);
		
		System.out.println("Employees processed individually:\n");
		System.out.printf("%s\n%s: $%,2f\n\n", salariedEmployee, "earned", 
				salariedEmployee.earnings());
		System.out.printf("%s\n%s: $%,2f\n\n", hourlyEmployee, "earned", 
				hourlyEmployee.earnings());
		System.out.printf("%s\n%s: $%,2f\n\n", commissionEmployee, "earned", 
				commissionEmployee.earnings());
		System.out.printf("%s\n%s: $%,2f\n\n", basePlusCommissionEmployee, "earned", 
				basePlusCommissionEmployee.earnings());
		

	}

}
