package com.ambow.corejava.day4;

public class TestException {

	public static void main(String[] args) {

		try {

			System.out.println("Car.main()");

			return;

		}  catch (Exception e) {

		} finally {

			System.out.println("finally======");

		}
	}
}
