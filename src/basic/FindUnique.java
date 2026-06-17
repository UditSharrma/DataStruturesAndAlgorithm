package basic;

public class FindUnique {
    public static void main(String[] args) {

        int[]arr={1,2,5,2,1,6,4,5,4};
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num^=arr[i];
        }
        System.out.println(num);
    }
}
