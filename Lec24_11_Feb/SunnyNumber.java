package Lec24_11_Feb;

public class SunnyNumber {

    public static void main(String[] args) {

        int num = 8;   

        int next = num + 1;
        int root = (int) Math.sqrt(next);

        if (root * root == next)
            System.out.println(num + " is a Sunny number");
        else
            System.out.println(num + " is not a Sunny number");
    }
}
