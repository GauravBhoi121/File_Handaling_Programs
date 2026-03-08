/* 1.How do you list all files from a folder/directory in Java?
   2.How do you delete a file in Java?
   3.How do you copy the content of one file into 
   4.Write a program to:
     Create a Student class with fields: id, name, marks.
     Serialize multiple Student objects into a file.
     Deserialize them back and print their details.*/
import java.util.*;
import java.io.File;
public class listofFile
{
        public static void main(String args[])
        {
        File f=new File("c:\\file_handaling");
        
        File file[]=f.listFiles();
 
        if(file != null)
        {
               for(File fl:file)
               {
                   if(fl.isFile())
                   {
                       System.out.println("file : "+fl.getName());
                   }
                   else if(f.isDirectory())
                   {
                      System.out.println(" Directory : "+fl.getName());
                   }
                   else
                   {
                      System.out.println("File is not present");
                   }
             }
        }
         
           //file deleted 
          
           if(f.delete())
           {
                System.out.println("file is : "+f.getName());
           }
           else 
           {
               System.out.println("failed to delete the file");
           }
           
     }
  }
      