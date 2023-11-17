package Mostenire_Simpla_Abstractizare;

public class Main {
    public static void main(String[] args) {
        Walnut walnut = new Walnut(9, 4.5, "Gradina Botanica", "Brown");
        Cocos cocos = new Cocos(10, 6d, "Seliste", "Green");
        walnut.setHeight(10);
        walnut.setFructColor("Green");
        System.out.println(walnut.toString());
        System.out.println(cocos.numberOfLeaves());
        walnut.owner();
    }
}
