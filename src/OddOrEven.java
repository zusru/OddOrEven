import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        // 8 12
        // 5 odd
        Scanner input = new Scanner(System.in);
        System.out.print("Enter: ");
        int x = input.nextInt();

        if (x % 2 == 0) {

            System.out.println("It's EVEN");
            if (x % 8 == 0 && x % 12 == 0) {System.out.print("Divide with 8 and 12");}
            if (x % 8 == 0) {System.out.print(" Divide with 8"); }
            if (x % 12 == 0) {System.out.print(" Divide with 12");}

        }

        if (x % 2 != 0) {
            System.out.println("It's ODD");
            if (x % 5 == 0) {System.out.print("Divide with 5"); }

        }
    }
}

