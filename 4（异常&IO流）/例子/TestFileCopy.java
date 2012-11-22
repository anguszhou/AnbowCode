package com.ambow.corejava.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFileCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileOutputStream fos = null;

		FileInputStream fis = null;

		try {

			fos = new FileOutputStream("d:\\copytest.xls");

			fis = new FileInputStream("d:\\test.xls");

			byte[] b = new byte[1024];

			int len;

			while ((len = fis.read(b)) != -1) {

				fos.write(b, 0, len);
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (Exception e2) {

			}

		}
	}

}
