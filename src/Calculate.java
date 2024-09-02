import javax.naming.NameNotFoundException;

public class Calculate {
    //no-arg constructor
    public Calculate() {
    }

    public double add(float a, float b) {
        return a + b;
    }

    public double subtract(float a, float b) {
        return a - b;
    }

    public double multiply(float a, float b) {
        return a * b;
    }

    public double divide(float a, float b) {
        double result;
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot divide by zero");
        } else {
            result = Double.valueOf(a) / Double.valueOf(b);
        }
        return result;
    }

    public double square(float a) {
        double temp;
        double square = (double) a / 2;
        do {
            temp=square;
            square = (temp+(a/temp))/2;
        } while((temp-square)!= 0);
        return square;
    }
    public double pow(float a){
        return (a*a);
    }
}