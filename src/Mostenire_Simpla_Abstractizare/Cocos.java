package Mostenire_Simpla_Abstractizare;

public class Cocos extends Tree{
    private String leafColor;
    public Cocos(int varsta, double inaltime, String locatie, String leafColor) {
        super(varsta, inaltime, locatie);
        this.leafColor = leafColor;
    }
    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }
    public String getLeafColor() {
        return this.leafColor;
    }
    @Override
    public void owner() {
        System.out.println("The owner is Dima");
    }
    @Override
    public int numberOfLeaves() {
        return 182732;
    }
    @Override
    public String toString() {
        return "Tree{" +
                "height=" + super.getHeight() +
                ", years=" + super.getYears() +
                ", location='" + super.getLocation() + '\'' +
                ", leafColor='" + this.leafColor + '\'' +
                '}';
    }
}
