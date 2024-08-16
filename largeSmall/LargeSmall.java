class LargeSmall{
  public static void main(String[] args){
    int[] arr = {4,3,7,5,1,23,32,65,0,87};
    int smallest = arr[0], largest = arr[0];
    for(int i = 1; i < 10; i++){
      if(arr[i]<smallest){
        smallest = arr[i];
      }
      else if(arr[i]>largest){
        largest = arr[i];
      }
    }
    System.out.println("Smallest: "+smallest+" & Largest: "+largest);
  }
}
