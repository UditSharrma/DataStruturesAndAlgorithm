package Strings;

import java.util.Scanner;

public class StringReunion {
    public static void main(String[] args) {
        String s=Reunion();
        System.out.println(s);
    }
    static String Reunion() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int arr[] = new int[255];
        for (int i = 0; i < s.length(); i= i + 2) {
            arr[s.charAt(i)] += s.charAt(i + 1)-'0';
        }
        String s1 = "";
        for (int i = 0; i < 255; i++) {
            if (arr[i] != 0) {
                s1 += (char)i;
                s1 += arr[i];
            }
        }
        return s1;
    }
}
