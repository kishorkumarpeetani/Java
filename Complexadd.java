import java.util.*;
public class Complexadd
{
 int a,b;
  void realvalue(int r)
  { 
    a=r;
    System.out.println(a);
  
  }
  void imgvalue(int i)
  {
    b=i;
    System.out.println(b);
  }

 public static void main(String[]args)
 {
  int r1,r2,i1,i2;
  Scanner sc =new Scanner(System.in);
  Complexadd obj1=new Complexadd();
  Complexadd obj2=new Complexadd();

   System.out.println("Enter the real and img parts of first complex no:");
   System.out.print("Enter the real part:");
   r1=sc.nextInt();
   obj1.realvalue(r1);
   System.out.print("Enter the img part:");
   i1=sc.nextInt();
   obj1.imgvalue(i1);
 
   System.out.println("Enter the real and img parts of second complex no:");
   System.out.print("Enter the real part:");
   r2=sc.nextInt();
   obj2.realvalue(r2);
   System.out.print("Enter the img part:");
   i2=sc.nextInt();
   obj2.imgvalue(i2);
  /* real=obj1.a+obj2.a;
   img=obj1.i+obj2.i;
   System.out.println(real+ "+" +img+ "i");
   */
  sc.close();
  } 
  
}


/*class Calculate 
{
  int a,b;
  void realvalue(int r)
  { 
    a=r;
    //System.out.println(a);
  
  }
  void imgvalue(int i)
  {
    b=i;
   // System.out.println(b);
  }
  int addreal()
  {
       int r=((obj1.a)+(obj2.a));
       return r;   
  }
  
  int addimg()
  {
     int img=((obj1.i)+(obj2.i)); 
     return img;
  }
  
  
} */
