package com.ambow.hibernate.day2;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDaoImpl implements IStudentDao {

	private static SessionFactory sf ;
	
	static{
		/*Configuration cfg =  new Configuration().configure();
		
		sf = cfg.buildSessionFactory();*/
		//获得sessionfactory
		 sf = new Configuration().configure().buildSessionFactory();
	}
	public void addStudent(Student student) {

			Session session = null;
			
			Transaction tran = null;
			
			try{
				//获得session
				session = sf.openSession();
				
				//开始事务
				
				tran = session.beginTransaction();
				
				//do some work
				
				session.save(student);
				//事务提交
				
				tran.commit();
			}catch(Exception e){
				
				e.printStackTrace();
				
				tran.rollback();
			}finally{
				
				session.close();
			}
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
			
		
	}

	@Override
	public List findAll() {
		Session session = null;
		
		Transaction tran = null;
		
		List list = null;
		try{
			//获得session
			session = sf.openSession();
			
			//开始事务
			
			tran = session.beginTransaction();
			
			//do some work
			String hql ="from Student";
			
			Query query = session.createQuery(hql);
			
			list = query.list();
				
			//事务提交
			
			tran.commit();
		}catch(Exception e){
			
			e.printStackTrace();
			
			tran.rollback();
		}finally{
			
			session.close();
		}
		
		return list;
	}

	@Override
	public Student findByNameAndPassword(String name, String password) {
		
		Session session = null;
		
		Transaction tran = null;
		
		Student student = null;
		try{
			//获得session
			session = sf.openSession();
			
			//开始事务
			
			tran = session.beginTransaction();
			
			//do some work
			String hql ="from Student student  where student.name=:names and  student.password=:passwords";
			//hibernate 序列从0开始，jdbc从1开始
			Query query = session.createQuery(hql).setString("names", name).setString("passwords", password);
			
			student = (Student)query.uniqueResult();
				
			//事务提交
			
			tran.commit();
		}catch(Exception e){
			
			e.printStackTrace();
			
			tran.rollback();
		}finally{
			
			session.close();
		}
		
		return student;
	}


	public void updateStudent(Student student) {

		Session session = null;
		
		Transaction tran = null;
		
		try{
			//获得session
			session = sf.openSession();
			
			//开始事务
			
			tran = session.beginTransaction();
			
			//do some work
			
			session.saveOrUpdate(student);
			//事务提交
			
			tran.commit();
		}catch(Exception e){
			
			e.printStackTrace();
			
			tran.rollback();
		}finally{
			
			session.close();
		}
	}

	@Override
	public Student findById(int id) {
		Session session = null;
		
		Transaction tran = null;
		
		Student student = null;
		
		try{
			//获得session
			session = sf.openSession();
			
			//开始事务
			
			tran = session.beginTransaction();
			
			//do some work
			//String hql = "from  Student student where student.id=:id";
			
		//	Query query = session.createQuery(hql).setInteger("id", id);
		
			//student = (Student)query.uniqueResult();
			
			//student = (Student) session.get(Student.class, id);
			
			student = (Student)session.load(Student.class, id);
			//事务提交
			
			tran.commit();
		}catch(Exception e){
			
			e.printStackTrace();
			
			tran.rollback();
			
		}finally{
			
			session.close();
		}
		return student;
	}
}



