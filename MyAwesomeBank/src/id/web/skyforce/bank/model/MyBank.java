package id.web.skyforce.bank.model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MyBank {
	public static void main(String[] args) {
		Session session = HibernateUtil.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customers = new Customer();
		customers.setFirstName("Bill");
		customers.setLastName("Gates");
		customers.setGender('M');
		customers.setBirDate(new Date());
		customers.setIdNumber("1234 5678");
		
		session.save(customers);
		transaction.commit();
		session.close();
		
	}
}
