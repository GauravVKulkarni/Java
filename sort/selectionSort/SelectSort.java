class SelectSort{
  public static void main(String[] args){
    int[] arr = {76,54,56,76,34,65,7,4,4,34,56,7,678,87,12,32,45,65,35,92};
    int small = 0;
    int temp = 0;
    for (int i = 0; i < arr.length; i++){
      small = i;
      for (int j = i; j < arr.length; j++){
        if(arr[j] < arr[small]){
          small = j;
        }
      }
      temp = arr[i];
      arr[i] = arr[small];
      arr[small] = temp;
    }
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
}
