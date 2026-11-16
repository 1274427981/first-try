import java.lang.reflect.Array;
import java.util.Arrays;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Fibonacci {
    public static void main(String[] args)
    {
        int[] a=new int[20];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<a.length;i++)
        {
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println(Arrays.toString(a));
    }
}