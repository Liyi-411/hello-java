package literal;

import java.util.Scanner;

public class CalculatorReview1 {

    public static void main(String[] args) {
        //两个数用 double 读
        //打印和、差、积、商
        //三段式：提示（print）→ 读取 → 打印值（println）
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字:");
        double num1 = sc.nextDouble();//选用double可以包含整数的形式还可以避免相除时被隔断,后面全部使用double
        System.out.print("请输入第二个数字:");
        double num2 = sc.nextDouble();
        System.out.print("和为:");
        double sum = num1 + num2;
        System.out.println(sum);
        System.out.print("差为:");
        double difference = num1 - num2;
        System.out.println(difference);//打印名字时print不带ln，打印变量的值时print要带ln，虽然不影响代码运行，但是可以方便我们分辨哪一行是提示哪一行是值
        System.out.print("积为:");
        double product = num1 * num2;
        System.out.println(product);
        System.out.print("商为:");
        double quotient = num1 / num2;
        System.out.println(quotient);


    }
}
