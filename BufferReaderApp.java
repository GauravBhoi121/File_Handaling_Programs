// we write the string buffer reader file data we use the file reade by buffer reader
import java.util.*;
import java.io.*;
class BufferReaderApp
{
    public static void main(String args[])throws Exception
    {
       File f=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\java_programming_Files\\creatingFileApp\\abc.txt");
       FileReader fr=new FileReader(f);
       BufferedReader br=new BufferedReader(fr);
       String Line=null;
       while((Line=br.readLine())!=null)
       {
          System.out.println(Line);
          Thread.sleep(500);
       }
   }
}