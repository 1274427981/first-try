import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Order {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入x");
        int x= sc.nextInt();
        System.out.println("输入y");
        int y= sc.nextInt();
        System.out.println("输入z");
        int z= sc.nextInt();
        if(x<y)
        {
            int temp=x;
            x=y;
            y=temp;
        }
        if(x<z)
        {
            int temp=x;
            x=z;
            z=temp;
        }
        if(y<z)
        {
            int temp=y;
            y=z;
            z=temp;
        }
        System.out.println(x+">"+y+">"+z);

    }

}