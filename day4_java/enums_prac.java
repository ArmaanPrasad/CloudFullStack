package day4_java;

enum status {
    Requested , Pending ,Running , Success;
}


public class enums_prac {
    public static void main(String[] args) {
        int i =5;
        //if you want to print one by one :
        // status s = status.Success;
        // System.out.println(s.ordinal());

        //if you want to print all at the same time.
        status[] ss = status.values();
       // System.out.println(ss); //this will give you the reference or the address

        //use for loop for printing everything :
        for(status s : ss){
            System.out.println(s);
        }


        //if else :
        status s = status.Success;

        if(s==status.Success)
        {
            System.out.println("well done");

        }   
        else if(s== status.Requested)
        {
            System.out.println("Waitinggggg");
        }
        else if(s== status.Pending)
        {
            System.err.println("still Waitinggggg");
        }
        else 
        {
            System.err.println("Running");
        }

    }
}
