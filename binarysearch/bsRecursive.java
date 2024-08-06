package binarysearch;

public class bsRecursive {

  public static void main(String[] args) {
    int[] arr = {3,4,6,7,10,12,13};
    System.out.println(binarySearch(arr, 0, arr.length-1, 11));
  }

  static int binarySearch(int[] arr, int low, int high, int target){ 
    int mid = low + (high-low)/2; 
    if(low>high){
      return -1; 
    }
    if(target == arr[mid]){
      return mid; 
    }else if(target>arr[mid]){
      return binarySearch(arr, mid+1, high, target); 
    }

    return binarySearch(arr, low, mid-1, target); 
  }
  
}