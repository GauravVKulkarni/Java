import java.util.Scanner;
import java.util.Arrays;

class CentralTendancy{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int[] arr = {73, 51, 40, 76, 38, 48, 87, 14, 24, 63, 14, 31, 14, 94, 61, 4, 33, 51, 75, 35, 12, 5, 91, 4, 14, 55, 27, 77, 50, 31, 34, 18, 17, 56, 32, 71, 37, 24, 47, 30, 9, 17, 95, 93, 71, 4, 56, 31, 20, 48, 44, 3, 85, 94, 46, 20, 12, 17, 29, 84, 68, 100, 77, 76, 52, 85, 21, 28, 84, 29, 15, 5, 57, 44, 23, 3, 64, 40, 25, 89, 68, 73, 77, 32, 11, 33, 12, 50, 26, 53, 32, 92, 39, 85, 51, 33, 43, 62, 98, 85};
    int l = arr.length;
    Arrays.sort(arr);

    int choice = 0;

    while(choice!=4){
      System.out.println("Enter choice:  1.Mean  2.Median  3.Mode  4.Exit");
      choice = sc.nextInt();

      switch(choice){
        case 1: Mean(arr, l);
              break;
        case 2: Median(arr, l);
              break;
        case 3: Mode(arr, l);
              break;
        case 4: break;
        default: System.out.println("Enter valid input. Enter 4 to exit");
      }
    }
  }
  
  public static void Mean(int[] arr, int l){
    int sum = 0;
    for (int i = 0; i < l; i++){
      sum += arr[i];
    }
    System.out.println("Mean = "+sum/l);
  }

  public static void Median(int[] arr, int l){
    if (l % 2 != 0){
      System.out.println("Median = "+arr[l/2]);
    }
    else {
      int median = (arr[l/2] + arr[l/2-1]) / 2;
      System.out.println("Median = "+median);
    }
  }

  public static void Mode(int[] arr, int l){
    int i = 1;
    int num = arr[0];
    int tempNum = arr[0];
    int freq = 1;
    int tempFreq = 1;
    
    while (i < l){
      if(arr[i] == tempNum){
        tempFreq++;
        if(tempFreq > freq){
          freq = tempFreq;
          num = tempNum;
        }
      }
      else{
        tempFreq = 1;
        tempNum = arr[i];
      }
      i++;
    }
    System.out.println("Mode = "+num);
  }
}
