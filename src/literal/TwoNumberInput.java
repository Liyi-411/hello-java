package literal;

import java.util.Scanner;

public class TwoNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//定义一个变量sc为真实可输入的值
        System.out.print(" 请输入数字1:");//给用户第一个步骤的提示
        int num1 = sc.nextInt();//定义一个变量num1为键盘录入的整数
        System.out.println(num1);//打印出键盘录入的这个整数
        System.out.print("请输入数字2:");//给用户第二个步骤的提示
        int num2 = sc.nextInt();//定义一个变量num2为键盘录入的第二个整数
        System.out.println(num2);//打印出键盘录入的第二个整数
        //运行后无bug


    }
}
