public class Shop {
    public static void main(String[] args) {
        Table table1 = new Table();
        table1.name = "S1";
        table1.colour = "brown";
        table1.high = 97;
        table1.price = 1000;

        Table table2 = new Table();
        table2.name = "S2";
        table2.colour = "black";
        table2.high = 102;
        table2.price = 899;

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
