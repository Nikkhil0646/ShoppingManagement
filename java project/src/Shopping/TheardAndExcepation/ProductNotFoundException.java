package Shopping.TheardAndExcepation;

public class ProductNotFoundException extends Exception
{
    // serialVersionUID -writing streams and from which it can read
    private static final long serialVersionUID = 1L;
    public ProductNotFoundException(String msg)
    {
        super(msg);
    }

    public String toString()
    {
        return "\n\tPRODUCT NOT FOUND :/\n";
    }
}
