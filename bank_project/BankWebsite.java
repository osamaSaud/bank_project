
import java.io.File;
import java.util.Scanner;


public class BankWebsite {
    
    static Scanner input;
    static File file;
    
    
    public static void welcome (){
        while (true){
            System.out.println("---------------------------------------------------");
            System.out.println("Welcome to THE BANK WEBSITE");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Create account");
            System.out.println("2. Exit from website");
            System.out.print("Enter Your Choice: ");

            char c = input.next().charAt(0);
            switch (c){
                case '1' : 
                    createAccount();
                    break;
                case '2' : 
                    System.exit(0);
                    break;
                default : System.out.println("error , try again ...");
            } 
        }
        
    }
    
    public static void createAccount (){
        System.out.println("----------- Enter Account Type -------------");
        System.out.println("----------- 1: Open Normal Account  -------------");
        System.out.println("----------- 2: Controlled Account -------------");
        System.out.println("----------- 3: Restricted account -------------");
        
        user User=null;
        boolean t = false;
        while (true){
            char c = input.next().charAt(0);
            switch (c){
                case '1' : 
                	User = new NormalAccoun();
                    t = true;
                    break;
                case '2' : 
                	User = new ControlledAccount();
                    t = true;
                    break;
                case '3' : 
                	User = new RestricteAccount();
                    t = true;
                    break;
                default : System.out.println("error , try again ...");
            }

            if (t)
                break;
            
        }
    }
    
    public static void operations(user user){
        System.out.println("----------- Enter Operation type -------------");
        
        if (user instanceof NormalAccoun){

        	NormalAccoun obj = (NormalAccoun) user;
            
            System.out.println("----------- 1: Deposit -------------");
            System.out.println("----------- 2: Witdraw -------------");
            System.out.println("----------- 3: Balance -------------");
            System.out.println("----------- 4: Transfer -------------");
            System.out.println("----------- 5: Return to main -------------");
            int c =0;
            c = input.nextInt();
            input.nextLine();
            double amount;
            switch (c){
                case 1 : 
                    System.out.println("Enter amount");
                    amount = input.nextDouble();
                    obj.deposit(amount);
                    break;
                case 2 : 
                    System.out.println("Enter amount");
                    amount = input.nextDouble();
                    obj.withdraw(amount);
                    break;
                case 3 : 
                    System.out.print("balance is :");
                    System.out.println(obj.getBalance());
                    break;
                case 4 : 
                    System.out.println("Enter amount");
                    amount = input.nextDouble();
                    obj.Transfer(amount);
                    break;
                case 5 : 
                    return;
            }
            
        }else if (user instanceof ControlledAccount){

        	ControlledAccount obj = (ControlledAccount) user;
        	 System.out.println("----------- 1: Deposit -------------");
             System.out.println("----------- 2: Witdraw -------------");
             System.out.println("----------- 3: Balance -------------");
             System.out.println("----------- 4: Transfer -------------");
             System.out.println("----------- 5: Return to main -------------");
             
             int c =0;
             c = input.nextInt();
             input.nextLine();
             double amount;
             switch (c){
                 case 1 : 
                     System.out.println("Enter amount");
                     amount = input.nextDouble();
                     obj.deposit(amount);
                     break;
                 case 2 : 
                     System.out.println("Enter amount");
                     amount = input.nextDouble();
                     obj.withdraw(amount);
                     break;
                 case 3 : 
                     System.out.print("balance is :");
                     System.out.println(obj.getBalance());
                     break;
                 case 4 : 
                     System.out.println("Enter amount");
                     amount = input.nextDouble();
                     obj.Transfer(amount);
                     break;
                 case 5 : 
                     return;
             }
            
        }else {
            //student account
        	RestricteAccount obj = (RestricteAccount) user;
       	 System.out.println("----------- 1: Deposit -------------");
            System.out.println("----------- 2: Witdraw -------------");
            System.out.println("----------- 3: Balance -------------");
            System.out.println("----------- 4: Transfer -------------");
            System.out.println("----------- 5: Return to main -------------");
            char c = input.next().charAt(0);
            double amount;
            switch (c){
                case '1' : 
                    System.out.println("Enter amount");
                    amount = input.nextDouble();
                    obj.deposit(amount);
                    break;
                case '2' : 
                    System.out.println("Enter amount");
                    amount = input.nextDouble();
                    obj.withdraw(amount);
                    break;
                case '3' : 
                    System.out.print("balance is :");
                    System.out.println(obj.getBalance());
                    break;
                case '4' : 
                    System.out.println("Enter amount");
                    amount = input.nextDouble();
                    obj.Transfer(amount);
                    break;
                case '5' : 
                    return;
            }
            
        }
    }
    
    public static void main(String[] args) {
        input = new Scanner (System.in);
        file = new File ("history.txt");
        welcome();
    }
    //
}
//
//while (true) {
//    System.out.println("----------- Enter Operation type -------------\n"
//            + "----------- 1: Deposit -------------\n"
//            + "----------- 2: Witdraw -------------\n"
//            + "----------- 3: Balance -------------\n"
//            + "----------- 4: Main Menu -------------");
//    choice = s.nextInt();
//    s.nextLine();
//    switch (choice) {
//        case 1:
//            System.out.print("enter the amount to deposit: ");
//            amount = s.nextInt();
//
//            cus.deposit(amount);
//            s.nextLine();
//            System.out.println("");
//            break;
//        case 2:
//            System.out.print("enter the amount you want to withdraw: ");
//            amount = s.nextInt();
//            cus.withdraw(amount);
//            s.nextLine();
//            System.out.println("");
//            break;
//        case 3:
//            System.out.print("your account balance is: $");
//            System.out.println(cus.getBalance());
//            break;
//        case 4:
//            return;
//
//    }
//
//}
//
//}