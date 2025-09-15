class ageexception extends Exception
{
    public ageexception(String message)
    {
        super(message);
    }
}
class except
{
    public static void main(String[]args)
    {
        try
        {
            validateage(11);
            //System.out.println(s.length());
        }
        catch(ageexception e)
        {
            System.out.println(e.getMessage());
        }
    }    
        public static void validateage(int age) throws ageexception 
        {
                if(age<18)
                throw new ageexception("Warning !! Age <18");
                else
                System.out.println("Age >18");
        }
        
    
}