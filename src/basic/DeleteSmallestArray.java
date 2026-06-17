package basic;//delete the smallest element in the array

import java.util.ArrayList;

public class DeleteSmallestArray {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(java.util.Arrays.asList(1,32,42,44,3233,0));
        int min=arr.getFirst();
        for (int x:arr){
            if (x<min){
                min=x;
            }
        }
        arr.remove(Integer.valueOf(min));
        System.out.println(min);
        System.out.println(arr);
        System.out.println(args.length);
    }
}
