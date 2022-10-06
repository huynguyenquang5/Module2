package BaiTap;

public class PrimeNumbersSmallerThan100 {
    public static void main(String[] args) {
        int countMath = 0;
        for (int n = 2; n <= 100; n++) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    countMath++;
                }
            }
            if (countMath == 2) {
                System.out.println(n);
            }
            countMath = 0;
        }
    }
}
