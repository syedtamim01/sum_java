import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        String  a = sc.next() ;
        System.out.println("please enter b number");
        String b = sc.next();
        Integer sum = Integer.valueOf(a)+ Integer.valueOf(b);
        System.out.print(sum);

    }
}
