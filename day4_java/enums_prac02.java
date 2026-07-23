package day4_java;

enum laptop{
    Macbook(2000) , ThinkPad(600) , Dell(800) , Asus(1000) , lenovo;
    private int price;
    private laptop()
    {
        this.price = 500;
    }
    private laptop(int price)
    {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class enums_prac02 {

    public static void main(String[] args)
    {
    for(laptop lap : laptop.values())
    {
        System.out.println(lap +" : " + lap.getPrice());
    }
    }
}
