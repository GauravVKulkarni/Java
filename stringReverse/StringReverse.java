import java.util.Scanner;

class StringReverse{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string");
    String str = sc.next();
    int l = str.length();
    StringBuilder sb = new StringBuilder();
    for(int i = l-1; i>=0; i--){
      sb.append(str.charAt(i));
    }
    System.out.println(sb);
  }
}
