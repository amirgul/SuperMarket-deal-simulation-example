import java.util.Scanner;

public class Purchase
{
    Scanner keyboard = new Scanner(System.in);
    private String name;
    private double groupCount;
    private double groupPrice;
    private int numberBought;

    public void setName(String newName)
    {
        name = newName;
    }
    public void setPrice(double newGroupCount, double newGroupPrice)
    {
        if((newGroupCount <=0 || newGroupPrice <= 0))
        {
            System.out.println("Wrong parameter entered for price and count");
        }
        else
        {
            groupCount = newGroupCount;
            groupPrice = newGroupPrice;
        }
    }
    public void setNumberBought(int newNumberBought)
    {
        if(newNumberBought <= 0)
            System.out.println("wrong parameter enter for numberBought");
        else
            numberBought = newNumberBought;
    }
    public void readInput()
    {
        System.out.println("Enter name of the item");
        this.name = keyboard.nextLine();
        System.out.println("Enter price as two numbers");
        System.out.println("For example 3 2.99");
        this.groupCount = keyboard.nextInt();
        this.groupPrice = keyboard.nextDouble();
        while ((groupCount <= 0 || groupPrice<= 0))
        {
            System.out.println("group count and price can not be less than zero(0)");
            System.out.println("Please try again");
            this.groupCount = keyboard.nextInt();
            this.groupPrice = keyboard.nextDouble();
        }
        System.out.println("Enter number of items purchased now");

        numberBought = keyboard.nextInt();
        while (numberBought <= 0)
        {
            System.out.println("number bought can not be less than zero (0)");
            System.out.println("please enter a positive numver");
            numberBought = keyboard.nextInt();
        }
    }
    public void writeOutput()
    {
        System.out.println(numberBought +" " + name +" at " + groupCount +" for " + groupPrice);
    }
    public String getName()
    {
        return  name;
    }
    public double getTotalCost()
    {
       return (groupPrice/groupCount) *numberBought;
    }
    public double getUnitCost()
    {
        return groupPrice/groupCount;
    }
    public int getNumberBought()
    {
        return numberBought;
    }
}
