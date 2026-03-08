// using file writer class write thefile int this 
import java.util.*;
import java.io.*;
class WriterApp
{
      public static void main(String args[])
      {
          
       try{
          FileWriter fw =new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\java_programming_Files\\creatingFileApp\\abc.txt",true);
          Scanner sc=new Scanner(System.in);
          System.out.println("Write the data here");
          String data=sc.nextLine();
       
          fw.write(data);
          fw.close();
          System.out.println(" file is write in this ");
        }
       catch(Exception e)
       {
           System.out.println("Exception"+e);
       }
          
      }
} 