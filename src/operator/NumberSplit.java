package operator;

import java.util.Scanner;

public class NumberSplit {
    public static void main(String[] args) {
        //用 Scanner 读入一个三位数（比如 583）
        //拆成百位、十位、个位
        //分别打印出来
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个三位数:");
        int num = sc.nextInt();//为什么选用int？因为要将三位数拆分时，利用的是整除后产生的余数，需要将除后产生的小数位砍掉，而使用double的话除后小数位没法砍掉
        System.out.print("个位为:");
        int ones = num % 10;//将该三位数对十取余后除了个位上的数字其他数位上的都会被整除，因此可以直接使用余数
        System.out.println(ones);
        System.out.print("十位为:");
        int tens = (num / 10 ) % 10;//  先 /10 把十位挤到个位（583→58），再 %10 取出来
        System.out.println(tens);
        System.out.print("百位为:");
        int hundreds = (num / 100 ) % 10;
        System.out.println(hundreds);

    }
}
