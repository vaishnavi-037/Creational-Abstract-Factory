package product.table;

public class ArtDecoTable implements Table{
    @Override
    public void putOn() {
        System.out.println("Putting on ArtDeco Table");
    }

    @Override
    public void book() {
        System.out.println("Booking a ArtDeco Table");
    }
}
