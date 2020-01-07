public class Main
{

    public static void main(String[] args)
    {
        Purchase toGoStore = new Purchase();
        toGoStore.readInput();
        toGoStore.writeOutput();
        System.out.println("unit cost: "+ toGoStore.getUnitCost());
        System.out.println("total cost: "+ toGoStore.getTotalCost());


    }
}
