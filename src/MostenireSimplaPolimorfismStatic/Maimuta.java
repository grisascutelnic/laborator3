package MostenireSimpla;

public class Maimuta extends Animal{
    private int varsta;
    public Maimuta(String denumire, String culoare, char sex, int varsta) {
        super(denumire, culoare, sex);
        this.varsta = varsta;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Maimuta{" +
                "varsta=" + varsta +
                '}';
    }
}
