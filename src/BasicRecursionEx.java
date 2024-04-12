// 

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BasicRecursionEx {

    // caculates the factorial of any positive integer
    public static int fact(int n) {
        if (n >= 1) {
            return n * fact(n - 1);
        } else if (n == 0) {
            return 1;
        } else {
            System.out.println("Factorials can only be calculated w/ positive integers  ");
            return -1;
        }

    }

    public static int fib(int n) {
        // 1 1 2 3 4 5
        // Fn = Fn-1 + Fn-2
        // n < 3 return 1
        // n>3 return fib(n-1) + fib(n-2)
        if (n == 1 || n == 2) {
            return 1;
        } else if (n >= 3) {
            return fib(n - 1) + fib(n - 2);
        } else {
            System.out.println("Factorials can only be calculated w/ positive integers ");
            return -1;
        }

    }

    public static void main(String[] args) {


    }

}