import java.util.Scanner;

class FibonacciMain{
    public static void main(String[] args) {
        FibonacciUsingRecursion obj = new FibonacciUsingRecursion();
        Scanner sc=new Scanner(System.in);
        System.out.println(obj.fib(sc.nextInt()));
    }
}
