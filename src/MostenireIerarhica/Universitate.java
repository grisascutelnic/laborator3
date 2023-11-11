package MostenireIerarhica;

public class Universitate {
    private String denumire;
    private String locatie;
    private int nrStudenti;

    public Universitate(String denumire, String locatie, int nrStudenti) {
        this.denumire = denumire;
        this.locatie = locatie;
        this.nrStudenti = nrStudenti;
    }

    public String getDenumire() {
        return this.denumire;
    }

    public String getLocatie() {
        return this.locatie;
    }

    public int getNrStudenti() {
        return this.nrStudenti;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public void setNrStudenti(int nrStudenti) {
        this.nrStudenti = nrStudenti;
    }

    @Override
    public String toString() {
        return "Universitate{" +
                "denumire='" + denumire + '\'' +
                ", locatie='" + locatie + '\'' +
                ", nrStudenti=" + nrStudenti +
                '}';
    }
}
