public class Cmd
{
 public static void main(String[]args)
 {  
    //int a[]=new int[2];
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    if(args.length>2)
    System.out.println("Enter two values only");
    else
    { 
     System.out.println("sum of " +a+ " and " +b+ " is " +(a+b));
    }
 }
}