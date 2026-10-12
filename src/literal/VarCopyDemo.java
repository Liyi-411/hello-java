package literal;

public class VarCopyDemo {
    public static void main(String[] args) {
        int x = 5;
        x = 100;
        int y = x;
        System.out.println(x);    // 猜：此时x变为了100，所以运行结果应该为100
        System.out.println(y);    // 猜：y在该瞬间等于x的值，x在该条代码前变为了100，所以y此时应该也等于100

        int a = 5;
        int b = a;
        b = 999;
        System.out.println(a);    // 猜：a=5
        System.out.println(b);    // 猜：b在第二行代码瞬间变为了a，但是在第三行代码变为了999，所以此时b应该等于999
        int p = 5;
        int q = p;
        p = 100;                  // 复制之后才改 p
        System.out.println(p);    // 猜：100
        System.out.println(q);    // 猜：5
    }
}
