package literal;

import java.util.Scanner;

public class InputReview1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //提示「请输入课程名：」→ 读一个文字
        //提示「请输入课时数：」→ 读一个整数
        //两样都打印出来
        System.out.print("请输入课程名：");//给用户提示应该做什么
        String className = sc.next();//键盘录入一个文字
        System.out.println(className);//打印出键盘录入的这个文字
        System.out.print("请输入课时数:");//第二步提示
        int classHour = sc.nextInt();//键盘录入一个整数
        System.out.println(classHour);//打印出键盘录入的这个整数
        //要先输入提示词这一条，因为一段代码是按从上到下运行的，提示词这一条运行的很快，而键盘录入这一条得等用户输入完字符才能运行，所以提示词要在录入这一条前面

    }
}
