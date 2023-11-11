package MostenireIerarhica;

public class Etaj extends Universitate{
    private short nrCabinete;
    public Etaj(String denumire, String locatie, int nrStudenti, short nrCabinete) {
        super(denumire, locatie, nrStudenti);
        this.nrCabinete = nrCabinete;
    }

    public short getNrCabinete() {
        return this.nrCabinete;
    }

    public void setNrCabinete(short nrCabinete) {
        this.nrCabinete = nrCabinete;
    }

    @Override
    public String toString() {
        return "Etaj{" +
                "nrCabinete=" + nrCabinete +
                '}';
    }
}
