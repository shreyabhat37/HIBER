package com.dev.model.dao;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.dev.model.beans.EmployeeDto;
import com.dev.model.beans.User_Master;

@Component
@Primary
public class HibernateImpl implements EmpInfoDAO
{
	@Autowired
	SessionFactory factory;

	@Override
	public EmployeeDto login(String UserId, String UserPassword) {
		Session session=factory.openSession();

		EmployeeDto emp=new EmployeeDto();
		User_Master us=new User_Master();


		session.getTransaction().begin();
		if(UserId.equals(us.getUserId())&&UserPassword.equals(us.getUserPassword()))
		{
			session.getTransaction().commit();
			return emp;

		}
		else{
			session.getTransaction().commit();
			//session.close();
			return emp;
		}

	}

	@Override
	public EmployeeDto searchEmp(String Emp_ID) {

		Session session=factory.openSession();

		session.getTransaction().begin();
		EmployeeDto emp=session.get(EmployeeDto.class,Emp_ID);

		return emp;

	}
	@Override
	public boolean createEmpProfile(EmployeeDto emp) {
		Session session= null;
		try {

			session= factory.openSession();

			session.getTransaction().begin();
			Date d=new Date();
			

			session.save(emp);

			session.getTransaction().commit();
			return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			if(session!=null)
				session.close();
		}
		//return false;

	}
	@Override
	public boolean updateEmp(String Emp_ID) {
		Session session=factory.openSession();

		session.getTransaction().begin();
		EmployeeDto emp=session.get(EmployeeDto.class,"5");
		//emp.setEmp_ID("5");
//		emp.setEmp_First_Name("shiva");
//		emp.setEmp_Last_Name("nk");
		session.getTransaction().commit();
		// session.close();

		return true;
	}
	@Override
	public List<EmployeeDto> empDetails() {
		Session session=factory.openSession();

		session.getTransaction().begin();
		String qry=" from EmployeeDto emp";
		Query query=session.createQuery(qry);

		List<EmployeeDto> emp=query.list();
		//System.out.println(obj);*/

		return emp;
	}


}