package literal;

public class TypeReview1 {
    public static void main(String[] args) {
        byte b  = 127;//定义byte数据类型
        System.out.println(b);//打印出byte
        long l = 200000013124L;//定义long数据类型
        System.out.println(l);//打印出long
        int i = 32145;//定义int数据类型
        double d = 213.421;//定义double数据类型
        System.out.println(d);//打印出double数据类型
        float f =0.3124f;//定义float数据类型
        System.out.println(f);//打印出float数据类型
        char c = 'A';//定义出char数据类型
        System.out.println(c);//打印出char数据类型
        boolean bb = true;//定义boolean数据类型
        System.out.println(bb);//打印boolean数据类型
        short s = 213;//定义short数据类型
        System.out.println(s);//打印出short数据类型
        //字段	可能的值
        //学号	20250101
        //手机号	13800138000
        //班级人数	45
        //平均成绩	87.5
        //是否及格	是 / 否
        //身份证号	110101200501011234（也可能以 X 结尾）
        String studentId = "20250101";//定义变量学号,学号可能带字母，用字符串更合适
        System.out.println(studentId);//打印出学号
        String phoneNumber = "13800138000";//定义变量手机号,手机号用来计算无意义
        System.out.println(phoneNumber);//打印出手机号
        int classSize = 45;//定义变量班级人数，班级人数一般不会超过100，且一般会参与计算
        System.out.println(classSize);//打印出班级人数
        double averageScore = 87.5;//定义变量平均成绩，平均成绩一般会计算，所以用double
        System.out.println(averageScore);//打印平均成绩
        boolean isPass = true;//定义变量是否及格，判断类型
        System.out.println(isPass);//打印是否及格
        String idNumber = "110101200501011234";//定义变量身份证号，身份证数字很长且可能带字母，且一般不会参与计算
        System.out.println(idNumber);//打印变量身份证号
        int m = 5;
        int n = m;
        m = 100;
        System.out.println(m);   // 猜：100
        System.out.println(n);   // 猜：5
    }
}
