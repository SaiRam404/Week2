class FibonacciDP {

    
    int fibonacci(int n) {
        int[] fib = new int[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
        FibonacciDP fibonacciDP = new FibonacciDP();

        int n = 10; 
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacciDP.fibonacci(n));
    }
}
