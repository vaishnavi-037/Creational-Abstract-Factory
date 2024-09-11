package creator;

import product.chair.ArtDecoChair;
import product.chair.Chair;
import product.sofa.ArtDecoSofa;
import product.sofa.Sofa;
import product.table.ArtDecoTable;
import product.table.Table;

public class ArtDecoFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }
}
