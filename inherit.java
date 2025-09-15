class one
{
    int a=1,b=2;
    void display()
    {
        System.out.println("class one");
    }
}
class two extends one
{
    void display1()
    {
        one o=new one();

        System.out.println((o.a)*(o.b));
    }
}
class inherit 
{
    public static void main(String[]args)
    {
        two t=new two();
        t.display();
        t.display1();
    }
}