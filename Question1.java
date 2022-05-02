package Saturday_lab_Assignment;
//.Reading input from a   file and displaying it in the console
import java.io.*;

public class Question1 {

	public static void main(String[] args)throws Exception
	{
		
			FileInputStream a = new FileInputStream ("Rohit.txt");
		    int b; 
		     do {
			
		     b= a.read();
		
		          System.out.print((char)b);
		// 
		}while(b != -1);
		
		     a.close();
	}

}
