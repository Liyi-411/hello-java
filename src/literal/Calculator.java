package literal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Part A 读两个数并打印
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字:");
        double num1 = sc.nextDouble();
        System.out.println(num1);
        System.out.print("请输入第二个数字:");
        double num2 = sc.nextDouble();
        System.out.println(num2);
        //Part B —— 加上四则运算（主体）
        System.out.print("和:");//打印出和
        double sum = num1 + num2;//定义变量sum为两数之和
        System.out.println(sum);//打印出两数之和的数值
        System.out.print("差:");//打印出差
        double difference = num1 - num2;//定义变量difference为两数之差
        System.out.println(difference);//打印出两数之差的数值
        System.out.print("积:");//打印出积
        double product = num1 * num2;//定义变量product为两数之积
        System.out.println(product);//打印出两数之积的数值
        System.out.print("商:");//打印出商
        double quotient = num1 / num2;//定义变量quotient为两数之商
        System.out.println(quotient);//打印出两数之商的数值
        //考虑到在实际应用中用户很可能需要输入小数，而在输入整数时可以用x.0来代替，因此我选择使用double这一数据类型，如果输入10.0和3.0的话，那么结果应该依次为13.0,7.0,30.0,3.33333333333
        //我现在全部改为了int，如果使用int的话，应该都为整数形式，那么可预测的结果为13，7，30，3，运行后发现预测正确
    }
}
