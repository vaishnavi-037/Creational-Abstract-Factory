import creator.ArtDecoFurnitureFactory;
import creator.FurnitureFactory;
import creator.ModernFurnitureFactory;
import creator.VictorianFurnitureFactory;
import product.chair.Chair;
import product.sofa.Sofa;
import product.table.Table;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String variantOfFurniture = sc.nextLine();
        String typeOfFurniture = sc.nextLine();

        FurnitureFactory furnitureFactory = getFurnitureFactory(variantOfFurniture);

        System.out.println("----------------Starting the APPLICATION----------------");

        if(typeOfFurniture.equalsIgnoreCase("CHAIR")) {
            Chair chair = furnitureFactory.createChair();
            chair.book();
            chair.sitOn();
        } else if (typeOfFurniture.equalsIgnoreCase("TABLE")) {
            Table table = furnitureFactory.createTable();
            table.book();
            table.putOn();
        } else if (typeOfFurniture.equalsIgnoreCase("SOFA")) {
            Sofa sofa = furnitureFactory.createSofa();
            sofa.book();
            sofa.layOn();
        } else throw new Exception("Currently we don't have " + typeOfFurniture + " type of furniture");

        System.out.println("----------------Ending the APPLICATION----------------");
    }

    private static FurnitureFactory getFurnitureFactory(String variantOfFurniture) throws Exception {
        FurnitureFactory furnitureFactory;

        if(variantOfFurniture.equalsIgnoreCase("MODERN")){
            furnitureFactory = new ModernFurnitureFactory();
        } else if(variantOfFurniture.equalsIgnoreCase("VICTORIAN")){
            furnitureFactory = new VictorianFurnitureFactory();
        }else if(variantOfFurniture.equalsIgnoreCase("ARTDECO")){
            furnitureFactory = new ArtDecoFurnitureFactory();
        } else
            throw new Exception("Currently we don't have " + variantOfFurniture + " variant of furniture");
        return furnitureFactory;
    }
}
