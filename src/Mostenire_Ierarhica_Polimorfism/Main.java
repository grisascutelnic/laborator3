package Mostenire_Ierarhica_Polimorfism;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Alege ce doresti sa devii:");
        System.out.println("Person, Worker, Engineer, Researcher");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        switch (str) {
            case "Person":
                Person person = new Person();
                person.whoIAm("person");
                person.describe();
                String name = scanner.next();
                person.setName(name);
                int age = scanner.nextInt();
                person.setAge(age);
                System.out.println(person.toString());
                break;
            case "Worker":
                Worker worker = new Worker();
                worker.whoIAm("person", "worker");
                worker.describe();
                name = scanner.next();
                worker.setName(name);
                age = scanner.nextInt();
                worker.setAge(age);
                String profession = scanner.next();
                worker.setProfession(profession);
                System.out.println(worker.toString());
                break;
            case "Engineer":
                Engineer engineer = new Engineer();
                engineer.whoIAm("person", "worker", "engineer");
                engineer.describe();
                name = scanner.next();
                engineer.setName(name);
                age = scanner.nextInt();
                engineer.setAge(age);
                profession = scanner.next();
                engineer.setProfession(profession);
                String specialisation = scanner.next();
                engineer.setSpecialization(specialisation);
                System.out.println(engineer.toString());
                break;
            case "Researcher":
                Researcher researcher = new Researcher();
                researcher.whoIAm("person", "worker", "engineer", "researcher");
                researcher.describe();
                name = scanner.next();
                researcher.setName(name);
                age = scanner.nextInt();
                researcher.setAge(age);
                profession = scanner.next();
                researcher.setProfession(profession);
                specialisation = scanner.next();
                researcher.setSpecialization(specialisation);
                String domain = scanner.next();
                researcher.setDomain(domain);
                System.out.println(researcher.toString());
                break;
        }
    }
}
