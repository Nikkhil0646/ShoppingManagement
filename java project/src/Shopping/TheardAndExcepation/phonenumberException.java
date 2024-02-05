package Shopping.TheardAndExcepation;

public class phonenumberException extends Exception
{
    // because phone number does not excite 10 number exception
    public phonenumberException(String m)
    {
        super(m);
    }
    public String toString()
    {
        return "\n\tINVALID PHONE NO :/\n";
    }
}