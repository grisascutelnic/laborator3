package Mostenire_Simpla_Abstractizare;

public class Samsung implements Phone{
    private int ram;
    private double greutate;

    public Samsung(int ram, double greutate) {
        this.ram = ram;
        this.greutate = greutate;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public int getRam() {
        return ram;
    }

    public double getGreutate() {
        return greutate;
    }

    @Override
    public void color() {
        System.out.println("Albastru");
    }

    @Override
    public void displaySize() {
        System.out.println("Diagonala: 7cm");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "ram=" + ram +
                ", greutate=" + greutate +
                '}';
    }
}
