 class BankApplication {
    public static void main(String args[]) {
      int bank_application=9076;
      String bank_name=" bank_of_india";
      long account_number=9799476338287l;
      String person_name="Lumbi";
      int total=45000;
      int withdraw=4000;
      int balance_amount=total-withdraw;
      System.out.println("Bank application number is : " + bank_application);
      System.out.println("Bank name is : " + bank_name);
      System.out.println("Bank account number is : " + account_number);
      System.out.println("Bank person name is : " + person_name);
      System.out.println("Bank total amount is : " + total);
      System.out.println("Bank withdraw amount is : " + withdraw);
      System.out.println("Bank balance amount  is : " + balance_amount);
      if(balance_amount>100000)
           System.out.println("As your is balance is:"+balance_amount+"So You are eligible to apply for the credit card.");
      else if(balance_amount>50000)
           System.out.println("As your is balance is:"+balance_amount+" So You are eligible to apply for the health insurence.");
       else if(balance_amount>20000)
           System.out.println("As your is balance is:"+balance_amount+"So You are eligible to apply for the LIC.");
        else
           System.out.println("You are not eligible to apply for loan due to insufficient balance.");


      
      
      
      
      
      
    }
}