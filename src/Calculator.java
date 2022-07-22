import java.util.Scanner;

public class Calculator {

    public static Scanner scanner = new Scanner(System.in);
    private static Boolean isStopped = false;

    public Calculator() {
        this.scanner = new Scanner(System.in);
        this.isStopped = false;
    }

    public static void Calculate() {
        do {
            System.out.println("Input an operation sign. '+' for add, '-' for subtract," +
                    "'*' for multiply, '/' for divide.");
            String operationSign = InputSign();

            CheckStop();

            double a = 0;
            double b = 0;
            double result = 0;
            String outputResult = "Incorrect sign!";

            switch (operationSign) {
                case "+" :
                    System.out.println("Enter the first addend:");
                    a = InputNumber();
                    CheckStop();

                    System.out.println("Enter the second addend:");
                    b = InputNumber();
                    CheckStop();

                    result = Add(a, b);
                    outputResult = a + " + " + b + " = " + result;
                    break;
                case "-" :
                    System.out.println("Enter the minuend:");
                    a = InputNumber();
                    CheckStop();

                    System.out.println("Enter the subtrahend:");
                    b = InputNumber();
                    CheckStop();

                    result = Subtract(a, b);
                    outputResult = a + " - " + b + " = " + result;
                    break;
                case "*" :
                    System.out.println("Enter the first multiplier:");
                    a = InputNumber();
                    CheckStop();

                    System.out.println("Enter the second multiplier:");
                    b = InputNumber();
                    CheckStop();

                    result = Multiply(a, b);
                    outputResult = a + " * " + b + " = " + result;
                    break;
                case "/" :
                    System.out.println("Enter the dividend:");
                    a = InputNumber();
                    CheckStop();

                    System.out.println("Enter the divisor:");
                    b = InputNumber();
                    CheckStop();

                    result = Divide(a, b);
                    outputResult = a + " / " + b + " = " + result;
                    break;
            }
            System.out.println(outputResult);
        } while (true);
    }

    public static double InputNumber(){
        String sInput = scanner.next();
        double dInput = 0.0;
        if(sInput.equals("stop")) {
            isStopped = true;
        }
        else {
            try {
                dInput = Double.valueOf(sInput);
            } catch (NumberFormatException e) {
                System.err.println("Uncorrected number!");
            }
        }
        return dInput;
    }

    public static String InputSign(){
        String sInput = scanner.next();
        if(sInput.equals("stop")) {
            isStopped = true;
        }
        return sInput;
    }

    public static void CheckStop(){
        if(isStopped){
            System.out.println("The operation was stopped by the user.");
            System.exit(0);
        }
    }

    public static double Add(double firstAddend, double secondAddend){
        double sum = firstAddend + secondAddend;
        return sum;
    }

    public static double Subtract(double minuend, double subtrahend){
        double difference = minuend - subtrahend;
        return difference;
    }

    public static double Multiply(double a, double b){
        double product = a * b;
        return product;
    }

    public static double Divide(double a, double b){
        double quotient = a / b;
        return quotient;
    }
}
