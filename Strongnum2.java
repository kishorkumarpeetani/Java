import java.util.*;
class Strongnum2
{
 public static void main(String[]args)
 {  Scanner sc=new Scanner(System.in);
    int n;
    System.out.print("Enter the number:");
    n=sc.nextInt();
    Sum s=new Sum();
    s.calculate(n);
 }
}
class Sum
{ 
 void calculate(int k)
 {
   int r,i,f=1,sum=0,temp;
   temp=k;
   while(temp>0)
   {
     r=temp%10;
     for(i=1;i<=r;i++)
     { 
        f=f*i;
     } 
     sum=sum+f;
     f=1;
     temp=temp/10;
   }
   if(sum==k)
   System.out.println(k+" is a Strong number");
   else
    System.out.println(k+" is not a Strong number");
 } 
}

 