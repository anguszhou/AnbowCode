package com.ambow.corejava.day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {

		try {
			System.out.println(TestDate.strToDate("2010-02-25"));
			Date ww = TestDate.strToDate("2010-02-25");
			Stu stu = new Stu("allan", ww);

			System.out.println(stu);
			System.out.println(stu.getDate().getMonth() );

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Date strToDate(String str) throws ParseException {

		String strFormat = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(strFormat);
		return sdf.parse(str);

	}

}

class Stu {

	String name;

	Date date;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

	public Stu(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}

	public String toString() {

		return name;
	}
}