import java.util.Scanner;
class Prime{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    PrimeCheck(num);
  }
  public static void PrimeCheck(int n){
    if(n<1){
      System.out.println("Invalid number");
      return;
    }
    else if(n==1){
      System.out.println("Composite number");
      return;
    }
    else if(n == 2 || n == 3){
      System.out.println("Prime");
      return;
    }
    for(int i = 2; i <= n/2; i++){
      if (n%i == 0){
        System.out.println("Not Prime");
        return;
      }
    }
    System.out.println("Prime");
  }
}
