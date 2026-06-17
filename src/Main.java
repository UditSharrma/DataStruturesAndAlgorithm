import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[]candies={1,2,3,4,5,2,1,3,4,3};
        int max=0;

        for(int i=0;i<candies.length;i++){

            if(max<candies[i]){
                max=candies[i];
            }

        }
        System.out.println(max);
//        String str = "My name is Udit";
//        Scanner scanner=new Scanner(System.in);
//        String first=scanner.next();
//        String second=scanner.next();
//
//
//        str = str.replace(second, "");
//        str = str.replace(first, "");
//
//        System.out.println(str);
    }
}
