package Math;

public class pow {
    double power(double x, int n) {
        if (n == 0) return 1.0;  

        long N = n;  
        if (n < 0) {
            x = 1 / x;  // Invert x if n is negative
            N = -N;  // Make N positive
        }

        double res = 1.0;

        // Exponentiation by squaring
        while (N > 0) {
            if (N % 2 == 1) {  // If N is odd, multiply the result by x
                res = res * x;
            }
            x = x * x;  // Square the base
            N = N / 2;  // Halve the exponent
        }

        return res;
    }

    public static void main(String[] args) {
        pow p = new pow();  // Create an instance of the pow class
        double x = 2.000;
        int n = 10;
        System.out.println(p.power(x, n));  // Call the power method using the instance 'p'
    }
}
