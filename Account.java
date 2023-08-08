import java.util.Scanner;

class DemoAccount {
    int accno;
    String name;
    int phone_No;
    //float initial_bal;
    float balance_amt;
    final float MINIMUM_BAL = 500;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the phone number");
        phone_No = sc.nextInt();
        System.out.println("Enter the account number");
        accno = sc.nextInt();
        System.out.println("Enter the initial balance");
        balance_amt = sc.nextInt();
    }

    void deposit(float amount) {
        balance_amt += amount;
    }

    void withdraw(float amount) {
        if(balance_amt-amount < MINIMUM_BAL)    System.out.println("Withdrawal not possible");
        else    balance_amt -= amount;
    }

    public String toString() {
        return "Dear "+name+" , your account number - "+accno+" has the balance of Rs."+balance_amt; 
    }
}

public class Account {
    public static void main(String[] args) {
        DemoAccount ac = new DemoAccount();
        ac.getInput();
        System.out.println(ac);
        System.out.println("Making a deposit of Rs.25000");
        ac.deposit(25000f);
        System.out.println(ac);
        System.out.println("Making a withdrawal of Rs.5000");
        ac.withdraw(5000f);
        System.out.println(ac);
    }
}
