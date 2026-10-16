package operator;

import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入秒数:");
        int seconds = sc.nextInt();//用int避免小数
        System.out.print("小时数为:");
        int hours = seconds / 3600;//3600为一小时的秒数
        System.out.println(hours);
        System.out.print("分钟数为:");
        int mins = (seconds % 3600) / 60;//先对3600取余可以得到剩下的秒数，剩下的秒数再除以一分钟的秒数可以得到共多少分钟，用int避免小数
        System.out.println(mins);
        System.out.print("秒数为:");
        int secs = (seconds % 3600 ) % 60;//先对一小时的秒数取余得到去掉小时后剩下的秒数，再对一分钟的秒数取余得到去掉分钟后剩下的秒数
        System.out.println(secs);


    }
}
