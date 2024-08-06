package binarysearch;
public class bs {
  public static void main(String[] args) {
    int[] arr =  {3,4,6,7,8,12,13};
    System.out.println( binarySearch(arr, 6) );
    }

    static int binarySearch(int[] arr, int target){
      int low = 0 ;
      int high = arr.length-1; 

      while (low<=high){
        int mid = low + (high-low)/2; 
        if(target == arr[mid]){
          return mid; 
        }else if(target>arr[mid]){
          low = mid + 1; 
        }else{ 
          high = mid-1;
        }
      }

      return -1; 
    }
}
