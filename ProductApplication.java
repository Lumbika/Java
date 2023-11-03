public class ProductApplication
{
    public static void main(String args[])
    {
      String pname =" Face serum";
      int pcode=86326795;
      int pid=1123;
      int pap=5000;
      int psp=4500;
      int pquantity=1;
      int ptotalcost= psp*pquantity;
      
      
      System.out.println("Product name is:" +pname);
      System.out.println("Product code is:" +pcode);
      System.out.println("Product ID is:" +pid);
      System.out.println("Product actual price is:" +pap);
      System.out.println("Product special price is:" +psp);
      System.out.println("Product quantity is:" +pquantity);
      System.out.println("Product total cost is:" +ptotalcost);
      if (ptotalcost>=10000)
      {
       double pdiscount=(50.0/100)*ptotalcost;
       double ptotal_payable= ptotalcost-pdiscount;
       System.out.println("discount is:"+pdiscount);
      System.out.println("Product cost after discount is:"+ptotal_payable);
      }
     else  if (ptotalcost>=8000)
      {
       double pdiscount=(30.0/100)*ptotalcost;
       double ptotal_payable= ptotalcost-pdiscount;
       System.out.println("discount is:"+pdiscount);
      System.out.println("Product cost after discount is:"+ptotal_payable);
      }
      else if (ptotalcost>=2000)
      {
       double pdiscount=(10.0/100)*ptotalcost;
       double ptotal_payable= ptotalcost-pdiscount;
       System.out.println("discount is:"+pdiscount);
      System.out.println("Product cost after discount is:"+ptotal_payable);
      }
      else if (ptotalcost>=1000)
      {
       double pdiscount=(1.0/100)*ptotalcost;
       double ptotal_payable= ptotalcost-pdiscount;
       System.out.println("discount is:"+pdiscount);
      System.out.println("Product cost after discount is:"+ptotal_payable);
      } 
      else
      { 
        System.out.println("no discount");
      }
    }
}