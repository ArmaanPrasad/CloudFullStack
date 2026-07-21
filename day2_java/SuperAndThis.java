class A {
    // default constructor :
    public A() {
        super();
        System.out.println("In A");

    }

    // parameterised constructor
    public A(int a) {
        super();
        System.out.println("In int A");
    }
}

class B extends A {

    // default constructor{}

    public B() {
        super(); // to make sure that the default a one is callled (also this controls whether to call para or default one)
        System.out.println("in B");
    }

    public B(int a) {
      // super(); //this even if you dont mention it will be there in the code and it will call the construtor of the 
                // super class.(default one as this super doesnt have a parameter); [case 1]

        //super(5); //this will call the constructor(parameter) one of the parent class.
        
        //now comes another concept which is this :
        this(); //it will call the constructor of the same class.

        System.out.println("In int B");
    }
}

public class SuperAndThis {

    public static void main() {
      //  B obj = new B(); //now this will give "in a" "in b" because it will call the default cons of both super and extended class.
     // B obj = new B(5); // now this will call the "in a"(default) & "in int b"(para cons) because of the flow super(doesn't have a parameter case 1) above B int goes to constructor of the super class which is default. 
                           // [case 2] it will call both the constructor with parameters if we will give parameter because the super now has parameter.
       B obj = new B(5); // call the parameter one.

       
    }

}
