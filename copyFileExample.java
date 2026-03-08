import java.io.File;
import java.util.*;
public class copyFileExample
{
       public static void main(String[] args)
       {
        try (FileInputStream fis = new FileInputStream();FileOutputStream fos = new FileOutputStream())
           {
            
            int ch;
            while ((ch = fis.read()) != -1)
            {
                fos.write(ch);
            }
            System.out.println("File copied successfully.");
        } 
        catch (IOException e)
        {
            System.out.println("Exception is ");
        }
    }
}