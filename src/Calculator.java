import java.util.Scanner;

public class Calculator {

    public static Scanner scanner = new Scanner(System.in);

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public static void Calculate() {
        do {
            System.out.println("Input an operation sign. '+' for add, '-' for subtract," +
                    "'*' for multiply, '/' for divide.");
            String operationSign = InputSign();

            double a = 0;
            double b = 0;

            switch (operationSign) {
                case "+" :
                    System.out.println("Enter the first addend:");
                    a = InputNumber();

                    System.out.println("Enter the second addend:");
                    b = InputNumber();

                    Add(a, b);
                    break;
                case "-" :
                    System.out.println("Enter the minuend:");
                    a = InputNumber();

                    System.out.println("Enter the subtrahend:");
                    b = InputNumber();

                    Subtract(a, b);
                    break;
                case "*" :
                    System.out.println("Enter the first multiplier:");
                    a = InputNumber();

                    System.out.println("Enter the second multiplier:");
                    b = InputNumber();

                    Multiply(a, b);
                    break;
                case "/" :
                    System.out.println("Enter the dividend:");
                    a = InputNumber();

                    System.out.println("Enter the divisor:");
                    b = InputNumber();

                    Divide(a, b);
                    break;
            }
        } while (true);
    }

    public static double InputNumber(){
        double input = 0;
        if (scanner.hasNextDouble()) {
            input = scanner.nextDouble();
        }
        else if (scanner.hasNext("stop")){
            System.out.println("The operation was stopped by the user.");
            System.exit(0);
        }
        else {
            System.out.println("Incorrect number!");
            scanner.next();
            input = InputNumber();
        }
        return input;
    }

    public static String InputSign(){
        String sInput = scanner.next();
        if(sInput.equals("stop")) {
            System.out.println("The operation was stopped by the user.");
            System.exit(0);
        }
        return sInput;
    }

    public static double Add(double a, double b){
        double sum = a + b;
        String outputResult = a + " + " + b + " = " + sum;
        System.out.println(outputResult);
        return sum;
    }

    public static double Subtract(double a, double b){
        double difference = a - b;
        String outputResult = a + " - " + b + " = " + difference;
        System.out.println(outputResult);
        return difference;
    }

    public static double Multiply(double a, double b){
        double product = a * b;
        String outputResult = a + " * " + b + " = " + product;
        System.out.println(outputResult);
        return product;
    }

    public static double Divide(double a, double b){
        if(b == 0){
            System.out.println("Can't divide by zero. Enter a non-zero divisor.");
            b = InputNumber();
            return Divide(a, b);
        }
        else{
            double quotient = a / b;
            String outputResult = a + " / " + b + " = " + quotient;
            System.out.println(outputResult);
            return quotient;
        }
    }
}
