import java.util.Scanner;

class GcdLcm{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter two numbers: ");
    
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    GCD(num1, num2);
    LCM(num1, num2);

   sc.close();
  }

  static void GCD(int n1, int n2){
    
    int numGCD = 0;

    for (int i = 1; i <= n1 ; i++){
      
      if(n1 % i == 0 && n2 % i == 0){
         numGCD = i;
      }
    }
    
    System.out.println("GCD = "+numGCD);
  }

  static void LCM(int n1, int n2){
    
    for (int i = 1; i < 100; i++){
      
      if((n1 * i) % n2 == 0){
        System.out.println("LCM = "+n1*i);
        break;
      }
    }
  }
}
