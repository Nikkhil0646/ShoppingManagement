package Shopping.TheardAndExcepation;
import Shopping.Customer.*;

public class deliveredThread extends Thread
{
    //int flagDelivered;
    String threadName;
    public customer thisCustomer=new customer();;

    public deliveredThread()
    {
        this.threadName="DELIVERY THREAD";      //delivery status notification thread

    }
    public void run()
    {
        try
        {
            Thread.sleep(7500);
            System.out.println("\n\t\t\tSTARTED PACKING YOUR PRODUCTS(S) :)");
            Thread.sleep(7500);
            System.out.println("\n\t\t\tSHIPPED :)");
            Thread.sleep(10000);
            System.out.println("\n\t\t\tOUT FOR DELIVERY :)");
            Thread.sleep(15000);
            thisCustomer.customerDeliveryStatus=1;
            //flagDelivered=1;
            System.out.println("\n\t\t\tPRODUCT DELIVERED :)");
            //thisCustomer.checkStatus(thisCustomer,1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("\n\t\t\t HAPPY SHOPPING ;-)");
            //or else change status here :)
        }
    }
}
