package Mostenire_Ierarhica_Polimorfism;

public class Engineer extends Worker{
    private String specialization;
    public Engineer(String name, int age, String profession, String specialization) {
        super(name, age, profession);
        this.specialization = specialization;
    }
    public Engineer() { }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void describe() {
        System.out.println("Enter the name, age, profession and specialization delimited by enter: ");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name=" + super.getName() +
                ", age=" + super.getAge() +
                ", profession=" + super.getProfession() +
                ", specialisation=" + this.getSpecialization() +
                '}';
    }
}
