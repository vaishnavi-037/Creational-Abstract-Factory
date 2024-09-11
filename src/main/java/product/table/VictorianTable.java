package product.table;

public class VictorianTable implements Table{
    @Override
    public void putOn() {
        System.out.println("Putting on Victorian Table");
    }

    @Override
    public void book() {
        System.out.println("Booking a Victorian Table");
    }
}
