// first we created the file then we reads this file using the buffered reader class in java 
// using justine beiber song 
import java.util.*;
import java.io.*;
class FilereaderApp
{
      public static void main(String args[])throws Exception
      {
            Scanner sc=new Scanner(System.in); 

            FileReader fr=new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\java_programming_Files\\creatingFileApp\\abc.txt");
             int data;
		 while((data=fr.read())!=-1) {
			 System.out.print((char)data);
			Thread.sleep(100);
		 }
        }
}