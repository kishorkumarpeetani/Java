import java.io.*;
class Filecopychar
{
    public static void main(String[]args)
    {
            
        try{
        FileWriter fo=new FileWriter("source1.txt");
        fo.write("Hello from source");
        fo.close();
        FileReader in=new FileReader("source1.txt");
        FileWriter out=new FileWriter("destin1.txt");
        int charRead;
        while((charRead=in.read())!=-1)
        {
            out.write(charRead);
        }
        in.close();
        out.close();
        System.out.println("Copied");
        }
        catch(IOException e)
        {
             e.printStackTrace();
        }
    
    }
}