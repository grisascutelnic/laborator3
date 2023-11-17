package Mostenire_Simpla;

public class Main {
    public static void main(String[] args) {
        Walnut walnut = new Walnut(9, 4.5, "Gradina Botanica", "Brown");
        walnut.setHeight(10);
        walnut.setFructColor("Green");
        System.out.println(walnut.toString());
    }
}
