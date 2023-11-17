package Mostenire_Ierarhica_Polimorfism;

public class Researcher extends Engineer{
    private String domain;

    public Researcher(String name, int age, String profession, String specialization, String domain) {
        super(name, age, profession, specialization);
        this.domain = domain;
    }
    public Researcher() { }
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    @Override
    public void describe() {
        System.out.println("Enter the name, age, profession, specialization and domain delimited by enter: ");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name=" + super.getName() +
                ", age=" + super.getAge() +
                ", profession=" + super.getProfession() +
                ", specialisation=" + super.getSpecialization() +
                ", domain=" + this.getDomain() +
                '}';
    }
}
