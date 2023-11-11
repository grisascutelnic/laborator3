package MostenireSimpla;

public class Animal {
    private String denumire;
    private String culoare;
    private char sex;

    public Animal(String denumire, String culoare, char sex) {
        this.denumire = denumire;
        this.culoare = culoare;
        this.sex = sex;
    }

    public String getDenumire() {
        return this.denumire;
    }

    public String getCuloare() {
        return this.culoare;
    }

    public char getSex() {
        return this.sex;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "denumire='" + denumire + '\'' +
                ", culoare='" + culoare + '\'' +
                ", sex=" + sex +
                '}';
    }
}
