package Lec24_11_Feb;

public class Factorization {

    public static void main(String[] args) {

        int num = 24;   
        int n = num;

        

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n = n / i;
            }
        }
        System.out.print(num);
    }
}
