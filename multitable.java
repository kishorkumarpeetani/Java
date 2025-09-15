class table
{
    static synchronized void print(int n)
    {
        for(int i=0;i<11;i++)
        {
            try
            {
                System.out.println(n+"*"+i+"="+(n*i));
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    } 
}
class Tableone extends Thread
{
    public void run()
    {
        table.print(4);
    }
}
class Tabletwo extends Thread
{
    public void run()
    {
        table.print(7);
    }
}
class multitable
{
    public static void main(String []args)
    {
        Tableone t1=new Tableone();
        Tabletwo t2=new Tabletwo();
        t1.start();
        t2.start();
        
    }
}