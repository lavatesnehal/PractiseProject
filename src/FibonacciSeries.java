
        //** write an programm for fibonacci series**//


public class FibonacciSeries
{
    public static void main(String[] args)
    {

        int a=0;
        int b=1;
        int sum;

        System.out.println("the fibonacci series is ");
        System.out.print(a+" "+b);
        for(int i=1;i<=6;i++)
        {
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;

        }

    }
}
