package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

      BankAccount account1 = new BankAccount();
      account1.setInfo("Ahmet Ozkok",123345566);
        System.out.println(account1);
        account1.deposit(1000);
        account1.chekBalance();
        account1.withdraw(900);
        account1.chekBalance();
        System.out.println("-------------------------------------------------");

        BankAccount account2 =new BankAccount();
        account2.setInfo("Aygun",3455555);
        account2.deposit(10000);









    }
}
