package OopsInJava;

public class Fraction {
    
    public static int gcd(int num, int den) {
        int min = Math.min(num, den);
        for(int i = min; i >= 1; i--) {
            if(num%i == 0 && den%i==0) return i;
        }
        return min;
    }
    public static class fraction{
        int num;
        int den;
        public fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify() {
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
    }
    public static void main(String[] args) {
        fraction s1 = new fraction(35, 21);
        System.err.println(s1.num+"/"+s1.den);
        // fraction s2 = new fraction(7, 3);
    }
}
