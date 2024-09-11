package product.sofa;

public class ArtDecoSofa implements Sofa{
    @Override
    public void layOn() {
        System.out.println("Laying on ArtDeco Sofa");
    }

    @Override
    public void book() {
        System.out.println("Booking a ArtDeco Sofa");
    }
}
