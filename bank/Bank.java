import java.util.Scanner;
class Bank{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int balance = 0;
    int choice = 0;
    while(choice!=4){
      System.out.println("1: Deposit    2: Withdraw   3: Balance Inquiry    4: Exit");
      choice = in.nextInt();
      switch(choice){
        case 1: System.out.println("Enter Amount:");
                try{
                  balance = in.nextInt();
                }
                catch(Exception e){
                  System.out.println(e);
                }
        break;
        case 2: System.out.println("Enter Amount");
                try{
                  int amt = in.nextInt();
                  if(amt>balance){
                    System.out.println("Insufficient balance");
                  }
                  else{
                    balance -= amt;
                  }
                }
                catch(Exception e) {
                  System.out.println(e);
                  break;
                }
        break;
        case 3: System.out.println("Balance: "+balance);;
        break;
        case 4:
        break;
        default: System.out.println("Enter valid option. Enter 4 to exit.");
        break;
      }
    }
  }
}
