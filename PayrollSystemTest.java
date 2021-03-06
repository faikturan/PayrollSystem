package com.faikturan;

public class PayrollSystemTest {

	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = 
				new SalariedEmployee("Kadir", "B�y�k", "111-11-1111", 8000);
		HourlyEmployee hourlyEmployee = 
				new HourlyEmployee("Turgay", "�zt�rk", "222-22-2222", 1000, 40);
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
		
		Employee employees[] = new Employee[4];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.println("Employees processed polymorphically:\n");
		for (Employee currentEmployee : employees) {
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = 
						(BasePlusCommissionEmployee) currentEmployee;
				
				double oldBaseSalary = employee.getBaseSalary();
				employee.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f\n",
						employee.getBaseSalary());
				System.out.printf(
						"earned $%,.2f\n\n", currentEmployee.earnings());
				for (int i = 0; i < employees.length; i++) {
					System.out.printf("Employee %d is a %s\n", i,
							employees[i].getClass().getName());
				}
			}
			
		}

	}

}
