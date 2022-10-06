package BaiTap;

public class Prime20Numbers {
    public static void main(String[] args) {
        int number = 20;
        int countMath = 0;
        int countNum = 0;
        for (int n = 2;;n++) {
            if (countNum < number) {
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        countMath++;
                    }
                }
                if (countMath == 2){
                    System.out.println(n);
                    countNum++;
                }
                countMath = 0;
            } else{
                break;
            }
        }
    }
}
