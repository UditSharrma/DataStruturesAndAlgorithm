import java.util.Arrays;
import java.util.Scanner;
public class ReverseEachRow {
    public static void main(String[] args) {
        /*
        123            321
        456    ---->>  654
        789            987
         */
        int[][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i <arr.length ; i++) {

            int left=0;
            int right=arr[i].length-1;


            while (left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }






    }
}
