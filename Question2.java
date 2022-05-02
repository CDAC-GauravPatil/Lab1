package Saturday_lab_Assignment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// Reading input from two files and storing it in a third file

public class Question2 {

	public static void main(String[] args) throws Exception
	{
		FileReader i = new FileReader ("Rohit.txt");
		
		File x =new File("Rohit.txt");
		
		int len1 = (int) x.length();
		
		char c[] = new char [len1];
		
		FileReader j =new FileReader ("Rohit2.txt");
		
		File y = new File ("Rohit2.txt");
		
		int len2 = (int) y.length();
		
		char d[] = new char [len2];
		
	FileWriter w = new FileWriter("Rohit3.txt");
	
	i.read(c);
	j.read(d);
	w.write(c);
	w.write(d);
	i.close();
	j.close();
	w.close();
	}

}
