
//1.write an programme to find the even and odd numberbetween 1-30//
//2.Accept the number from user and check whether that number is even or odd.

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        EvenOdd obj=new EvenOdd();
        obj.evenodd();
        obj.evenodd1();

    }

    void evenodd()
    {
        for(int i=1;i<=30;i++)
        {
            if(i%2==0)
                System.out.println(i+" even");

            else System.out.println(i+" odd");

        }


    }

    void evenodd1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();

        if(a%2==0)
            System.out.println("the number is even");
        else System.out.println("the number is odd");
    }


}
