package literal;

public class SwapReview1 {
    public static void main(String[] args) {
        //让first变为42，让second变为7
        int first = 7;//定义一个名为first的变量，把7装进去
        int second = 42;//定义一个名为second的变量，把42装进去
        int third = first;//定义一个名为third的临时变量，把first储存起来
        first=second;second=third;//让first变为second，让second变为被储存的first
        System.out.println(first);//表达出现在的first
        System.out.println(second);//表达出现在的second


    }
}
