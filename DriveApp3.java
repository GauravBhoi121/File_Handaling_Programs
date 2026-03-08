import java.util.*;
import java.io.File;
public class DriveApp3
{
      public static void main(String args[])
      {
           File f=new File("C:\\file_handaling");
           
           File list[]=f.listFiles();
           for(int i=0;i<list.length;i++)
           {
                   if(list[i].isDirectory())
                    {
                       System.out.println(list[i]);
                    }
           }
       }
}