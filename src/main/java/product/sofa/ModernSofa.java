package product.sofa;

public class ModernSofa implements Sofa{
    @Override
    public void layOn() {
        System.out.println("Laying on Modern Sofa");
    }

    @Override
    public void book() {
        System.out.println("Booking a Modern Sofa");
    }
}
