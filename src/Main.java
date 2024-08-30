import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор.\n" +
                "Введите цифру либо знак, соответствующий желаемому действию, которое хотите произвести с числами:\n" +
                "1. Сложение\n" +
                "2. Вычитание\n" +
                "3. Умножение\n" +
                "4. Деление\n" +
                "5. Квадратный корень\n" +
                "6. Квадрат числа\n");
        Calculate calc = new Calculate();
        Scanner scan = new Scanner(System.in);
        var prop = scan.nextLine();
        switch (prop){
            case "1","+" :

        }
    }
}


