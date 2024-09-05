import java.util.Arrays;
class BinSearch{
  public static void main(String[] args){
    int[] arr = {43,55,78,34,56,75,47,53,23,34,32,56,2,45,65};
    Arrays.sort(arr);
    int n = 78;
    int left = 0;
    int right = 14;
    BinarySearch(arr, left, right, n);
    for (int i=0; i<arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  static void BinarySearch(int[] arr, int left, int right, int n){
    if(n == arr[left]){
      System.out.println("Element found at "+(left+1));
      return;
    }
    if(n == arr[right]){
      System.out.println("Element found at "+(right+1));
      return;
    }

    int mid = (right+left)/2;
    if (arr[mid]==n){
      System.out.println("Element Found at "+(mid+1));
      return;
    }
    if (mid == left){
      System.out.println("Element not Found");
      return;
    }
    if(n<arr[mid]){
      right = mid;
    }
    if(n>arr[mid]){
      left = mid;
    }
    BinarySearch(arr, left, right, n);
  }
}
