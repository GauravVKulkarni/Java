class LinSearch{
  public static void main(String[] args){
    int[] arr = {65,32,34,65,3,68,13,90,52,5};
    int num = 68;

    for(int i = 0; i < arr.length; i++){
      if(num == arr[i]){
        System.out.println("Found at "+(i+1)+"th place.");
      }
    }
  }
}
