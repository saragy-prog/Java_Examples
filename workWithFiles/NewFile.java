package com.workWithFiles;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import com.sun.tools.sjavac.Log.Level;


public class NewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "test.txt";
		String fullName = "";
		String dirName = System.getProperty("user.dir");
		fullName = dirName + File.separator + fileName;
		System.out.println("File path : " + fullName);
		File file = new File(fullName);

		if (!file.exists()) {
			try {
				if (file.createNewFile())

					System.out.println("File created!");
				else
					System.out.println("Something Wrong!");
			} catch (IOException ex) {
				Logger.getLogger(Filetest.class.getName()).log(Level.SEVERE, null, ex);
			}
		} else {
			System.out.println("File already exists!");

			String dirname = dirName + "/tmp/user/java/bin";
			File d = new File(dirname);
			// Create directories now.
			d.mkdirs();

		}
	}

}
