 class A{
    int a = 10;
    void show1(){
        System.out.println("In show1 Method");
    }
    static class B{
        void show(){
            System.out.println("In show Method");
        }
    }
 }

public class Inner{
    public static void main(String[]args){    
    //    A a = new A();
    //    A.B b = a.new B();
       A.B b = new A.B();
       b.show();
    }
}