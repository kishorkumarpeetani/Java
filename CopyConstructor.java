class CopyConstructorExample
{
private String name;
private int age;
CopyConstructorExample(String n,int a)
{
name=n;
age=a;
}
CopyConstructorExample(CopyConstructorExample e)
{
name=e.name;
age=e.age;
}
void display()
{
System.out.println("name="+name+"\nage="+age);
}
}
public class CopyConstructor {
    public static void main(String[] args) {
CopyConstructorExample obj1= new CopyConstructorExample("janu",30);
CopyConstructorExample obj2= new CopyConstructorExample(obj1);
obj1.display();
obj2.display();
}
}