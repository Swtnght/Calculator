import java.io.IOException;
import java.util.Scanner;

public class Calculate {
    public int a,b,c;
    Scanner scan = new Scanner(System.in);
    public Calculate(){
        a = 0;
        b = 0;
        c = 0;
    }
    public Calculate(int a){
        this.a = a;
    }
    public Calculate(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int Sum(){
        try{
            a = Integer.parseInt(scan.nextLine());
        } catch (Exception ex){
            System.out.println("Введено не число!!!!");
            return -111111;
        } finally {
            System.out.println("");
        }
        b = Integer.parseInt(scan.nextLine());
        return a+b;
    }
}
