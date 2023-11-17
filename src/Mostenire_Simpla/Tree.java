package Mostenire_Simpla;

public class Tree {
    private int years;
    private double height;
    private String location;

    public Tree(int years, double height, String location) {
        this.years = years;
        this.height = height;
        this.location = location;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYears() {
        return this.years;
    }

    public double getHeight() {
        return this.height;
    }

    public String getLocation() {
        return this.location;
    }
    @Override
    public String toString() {
        return "Tree{" +
                "years=" + this.years +
                ", height=" + this.height +
                ", location='" +this.location + '\'' +
                '}';
    }
}
