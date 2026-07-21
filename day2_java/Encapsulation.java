    class emp{
        String name;
        int age;
        private int phone;

        public emp(String name , int age)
        {
            this.name = name;
            this.age = age;
        }

        public void setPhone(int ph)
        {
            phone = ph;
        }

        public int getPhone()
        {
            return phone;
        }
    }
class Encapsulation
{
    
    public static void main(String[]args)
    {
        emp Employee1 = new emp("Armaan" , 26);
        Employee1.setPhone(911);
        Employee1.getPhone();
        emp Employee2 = new emp("Abhishek ",22);



    }
}