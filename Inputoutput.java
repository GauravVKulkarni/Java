import java.util.Scanner;
public class Inputoutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter a number: ");
        n = in.nextInt();
        System.out.println("the number was "+n);
        in.close();
    }
}
