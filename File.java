import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class File
{
    public static void main(String[] args)throws IOException
   {
    FileInputStream in=null;
    FileOutputStream out=null;
    try
   {
    in=new FileInputStream("C:\\JAVA1\\day 10 assign\\abc.txt");
    out=new FileOutputStream("C:\\JAVA1\\day 10 assign\\xyz.txt");
    int n;
    while((n=in.read())!=-1)
    {
    out.write(n);
    }
    }
    finally
    {
    if(in!=null)
    {
    in.close();
     }
    if(out!=null)
    {
    out.close();
    }
    }
    in=new FileInputStream("C:\\JAVA1\\day 10 assign\\xyz.txt");
    int n;
    while((n=in.read())!=-1)
    {
    System.out.print((char)n);
    }
}
}