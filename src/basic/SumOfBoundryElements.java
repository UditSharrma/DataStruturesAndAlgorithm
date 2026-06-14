public class SumOfBoundryElements {
    public static void main(String[] args) {

        int[][] arr={

                {1,2,3},
                {2,3,5},
                {3,5,6}
        };
      for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (i==1&&j==1){

                }
                else {
                    System.out.print(arr[i][j]+" ");
                }
            }

        }
    }
}
