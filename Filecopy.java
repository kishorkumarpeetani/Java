import java.io.*;
class Filecopy
{
    public static void main(String[]args)
    {
            
        try{
        FileOutputStream fo=new FileOutputStream("source.txt");
        fo.write("Hello from source".getBytes());
        FileInputStream in=new FileInputStream("source.txt");
        FileOutputStream out=new FileOutputStream("destin.txt");
        int byteRead;
        while((byteRead=in.read())!=-1)
        {
            out.write(byteRead);
        }
        System.out.println("Copied");
        fo.close();
        in.close();
        out.close();
        }
        catch(IOException e)
        {
             System.out.println(e);
        }
    }
}