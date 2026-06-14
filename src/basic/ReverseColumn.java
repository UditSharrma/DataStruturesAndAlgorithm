import java.util.Arrays;

public class ReverseColumn {
    public static void main(String[] args) {

        /*
        00 00 01 12
        00 1  2   3         7 8 9
        10 4  5   6  ---->> 4 5 6
        20 7  8   9         1 2 3

         */
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

   /*
       for (int i = 0; i <arr.length; i++) {


            for (int j = 0; j <arr[i].length; j++) {

                if (i==0){

                    int temp=arr[i][j];
                    arr[i][j]=arr[arr.length-1][j];
                    arr[arr.length-1][j]=temp;

                }

            }

        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }
        }

    */

        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j =arr[i].length-1; j>=0 ; j--) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
