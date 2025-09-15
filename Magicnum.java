import java.util.*;
public class Magicnum
{
  public static void main(String[]args)
  {
    Scanner sc =new Scanner(System.in);
    int n,sum,reverse,res;
    System.out.print("Enter the number:");
    n=sc.nextInt();
    sc.close();
    Find f=new Find();
    sum=f.Sum(n);
    reverse=f.reverse(sum);
    res=f.mul(sum,reverse);
    if(res==n) 
    System.out.println(n+ " is a magic number"); 
    else
    System.out.println(n+ " is not a magic number");
  }
}
class Find
{
   int Sum(int n)
   { 
      int temp=n,r,sum=0;
       while(temp>0)
       {
         r=temp%10;
         sum=sum+r;
         temp=temp/10;
       }
     System.out.println("Sum=" +sum);
        return sum;
     
   }
   int reverse(int n)
   {
     int temp=n,r,rev=0;
       while(temp>0)
       {
         r=temp%10;
         rev=(rev)*10+r;
         temp=temp/10;
       }
         System.out.println("rev=" +rev);
     return rev;
 
   }
   int mul(int sum,int rev)
   {
      int res;
      res=(sum)*(rev);
      System.out.println("res=" +res);
      return res;
   }
}