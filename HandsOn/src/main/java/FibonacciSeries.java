import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by makeshk.kathirvel on 4/17/2017.
 */
public class FibonacciSeries {
    static int n1=0, n2=1, n3;
    public static void main(String args[]){
        System.out.println("Enter the limit upto which fibonacii series has to be printed");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        System.out.print(n1+","+n2+",");
        fibonacci(n-2);
    }

    static void fibonacci(int x){
        if (x>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+",");
            fibonacci(x-1);
        }


    }



}
