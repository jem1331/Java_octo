import java.until.Scanner;

public class Main {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int value1 = getNextNumber();
        int value2 = getNextNumber();

        int result = sumMethod(
           getNextNumber(),
           getNextNumber()
        );

        int result = sumMethod(value1, value2);
        System.out.println("Сумма двух чисел " + result);
    }

    static double getNextNumber(){
        System.out.println("Введите пожалуйста слагаемое:");
        return myScaner.nextInt();
    }

    static int sumMethod(int val1, int val2){
        return val1 + val2;
    }

    static int sumMethod(double val1, double val2){
        return val1 + val2;
    }
}
