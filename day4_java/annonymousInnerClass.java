package day4_java;


class name{
    public void show()
    {
        System.out.println("In show");
    }
}
public class annonymousInnerClass{
public static void main(String[]args)
    {
        //normal object : 
        name obj = new name();
        obj.show();

        name obj1 = new name()
        {
            //annonymous innner class :  so if you want to implement abstract class and interfaces only once then 
            /* you can use annonymous inner class */
                    @Override
            public void show()
            {
                System.out.println("In new show");
            }
        };



        }
    }