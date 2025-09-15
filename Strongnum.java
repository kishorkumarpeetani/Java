import java.util.*;
class Strongnum
{
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   int n,r,sum=0,i,f=1,temp;
   System.out.print("Enter the no:");
    n=sc.nextInt();
    temp=n;
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
   if(sum==n)
   System.out.println(n+" is a Strong number");
   else
    System.out.println(n+" is not a Strong number");
   
 }
} 
