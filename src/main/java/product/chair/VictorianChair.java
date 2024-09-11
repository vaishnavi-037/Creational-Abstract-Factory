package product.chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Chair");
    }

    @Override
    public void book() {
        System.out.println("Booking a Victorian Chair");
    }
}
