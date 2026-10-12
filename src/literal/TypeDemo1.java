package literal;

public class TypeDemo1 {
    public static void main(String[] args) {
        //part A八种数据类型定义一次，打印一次
        //整数类型
        byte b = 10;//定义bite数据类型
        System.out.println(b);//打印出byte数据类型
        short s = 1;//定义short数据类型
        System.out.println(s);//打印出short数据类型
        int i =100321;//定义int数据类型（最常用）
        System.out.println(i);//打印出int数据类型
        long l = 1000000000L;//定义long数据类型（要带L或者l）
        System.out.println(l);//打印出long数据类型
         //小数类型
        double d = 1312.41;//定义double数据类型（最常用）
        System.out.println(d);//打印出double数据类型
        float f = 0.312431241f;//定义float数据类型，数据末尾要带f
        System.out.println(f);//打印float数据类型
        //字符类型
        char c = 'A';//定义char字符数据类型，要用单引号
        System.out.println(c);// 大音char数据类型
        //布姆类型
        boolean bb = true;//定义boolean数据类型，只有true或者flase
        System.out.println(bb);//答应boolean数据类型
        //part B 故意打错读报错
        //修改// ① 字面量类型不匹配：1.75 默认是 double，装进 float 会丢精度
        ////    报错原文：incompatible types: possible lossy conversion from double to float
        ////    修法：float f1 = 1.75f;  或者  double f1 = 1.75;
        //// float f1 = 1.75;
        //
        //// ② 数值超出 int 范围：整数字面量默认就是 int，80 亿比 int 最大值还大
        ////    报错原文：integer number too large
        ////    修法：只能加 L → long l1 = 8000000000L;   （改成 int 不行！）
        //// long l1 = 8000000000;
        //
        //// ③ 数值超出 byte 范围：200 是合法的 int，但装不进 byte（-128~127）
        ////    报错原文：incompatible types: possible lossy conversion from int to byte
        ////    修法：byte b1 = 127;  或者  int b1 = 200;
        //// byte b1 = 200;
        //part  C 选类型
        //字段	可能的值
        //手机品牌	华为 / Apple / 小米 / OPPO …
        //价格	5999.00 / 1299.50
        //屏幕尺寸（英寸）	6.7 / 6.1
        //是否支持 5G	是 / 否
        //出厂年份	2026
        String brand = "Apple";//手机品牌应选字符串类型
        System.out.println(brand);//打印手机品牌类型
        double price = 5999.00;//手机价格可能为小数应选用double类型
        System.out.println(price);//打印价格
        double inch = 6.7;//屏幕尺寸一般为小数应用double类型
        System.out.println(inch);//打印手机屏幕尺寸
        boolean isSupport5G = true;//支持5g，应用boolean类型
        System.out.println(isSupport5G);//打印手机是否支持5g
        int production = 2026;//出场年份为整数，应用int类型
        System.out.println(production);//打印出厂年份

    }
}
