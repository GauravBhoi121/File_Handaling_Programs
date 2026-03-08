// creating the file app there if check the file is there or not if not then create the file and show the file in folder 
import java.util.*;
import java.io.File;
class creatingFileApp
{
     public static void main(String args[])
     {
        File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\java_programming_Files\\creatingFileApp");
 
        if(f.exists())
        {
            System.out.println("File is there");
        }
        else{ 
             boolean b=f.mkdir();
             if(b){System.out.println("File is there");}else{System.out.println(" some problem is there");}
           }
     }
}