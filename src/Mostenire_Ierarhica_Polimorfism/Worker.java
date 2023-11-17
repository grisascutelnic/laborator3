package Mostenire_Ierarhica_Polimorfism;

public class Worker extends Person{
    private String profession;
    public Worker(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }
    public Worker() { }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public void describe() {
        System.out.println("Enter the name, age and profession delimited by enter: ");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + super.getName() +
                ", age=" + super.getAge() +
                ", profession=" + this.getProfession() +
                '}';
    }
}
