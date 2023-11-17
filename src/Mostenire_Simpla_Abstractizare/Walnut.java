package Mostenire_Simpla_Abstractizare;

public class Walnut extends Tree{
    private String fructColor;
    public Walnut(int varsta, double inaltime, String locatie, String fructColor) {
        super(varsta, inaltime, locatie);
        this.fructColor = fructColor;
    }
    public void setFructColor(String fructColor) {
        this.fructColor = fructColor;
    }
    public String getFructColor() {
        return this.fructColor;
    }

    @Override
    public void owner() {
        System.out.println("The owner is Grisa");
    }
    @Override
    public int numberOfLeaves() {
        return 19283;
    }
    @Override
    public String toString() {
        return "Tree{" +
                "height=" + super.getHeight() +
                ", years=" + super.getYears() +
                ", location='" + super.getLocation() + '\'' +
                ", fructColor='" + this.fructColor + '\'' +
                '}';
    }
}
