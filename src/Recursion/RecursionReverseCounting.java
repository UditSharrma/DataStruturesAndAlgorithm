package Recursion;

public class RecursionReverseCounting {
    public static void main(String[] args) {

        Reverse(5);
    }

    static void Reverse(int i) {

        if (i==1){
            System.out.print(i);
            return;
        }
        System.out.print(i);
        Reverse(i-1);
    }
}
