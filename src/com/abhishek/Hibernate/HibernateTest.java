package com.abhishek.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abhishek.model.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		UserDetails user = new UserDetails();
	
		user.setId(1);
		user.setUserName("FirstUser");
		/* 
		 * Steps to trigger hibernate to update or create the database
		 * 1. Create a Configuration object and call the configure method which will read the configuration file, in this case the
		   hibernate.cfg.xml file, after reading it it is calling the buildSessionFactory() method to create a SessionFactory object
		   out of the configuration file
		   2. which gets saved in the SessionFactory reference variable,
		   3. Then we are creating the Session object using the SessionFactory object which was returned, (thing to keep in mind is that 
		   for every one application instance there will only be one SessionFactory that will be created and using that we can create as mana
		   session objects as we want.
		   4.Then we use session.openSession() method to open a session
		   5. then using the same session object we are starting a transaction (session.beginTransaction()), we have to keep in mind that every transaction
		   defines one unit of work.
		   6.Then we have to use session.save(user) method to create a table in the data base, this hibernate does for automatically
		   if every thing is configured ok in Hibernate configuration file
		   7.Then we are using the getTransaction method to get the current Transaction and then calling the commit method to close the 
		   Transaction
		 * 
		 *  **/
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(user);
		
		session.getTransaction().commit();
	}

}
