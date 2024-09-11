package product.chair;

public class ArtDecoChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on ArtDeco Chair");
    }

    @Override
    public void book() {
        System.out.println("Booking a ArtDeco Chair");
    }
}
