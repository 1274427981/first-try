//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class TimesTable {
    public static void main(String[] args)
    {
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int a=i*j;
                System.out.print(j+"x"+i+"="+a+"\t");
            }
            System.out.println();
        }

    }
}