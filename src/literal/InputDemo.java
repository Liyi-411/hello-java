package literal;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        //1.  2name  非法，数字不能放前面
        //2.  userName  合法
        //3.  class  不合法，class为java关键词
        //4.  user-name  非法，特殊符号只能用下划线和美元符号
        //5.  _count  合法
        Scanner sc = new Scanner(System.in);//找到scanner，并让scanner工作
        //Part B —— 一次运行读三样东西
        //读什么	数据类型
        //姓名	文字
        //年龄	整数
        //身高	小数
        System.out.print("请输入你的名字:");//加入一行提示，是单独的一行，不是改打印那一行
        String name =sc.next();//定义一个变量name等于键盘录入的名字（字符串）
        System.out.println(name);//打印出键盘输入的名字（字符串）
        System.out.print("请输入你的年龄:");//加入一行提示
        int age = sc.nextInt();//定义一个变量age等于scanner录入的键盘输入的年龄（整数）
        System.out.println(age);//打印出键盘输入的年龄(整数)
        System.out.print("请输入你的身高:");//加入一行提示
        double height = sc.nextDouble();//定义一个变量height等于键盘录入的身高（小数）
        System.out.println(height);//打印出键盘录入的身高(小数)

    }
}
