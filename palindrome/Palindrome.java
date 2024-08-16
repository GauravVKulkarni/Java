import java.util.Scanner;

class Palindrome{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String str = sc.next();
    CheckPal(str);
  }
  public static void CheckPal(String str){
    for (int i=0; i<str.length()/2; i++){
      if(str.charAt(i)!=str.charAt(str.length()-1-i)){
        System.out.println("not palindrome");
        return;
      }
      System.out.println("Palindrome");
      return;
    }
  }
}
