import java.util.*;
class quad
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        float a,b;
        float c;
        double d,r1,r2;
        System.out.print("a=");
        a=sc.nextFloat();
        System.out.print("b=");
        b=sc.nextFloat();
        System.out.print("c=");
        c=sc.nextFloat();

        d=((b*b)-4*a*c);
        if(d==0)
        {
            System.out.println("Roots are equal");

            r1=r2=-(b)/(2*a);
            System.out.println("r1="+r1+ "\n r2=" +r2);
        }
        else if(d>0)
        {
            System.out.println("Roots are real and distinct");
            r1=(-b/(2*a))+(Math.sqrt(d)/2*a);
            r2=(-b/(2*a))-(Math.sqrt(d)/2*a);
            System.out.println("r1="+r1+ "\n r2=" +r2);
        }
        else
        {
            System.out.println("Roots are imag");
            r1=(-b/(2*a));
            r2=(Math.sqrt(-d)/2*a);
            System.out.println("r1=" +r1+ "+" +r2+ "i");
            System.out.println("r1=" +r1+ "-" +r2+ "i");

        }

    }
}