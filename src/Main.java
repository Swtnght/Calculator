import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a, b;
        do {
            System.out.println("""
                    Enter a digit or symbol corresponding to the desired operation you want to perform \
                    with the numbers:
                    1. Addition
                    2. Subtraction
                    3. Multiplication
                    4. Division
                    5. Square root
                    6. Square of a number
                    """);
            Calculate calc = new Calculate();
            Scanner scan = new Scanner(System.in);
            var prop = scan.nextLine();
            switch (prop) {
                case "1":
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    System.out.println(calc.add(a, b));
                    break;
                case "2":
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    System.out.println(calc.subtract(a, b));
                    break;
                case "3":
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    System.out.println(calc.multiply(a, b));
                    break;
                case "4":
                    do {
                        a = scan.nextFloat();
                        if (a == 0) {
                            System.out.println("Invalid number. Please enter a non-zero number.");
                        }
                    } while (a == 0);
                    b = scan.nextFloat();
                    System.out.println(calc.divide(a, b));
                    break;
                case "5":
                    do {
                        a = scan.nextFloat();
                        if (a <= 0) {
                            System.out.println("Invalid number. Please enter a positive number.");
                        }
                    } while (a <= 0);
                    System.out.println(calc.square(a));
                    break;
                case "6":
                    a = scan.nextFloat();
                    System.out.println(calc.pow(a));
                    break;
            }
        } while (true);
    }
}
