//uging bufferWriter we write the file int this 
import java.util.*;
import java.io.*;
class BufferWriterApp
{
       public static void main(String args[])throws Exception
       {
          Scanner sc=new Scanner(System.in);
          FileWriter fw=new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\java_programming_Files\\creatingFileApp\\abc.txt",true);
          BufferedWriter bw=new BufferedWriter(fw);
    
           String data=sc.nextLine();
           bw.write(data);
           bw.newLine();
           System.out.println("file is done .................");
           bw.close();
           fw.close();
       }
}