package creator;

import product.chair.Chair;
import product.chair.ModernChair;
import product.sofa.ModernSofa;
import product.sofa.Sofa;
import product.table.ModernTable;
import product.table.Table;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
