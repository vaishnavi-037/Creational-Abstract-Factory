package product.chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Chair");
    }

    @Override
    public void book() {
        System.out.println("Booking a Modern Chair");
    }
}
