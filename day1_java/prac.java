package day1_java;

public class prac {


    public static boolean isprime(int num)
    {
        if(num<=1)
            return false;

        for(int i =2;i*i<=num;i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;

    }


    public static void main(String []args)
    {
        int start = 1 ;
        int end = 50;
        int count =0;
        for(int i =start ;i<=end;i++)
        {
            if(isprime(i))
            {
                count++;
                System.out.println(i+" ");
            }
        }
    }
}
