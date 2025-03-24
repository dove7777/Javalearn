public class 变量练习 {
    public static void main(String[] args) {
        int x = 7;
        //打印
        System.out.println(x);//7
        System.out.println('x');
        //变量参与计算
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        //修改变量的值
        a = 50;
        System.out.println(a);//50
        //在一条语句中可以定义多个变量
        int d = 100, e = 200, f = 500;
        //变量在使用之前一定要赋值
        //int g;//错误
        //以后定义变量,要直接赋值,不要分开写
        int g = 1200;
        System.out.println(g);

        //变量练习小场景:计算公交车人数
        int count = 0;//乘客人数
        count = count + 1;
        count = count + 2 - 1;
        count = count + 2 - 1;
        count = count - 1;
        count = count + 1;
        System.out.println(count);
    }
}
