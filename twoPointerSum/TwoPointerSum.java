class TwoPointerSum{
  public static void main(String[] args){
    int[] arr = {1,3,4,5,6,8,9,10,12,14,16,18};
    int target = 15;

    int left = 0;
    int right = arr.length - 1;
    while(left < right){
      if(arr[left]+arr[right] == target){
        System.out.println("("+left+","+right+")");
        break;
      }
      else if(arr[left]+arr[right] < target){
        left++;
      }
      else{
        right--;
      }
    }
  }
}
