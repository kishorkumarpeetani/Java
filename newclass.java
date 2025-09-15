class constructor1
{
    int a;
    int b;
    public constructor1(int a,int b)
    {
         this.a=a;
         this.b=b;
    }
    public void area()
    {
       // int ar=a*b;
        System.out.println("Area is " +(a*b));
    }
}
class newclass
{
    public static void main(String[]args)
    {
        constructor1 c=new constructor1(1,2);
        c.area();
    }
}