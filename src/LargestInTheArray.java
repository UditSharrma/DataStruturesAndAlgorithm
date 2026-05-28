import java.util.Scanner;

public class LargestInTheArray {
    public static void main(String[] args) {


        int[] arr=new int[10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=scanner.nextInt();
        }

        int max=arr[0];

        for (int i = 1; i <arr.length; i++) {

            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum is "+max);

    }
}
