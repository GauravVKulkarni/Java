import java.util.Scanner;

class Factorial{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    System.out.println(Fac(num));
  }
  public static int Fac(int n){
    int factorial = 1;
    if(n < 0){
      return -1;
    }
    for(int i=1; i<=n; i++){
      factorial *= i;
    }
    return factorial;
  }
}
