import java.util.Scanner;

 abstract class Account{
    String cName,accNum,accType;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    Scanner sc = new Scanner(System.in);

    Account(String name,String accNo,String accType){
        this.cName = name;
        this.accNum = accNo;
        this.accType = accType; 
    }
    Account(){};
}

class CurrentAcc extends Account{
    private double balance = 5000,rate = 0.06;

    CurrentAcc(String name,String accNo,String accType){
        super(name,accNo,accType);
        System.out.println("Welcome " + cName);
    }

    void getBalance() {
        System.out.format("Your balance: %f\n",balance);
    }

    void deposit(double amount){
        char choice;
        System.out.println("Deposit. Account holder: " + cName + " Amount: " + amount);
        System.out.println("Approve Deposit?(Y/N): ");
        choice = sc.next().charAt(0);
        if(choice == 'Y' || choice == 'y'){
            balance+=amount;
            System.out.println(ANSI_GREEN + "Deposit approved. Updated balance: " + balance + ANSI_RESET);
        }else{
            System.out.println(ANSI_RED + "Deposit not approved" + ANSI_RESET);
        }
    }
    
    void withdraw(double amount){
        System.out.println(ANSI_RED + "This account cannot withdraw any funds" + ANSI_RESET);
    }

    void calcInterest() {};
    void checkMinAmount(){
        if(balance < 3000){
            balance-=500;
            System.out.println(ANSI_RED + "Balance under minimum amount to be maintained." + ANSI_RESET);
            System.out.println(ANSI_RED + "Penalty imposed. Updated balance: " + balance + ANSI_RESET);
        }
    }
}

class SavingsAcc extends Account{
    private double balance = 5000,rate = 0.06;

    SavingsAcc(String name,String accNo,String accType){
        super(name,accNo,accType);
        System.out.println("New Customer: " + cName);
    }

    void getBalance() {
        System.out.format("Your balance: %f\n",balance);
    }

    void deposit(double amount){
        char choice;
        System.out.println("Deposit. Account holder: " + cName + " Amount: " + amount);
        System.out.println("Approve Deposit?(Y/S): ");
        choice = sc.next().charAt(0);
        if(choice == 'Y' || choice == 'y'){
            balance+=amount;
            System.out.println(ANSI_GREEN + "Deposit approved. Updated balance: " + balance + ANSI_RESET);
            calcInterest();
            checkMinAmount();
        }else{
            System.out.println(ANSI_RED + "Deposit not approved" + ANSI_RESET);
        }
    }

    void calcInterest(){
        double CI;

        CI = balance * (Math.pow((1+rate/100),2));
        balance+=CI;
        System.out.println(ANSI_GREEN + "Interest added. Updated balace: " + balance + ANSI_RESET);
    }
    
    void withdraw(double amount){
        char choice;

        
        if(balance < amount){
            System.out.println(ANSI_RED + "Account balance is lower than amount to be withdrawn" + ANSI_RESET);
            return;
        }
        System.out.println("Approve " + cName + "'s request for withdrawal? (Y/N): ");
        choice = sc.next().charAt(0);
        if(choice == 'Y' || choice == 'y'){
            balance-=amount;
            System.out.println(ANSI_GREEN + "Withdrawal approved. Updated balance: " + balance + ANSI_RESET);
            calcInterest();
            checkMinAmount();
        }else{
            System.out.println(ANSI_RED + "Withdrawal not approved" + ANSI_RESET);
        }
        
    }

    void checkMinAmount(){
        int minAmount = 3000,penalty = 500;
        if(balance < minAmount){
            balance-=penalty;
            System.out.println(ANSI_RED + "Balance under minimum amount to be maintained." + ANSI_RESET);
            System.out.println(ANSI_RED + "Penalty imposed. Updated balance: " + balance + ANSI_RESET);
        }
    }
}



public class Prog2 {
    public static void main(String[] args) {
        int c;
        double temp;

        String name,accNo,accType;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Account number: ");
        accNo = sc.nextLine();
        System.out.println("Enter Account Type: ");
        accType = sc.nextLine();
        
        if(accType.charAt(0) == 'c'){
            CurrentAcc a = new CurrentAcc(name, accNo, accType);
            while(true){
                System.out.println("1. Deposit money\n2. Withdraw money\n3. Display money\n4. Exit");
                c = sc.nextInt();
                switch(c){
                    case 1: {
                        System.out.println("Enter amount to be deposited: ");
                        temp = sc.nextDouble();
                        a.deposit(temp);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter amount to be withdrawn: ");
                        temp = sc.nextDouble();
                        a.withdraw(temp);
                        break;
                    }
                    case 3: {
                        a.getBalance();
                        break;
                    }
                    case 4: {
                        System.exit(0);
                        break;
                    }
                    default: System.out.println("Enter the correct options");
                }
    
            }
            
        }else if(accType.charAt(0) == 's'){
            SavingsAcc a = new SavingsAcc(name, accNo, accType);
            while(true){
                System.out.println("1. Deposit money\n2. Withdraw money\n3. Display money\n4. Exit");
                c = sc.nextInt();
                switch(c){
                    case 1: {
                        System.out.println("Enter amount to be deposited: ");
                        temp = sc.nextDouble();
                        a.deposit(temp);
            
                        break;
                    }
                    case 2: {
                        System.out.println("Enter amount to be withdrawn: ");
                        temp = sc.nextDouble();
                        a.withdraw(temp);
                        
                        break;
                    }
                    case 3: {
                        a.getBalance();
                        break;
                    }
                    case 4: {
                        System.exit(0);
                        break;
                    }
                    default: System.out.println("Enter the correct options");
                }
    
            }
            
        }else{
            System.out.println("Enter valid type... Exiting");
        }
    }
}