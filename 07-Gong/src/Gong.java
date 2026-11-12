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
        int gcd=1;
        for(int a=Math.min(x,y);a>0;a--)
        {
            if (x%a==0 && y%a==0) {
                System.out.println("找到的最大公约数为" + a);
                gcd=a;
                break;
            }
        }
        int n=x*y/gcd;
        System.out.println("最小公倍数为"+n);


    }
}