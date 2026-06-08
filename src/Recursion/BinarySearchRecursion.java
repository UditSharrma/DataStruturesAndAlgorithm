package Strings;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,66,77,99,344,443};
        int target=77;
        int ans=search(arr,target,0,arr.length);
        System.out.println(ans);
    }

    static int search(int[] arr,int target,int start,int end){
        if (start>end) {
            return -1;
        }
            int mid=start+(end-start)/2;

         if (arr[mid]==target) {
            return mid;
        }
         else if (arr[mid]>target) {
             return search(arr,target,start,mid-1);
         }
             return search(arr,target,mid+1,end);
    }
}
