import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "My name is Udit";
        Scanner scanner=new Scanner(System.in);
        String first=scanner.next();
        String second=scanner.next();


        str = str.replace(second, "");
        str = str.replace(first, "");

        System.out.println(str);
    }
}
