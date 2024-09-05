class BubbleSort{
  public static void main(String[] args){
    int[] arr = {5,2,8,4,54,12,43,1,3,65};
    int temp = 0;
    for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
        if(arr[j]>arr[j+1]){
          temp = arr[j];
          arr[j] = arr [j+1];
          arr[j+1] = temp;
        }
      }
    }
    for(int i = 0; i < 10; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
}
