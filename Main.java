import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
          a = new StringBuilder(sc.next());
        System.out.println("please enter b number");
         b = new StringBuilder(sc.next());
        System.out.println("You Entered : "+ a +" and :  "+ b);

        int lengthA= a.length();
        int lengthB= b.length();

        if (lengthA != lengthB && lengthA > lengthB){
            int difference= lengthA - lengthB;
            int i=0;
            b.reverse();
            while( i<difference) {
                b.append("0");
                i++;
            }
            b.reverse();

            addString(a.toString(),b.toString());
        }
        else if (lengthA != lengthB && lengthA < lengthB) {
            int difference= lengthB -lengthA;
            int i =0;
            a.reverse();
            while (i<difference){
                a.append("0");
                i++;
            }
            a.reverse();
            addString(a.toString(),b.toString());
        }
        else{
            addString(a.toString(),b.toString());
        }

    }
    public static void addString(String b, String c){
        StringBuilder sumString = new StringBuilder();
        int carry = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            int digitB = Integer.parseInt(String.valueOf(b.charAt(i)));
            int digitC = Integer.parseInt(String.valueOf(c.charAt(i)));
            int sumDigits = digitB + digitC + carry;
            carry = sumDigits / 10;
            sumString.append(sumDigits % 10);

        }
        if (carry != 0) {
            sumString.append(carry);
        }
        String sumResult = sumString.reverse().toString();
        System.out.println("Sum: " + sumResult);
    }

}
