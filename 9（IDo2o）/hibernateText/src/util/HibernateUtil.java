package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{

	private static  SessionFactory sf;
	
	static
	{
		sf=new Configuration().configure().buildSessionFactory();
	}
	
	public static Session getSesstion()
	{
		return sf.openSession();
	}
	
	/*public static void main(String[] args)
	{
		System.out.println(HibernateUtil.getSesstion());
	}*/
}
