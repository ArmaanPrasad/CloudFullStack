package day4_java;

// interface A {
//     void show();
// }

// public class lambdaexp {
//     public static void main(String[] args) {

//         A obj = () -> System.out.println("Hello");

//         obj.show();




//     }
interface Addition {
    int add(int a , int b);
}
public class lambdaexp{
    public static void main(String[] args)
    {
        Addition obj=(a,b)->{
            return a+b;
        };


        System.out.println(obj.add(05, 6));
    }
}