import java.util.*;
class read
{ 
   public void input()
   {
     Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of Array:"); 
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the values of array:");
    int i;
    for(i=0;i<n;i++)
    {
      System.out.print("a["+i+"]:");
      a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
     System.out.print(a[i]);
     System.out.print(" ");
    } 
  }
}
public class D
{
 public static void main(String[]args)
 { 
   read obj=new read();
   obj.input();
    
  }
}