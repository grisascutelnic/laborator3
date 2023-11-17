package Mostenire_Ierarhica_Polimorfism;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Worker worker = new Worker();
        Engineer engineer = new Engineer();
        Researcher researcher = new Researcher();

        System.out.println("Choose what you want to be: ");
        System.out.println("Person, Worker, Engineer, Researcher");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        switch (str) {
            case "Person":
                person.whoIAm("person");
                person.describe();
                String name = scanner.next();
                person.setName(name);
                int age = scanner.nextInt();
                person.setAge(age);
                System.out.println(person.toString());
                System.out.println("If you want to change an atribut you can write the atribut and the value " +
                        "delimited by enter");
                System.out.println("If you want display the object or exit, you can write 'display' or 'exit'");
                String atribut = scanner.next();
                while (atribut != "exit") {
                    switch (atribut) {
                        case "display":
                            System.out.println(person.toString());
                            break;
                        case "name" :
                            name = scanner.next();
                            person.setName(name);
                            break;
                        case "age" :
                            age = scanner.nextInt();
                            person.setAge(age);
                            break;
                        case "exit" :
                            System.exit(0);
                            break;
                    }
                    atribut = scanner.next();
                }
                break;
            case "Worker":
                person.whoIAm("person", "worker");
                worker.describe();
                name = scanner.next();
                worker.setName(name);
                age = scanner.nextInt();
                worker.setAge(age);
                String profession = scanner.next();
                worker.setProfession(profession);
                System.out.println(worker.toString());
                System.out.println("If you want to change an atribut you can write the atribut and the value " +
                        "delimited by enter");
                System.out.println("If you want display the object or exit, you can write 'display' or 'exit'");
                atribut = scanner.next();
                while (atribut != "exit") {
                    switch (atribut) {
                        case "display":
                            System.out.println(worker.toString());
                            break;
                        case "name" :
                            name = scanner.next();
                            worker.setName(name);
                            break;
                        case "age" :
                            age = scanner.nextInt();
                            worker.setAge(age);
                            break;
                        case "profession" :
                            profession = scanner.next();
                            worker.setProfession(profession);
                            break;
                        case "exit" :
                            System.exit(0);
                            break;
                    }
                    atribut = scanner.next();
                }
                break;
            case "Engineer":
                person.whoIAm("person", "worker", "engineer");
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
                System.out.println("If you want to change an atribut you can write the atribut and the value " +
                        "delimited by enter");
                System.out.println("If you want display the object or exit, you can write 'display' or 'exit'");
                atribut = scanner.next();
                while (atribut != "exit") {
                    switch (atribut) {
                        case "display":
                            System.out.println(engineer.toString());
                            break;
                        case "name" :
                            name = scanner.next();
                            engineer.setName(name);
                            break;
                        case "age" :
                            age = scanner.nextInt();
                            engineer.setAge(age);
                            break;
                        case "profession" :
                            profession = scanner.next();
                            engineer.setProfession(profession);
                            break;
                        case "specialization" :
                            specialisation = scanner.next();
                            engineer.setSpecialization(specialisation);
                            break;
                        case "exit" :
                            System.exit(0);
                            break;
                    }
                    atribut = scanner.next();
                }
                break;
            case "Researcher":
                person.whoIAm("person", "worker", "engineer", "researcher");
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
                System.out.println("If you want to change an atribut you can write the atribut and the value " +
                        "delimited by enter");
                System.out.println("If you want display the object or exit, you can write 'display' or 'exit'");
                atribut = scanner.next();
                while (atribut != "exit") {
                    switch (atribut) {
                        case "display":
                            System.out.println(researcher.toString());
                            break;
                        case "name" :
                            name = scanner.next();
                            researcher.setName(name);
                            break;
                        case "age" :
                            age = scanner.nextInt();
                            researcher.setAge(age);
                            break;
                        case "profession" :
                            profession = scanner.next();
                            researcher.setProfession(profession);
                            break;
                        case "specialization" :
                            specialisation = scanner.next();
                            researcher.setSpecialization(specialisation);
                            break;
                        case "domain" :
                            domain = scanner.next();
                            researcher.setDomain(domain);
                            break;
                        case "exit" :
                            System.exit(0);
                            break;
                    }
                    atribut = scanner.next();
                }
                break;
        }
    }
}
