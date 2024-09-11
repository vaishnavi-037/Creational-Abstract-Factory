package product.sofa;

public class VictorianSofa implements Sofa{
    @Override
    public void layOn() {
        System.out.println("Laying on Victorian Sofa");
    }

    @Override
    public void book() {
        System.out.println("Booking a Victorian Sofa");
    }
}
