package  day4_java;
/* inner class example such that  when a class is inside a class the reference and the 
obj we make is a slight different.  */
class A {

    int age;

    public void show()
    {
        System.out.println("Show the value");
    }
    
    class B{

        public void config()
        {
            System.out.println("Show the config");
        }

    }
}


public class innerclass {
    public static void main(String[] args) {

        //this works fine but the thing is when we try to access config we have to use b.
        A obj = new A();
        //but we cant use b unless we make it an obj with reference to A.
        A.B obj1 = obj.new B();

    

    }
}
