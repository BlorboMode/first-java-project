class Main {
  public static void main(String[] args) {
    int[] arr = {2,3,1,4,7,5,6,8,9};
    int length = arr.length;

    for (int i=0;i<length-1;i++){
      for (int j=0;j<length-i-1;j++){
        if (arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    
    for (int i=0;i<length;i++){
      System.out.print(arr[i]+",");
    }
      
  }  
}
