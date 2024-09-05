class MaxSubArraySum{
  public static void main(String[] args){
    int[] arr = {4,2,1,7,8,1,2,8,1,0};

    int k = 3;
    int subSum = 0;

    for (int i = 0; i < k; i++){
      subSum += arr[i];
    }

    int maxSum = subSum;
    for (int i = k; i < arr.length; i++){
      subSum = subSum + arr[i] - arr[i-k];
      if (maxSum < subSum){
        maxSum = subSum;
      }
    }
    System.out.println(maxSum);
  }
}
