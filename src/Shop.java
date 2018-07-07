public class Shop {
    public static void main(String[] args) {
        Table table1 = new Table("S1", "brown", 97, 1000);

        Table table2 = new Table("S2", "black", 102, 899);

        System.out.println("Informacje o stole 1.");
        System.out.println("Name: " + table1.name);
        System.out.println("Colour: " + table1.colour);
        System.out.println("High: " + table1.high);
        System.out.println("Price: " + table1.price +"\n");

        System.out.println("Informacje o stole 2.");
        System.out.println("Name: " + table2.name);
        System.out.println("Colour: " + table2.colour);
        System.out.println("High: " + table2.high);
        System.out.println("Price: " + table2.price);
    }
}
