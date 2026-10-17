package operator;

import java.util.Scanner;

public class NumberSplitReview1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个三位数:");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.print("个位为:");
        int ones = num % 10;
        System.out.println(ones);
        System.out.print("十位为:");
        int tens = (num / 10) % 10;
        System.out.println(tens);
        System.out.print("百位为:");
        int hunrdeds = (num / 100 ) % 10;
        System.out.println(hunrdeds);
    }
}
