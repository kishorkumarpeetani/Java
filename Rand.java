class Display
{
    public synchronized void display(String s){
        System.out.println(s);
    }
}

public class Rand
{    
    public static void main(String[] args) {

        Display d = new Display();

        Runnable obj1 = () ->{
            for(int i = 0; i < 5 ; i++){
                d.display("Obj-1");
                try{ Thread.sleep(100); } catch(Exception e){ System.out.println(e); }
            } 
        };
        Runnable obj2 = () ->{
            for(int i = 0; i < 5 ; i++){
                d.display("Obj-2");
                try{ Thread.sleep(100); } catch(Exception e){ System.out.println(e); }
            } 
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
 
        t1.start();
        t2.start();

    }
}
