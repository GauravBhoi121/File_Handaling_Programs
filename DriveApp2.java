import java.util.*;
import java.io.File;
public class DriveApp2
{
      public static void main(String args[])
      {
           File f=new File("C:\\file_handaling\\create_secondfile");
          
           if(f.exists())
           {
               System.out.println("file is already created");
           }
           else
           {
              boolean b=f.mkdir();
             if(b)
             {
                System.out.println("new file is created");
             }
             else
             {
                 System.out.println("check file path");
             }
          }
     }
}