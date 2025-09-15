class One 
{
    int rno;
    String name;
    static String clg;
    static
    {
        clg = "SRKR";
        //System.out.println("In static ");
    }
    public One()
    {
      //  System.out.println("In constructor ");
        rno = 1;
        name = "kk";

    }
    public static void display(One obj)
    {
        System.out.println(obj.rno+ " | " +obj.name+ " | " +clg);
    }

}

public class Main
{
    public static void main(String[]args)
    {
        One o1 = new One();
        // One o2 = new One();
        //o1.display();
        One.display(o1);
        
    }
}