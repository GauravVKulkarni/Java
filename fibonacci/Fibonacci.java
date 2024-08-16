import java.util.Scanner;

class Fibonacci{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    FibCheck(num);
  }
  public static void FibCheck(int n){
    if(n<1){
      System.out.println("invalid input");
      return;
    }
    if(n==1){
      System.out.println(0);
      return;
    }
    int t1 = 0;
    int t2 = 1;
    int t3 = 0;
    System.out.print(t1+" "+t2+" ");
    for(int i = 3 ;i <= n; i++){
      t3 = t1 + t2;
      System.out.print(t3+" ");
      t1 = t2;
      t2 = t3;
    }
    System.out.println();
    return;
  }
}
