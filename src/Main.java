import Package.Person;
import Package.Student;
import Package.Empoloii;
public class Main {
    public static void main(String[] args) {
        Person Student1 = new Student("Ringo ", "Starr", 1.9);
        Person Student2 = new Student("Paul ", "McCartney", 3.0);
        Person Empoloii1 = new Empoloii("John ", "Lennon", "Junior", 27045.78);
        Person Empoloii2 = new Empoloii("George ", "Harrison", "Senior", 50000.00);
        PrintData(Student1, Student2, Empoloii1, Empoloii2);
    }

    public static void PrintData(Person... persons) {
        for (Person person : persons) {
            String Data = (person.toString() + " earns " + person.getPaymentAmount() + " tenge");
            System.out.println(Data);
        }
    }
}