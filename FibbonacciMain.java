import java.util.Scanner;


class FibbonacciMain{
    public static void main(String[] args) {
        FibbonacciUsingRecursion obj = new FibbonacciUsingRecursion();
        Scanner sc=new Scanner(System.in);
        System.out.println(obj.fib(sc.nextInt()));
    }
}
