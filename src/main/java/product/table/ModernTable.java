package product.table;

public class ModernTable implements Table{
    @Override
    public void putOn() {
        System.out.println("Putting on Modern Table");
    }

    @Override
    public void book() {
        System.out.println("Booking a Modern Table");
    }
}
