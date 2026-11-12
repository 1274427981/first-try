import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Gong {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入x");
        int x= sc.nextInt();
        System.out.println("输入y");
        int y= sc.nextInt();
        int b=x*y;
        while(y!=0)
        {
            int a=x%y;
            x=y;
            y=a;
        }
        System.out.println("最大公约数是"+x);
        System.out.println("最小公倍数是"+b/x);
    }
}