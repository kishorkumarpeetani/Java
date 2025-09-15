class Try{
  void show(){
    System.out.print("In Try show");
  }
  void show2(){
    System.out.println("In Try show 2 ");
  }
}

class Demo
{
  public static void main(String[]args){
    //  Try t = new Try();
    //  t.show();

     Try t1 = new Try()
     {
        void show(){
           System.out.println("In t1 show");
        }
        void show2(){
            System.out.println("In t1 show 2 ");
         }
     };
    //  t1.show();
     t1.show2();

  }
}