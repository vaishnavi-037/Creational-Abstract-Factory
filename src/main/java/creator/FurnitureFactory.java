package creator;

import product.chair.Chair;
import product.sofa.Sofa;
import product.table.Table;

public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();

    Table createTable();
}
