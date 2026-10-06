package Strings;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder s= new StringBuilder();
     do{
            s.insert(0, (n % 2));
            n=n/2;
        }   while(n!=0);

        System.out.println(s);
    }
}
