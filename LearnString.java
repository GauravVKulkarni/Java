import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);

        Scanner in = new Scanner(System.in);

        int num = 0;

        try {
            num = in.nextInt();
            System.out.println(num);
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("okk");
        }
        in.close();
    }
}