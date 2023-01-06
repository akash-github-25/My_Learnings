package com.que4.usecase;

import javax.persistence.EntityManager;

import com.masai.EMUtil.EMUtil;
import com.que4.Entity.ConractualEmployee;
import com.que4.Entity.SalariedEmployee;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em=EMUtil.provideEntityManager();
SalariedEmployee s=new SalariedEmployee();
s.setEmpName("akash");
s.setEmail("ak@1");
s.setSalary(100);

SalariedEmployee s1=new SalariedEmployee();
s1.setEmpName("akash1");
s1.setEmail("ak@2");
s1.setSalary(110);

SalariedEmployee s2=new SalariedEmployee();
s2.setEmpName("akash2");
s2.setEmail("ak@3");
s2.setSalary(120);

SalariedEmployee s3=new SalariedEmployee();
s3.setEmpName("akash3");
s3.setEmail("ak@4");
s3.setSalary(130);

ConractualEmployee c=new ConractualEmployee();
c.setEmpName("ayush");
c.setMobileNumber(71223);
c.setNoOfWorkingDays(100);
c.setCostofperday(100);

ConractualEmployee c1=new ConractualEmployee();
c1.setEmpName("ayush1");
c1.setMobileNumber(7122322);
c1.setNoOfWorkingDays(110);
c1.setCostofperday(110);

ConractualEmployee c2=new ConractualEmployee();
c2.setEmpName("ayush2");
c2.setMobileNumber(712233);
c2.setNoOfWorkingDays(100);
c2.setCostofperday(120);

ConractualEmployee c3=new ConractualEmployee();
c3.setEmpName("ayush3");
c3.setMobileNumber(71023);
c3.setNoOfWorkingDays(120);
c3.setCostofperday(130);

em.getTransaction().begin();
em.persist(s);
em.persist(s1);
em.persist(s2);
em.persist(s3);
em.persist(c);
em.persist(c1);
em.persist(c2);
em.persist(c3);
em.getTransaction().commit();

em.close();


	}

}
