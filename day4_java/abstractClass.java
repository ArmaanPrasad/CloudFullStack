package day4_java;

abstract class car {
    
    /* so basically what we are doing here is without doing the abstract keyword it will give
    error so by making it abstract it will let us help it to declare it here and then implement it later*/
    public abstract void drive();
    public abstract void fly();


    /* here wihtout abstract we need to implement the body. */
    // so abstract class can have normal and also abstract method too. 
    public void start()
    {
        System.out.println("It is Starting");
    }

}

abstract class wagonR extends car{

    //implementation of the drive method.
    public void drive()
    {
        System.out.println("It is driving");
    }
}

/* if by any chance we have a class that is not able to implement all the abstract methods
it also becomes the abstract class and finally the class that implements it will be called as the concrete class. */
/* like here the wagonR has become the abstract class as it cannot define the fly method. */


class updateWagaonR extends wagonR{
    public void fly()
    {
        System.out.println("it is flying now");
    }
}



public class abstractClass {
    public static void  main(String[]args)
    {
        /* we cannot create the obj of the abstract class we can only have the instance
        or the reference of it */

        car obj = new updateWagaonR();
    /*here abstract it the reference and the wagonR is the class object. */
        obj.drive();
        obj.start();


    }
}
