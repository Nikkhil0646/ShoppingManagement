package Shopping.TheardAndExcepation;


public class passwordException extends Exception
{
    public passwordException(String m)
    {
        super(m);
    }
    public String toString()
    {
        return "\n\tINVALID PASSWORD PATTERN :/\n";
    }
}
