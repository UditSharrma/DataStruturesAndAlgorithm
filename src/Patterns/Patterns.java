package Patterns;

import java.util.Scanner;

public class Patterns {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        pattern11();


    }


    static void pattern12(){
        /*
         12.
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *


                      */

        }



    static void pattern11(){
        /*
         11.
                  * * * * *
                   * * * *
                    * * *
                     * *
                      *

                      */
        int n= sc.nextInt();
        for (int i =2*n-1; i>=1; i-=2) {

            for (int j =0;j<(2*n-i-1)/2; j++) {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++) {
                if (j%2!=0) {
                    System.out.print(" *");
                }
            }
            for (int j=0;j<i;j++) {
                if (j%2==0){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    static void pattern10(){
        /*
         10.   *
              * *
             * * *
            * * * *
           * * * * *
         */
        int n= sc.nextInt();
        for (int i =1; i<=2*n-1; i+=2) {

            for (int j =0;j<(2*n-i-1)/2; j++) {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++) {
                if (j%2!=0) {
                    System.out.print(" *");
                }
            }
            for (int j=0;j<i;j++) {
                if (j%2==0){
                System.out.print(" ");
              }
            }
            System.out.println(" ");
        }
    }



    static void pattern9(){
        int n= sc.nextInt();
        for (int i =2*n-1; i>=1; i-=2) {

            for (int j =0;j<(2*n-i-1)/2; j++) {
                System.out.print(" ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern8(){
        int n= sc.nextInt();
        for (int i =1; i<=2*n-1; i+=2) {

            for (int j =0;j<(2*n-i-1)/2; j++) {
                System.out.print(" ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(){
        int n= sc.nextInt();
        for (int i =0; i<n; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(){
        /*
6.       *
        **
       ***
      ****
     *****
         */
        int n= sc.nextInt();
        for (int i =0; i <n; i++) {
            for (int j = n; j>i; j--) {
                System.out.print(" ");
            }
            for (int k=0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern5(){

        int n= sc.nextInt();
        for (int i =0; i <=2*n; i++) {
            int noOfRowsInCol=i>n?2*n-i:i;
            for (int j = 1; j <noOfRowsInCol; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern4(){
        int n= sc.nextInt();
        for (int i =1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(){
        int n= sc.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(){

        int n= sc.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern1(){

        int n= sc.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}
