package com.khadri.hibernate.identifiers.main;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.identifiers.composite.embedded.id.entities.Register;
import com.khadri.hibernate.identifiers.composite.embedded.id.entities.Student;

public class MainCompositeIdEmbeddedId {

	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();

		Properties properties = new Properties();
		properties.load(new FileReader(new File("src/main/resources/hb.properties")));
		cfg.addProperties(properties);

		cfg.addAnnotatedClass(Student.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction txn = session.beginTransaction();
		
		Student student = new Student();
		Register register = new Register();
		register.setRegisterNo(101);
		register.setRegisterName("ALLEN2");
		
		student.setId(register);//its composite id
		student.setSchoolName("KHADRI-2");
		
		

		session.save(student);
		txn.commit();
		session.close();
		factory.close();

	}
}
