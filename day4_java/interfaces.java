package day4_java;

import day1_java.prac;

interface computer{
    void show();

}
class laptop  implements computer{
    public void show()
    {
        System.out.println("Code , Compile , Run");

    }

}
class desktop implements computer{
    public void show()
    {
        System.out.println("Code , Compile & Run but Faster");
    }
}
class developer{
    public void develop(computer lap)
    {
        lap.show();
    }
}

public class interfaces{
    public static void main()
    {
            computer lap = new laptop();
            computer desk = new desktop();

            developer dev = new developer();
            dev.develop(lap);
    }
}