import java.util.Scanner;

public class Prime {
    public static void main(String[] args)
    {
        System.out.println("输入数字");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if (n<2)
        {
            System.out.println("不是素数");
        }
        else
        {
            Boolean right=true;
            double j=Math.sqrt(n);
            for(int i=2;i<=j;i++)
            {
                if(n%i==0)
                {
                right=false;
                break;
                }

                else
                {
                 right=true;
                }
            }
            if(right)
            {
                System.out.println("是素数");
            }
            else {
                System.out.println("不是素数");
            }
        }
    }
}