package com.que1;

public class Lion{
	public static  Lion getLionObj() {
		Lion l= new Lion();
		return l;
	}
	private Lion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double calculateLoanAmount(Employee employeeObj) {
		double loan=0;
		if(employeeObj instanceof PermanentEmployee) {
			PermanentEmployee p=(PermanentEmployee)employeeObj;
			p.calculateSalary();
//			p.setSalary(loan);
//			System.out.println(p.getSalary());
//			System.out.println(p.salary);
//			System.out.println(employeeObj.getSalary());
			 loan=15*p.salary/100;
//			 System.out.println(employeeObj.salary);
		}else if(employeeObj instanceof  TemporaryEmployee) {
			 TemporaryEmployee t= (TemporaryEmployee)employeeObj;
			 t.calculateSalary();
			 loan=10*t.salary/100;
		}
		return loan;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
