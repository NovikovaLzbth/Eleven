public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(16, "Маргарита", "904-850-74-29", 1, "Медицинский факультет", 2019),
                new Student(25, "Иван", "904-853-94-56", 5, "Биологический факультет", 2009),
                new Student(17, "Игорь", "904-841-73-11", 2, "Физический факультет", 2022),
        };
        System.out.println("Список всех студентов:");
        for (Student student : students) {
            System.out.println(student.Name + " " + student.getAge() + " лет");
        }
        System.out.println();

        System.out.println("Список студентов Медицинского факультета:");
        for (Student student : students) {
            if (student.Faculty == "Медицинский факультет") {
                System.out.println(student.Name);
            }
        }
        System.out.println();

        System.out.println("Список студентов, поступивших после 2009 года:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getDateOfReceipt() > 2009) {
                System.out.println(students[i].Name);
            }
        }
    }
}
class Person {
    private int Age;
    public String Name;
    public String PhoneNumber;
    Person(int Age, String Name, String PhoneNumber){
        this.Age = Age;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
    }
    public int getAge(){
        return Age;
    }

}
class Student extends Person {
    int Course;
    String Faculty;
    private int DateOfReceipt;
    Student(int Age, String Name, String PhoneNumber, int Course, String Faculty, int DateOfReceipt) {
        super(Age, Name, PhoneNumber);
        this.Course = Course;
        this.Faculty = Faculty;
        this.DateOfReceipt = DateOfReceipt;
    }

    public int getDateOfReceipt() {
        return DateOfReceipt;
    }
}
