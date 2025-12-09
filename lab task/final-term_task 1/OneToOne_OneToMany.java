 class Student {
   private String name;
   public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
class School {
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int numberOfstudents) {
        this.schoolName = schoolName;
        this.students = new Student[numberOfstudents]; 
    }

    public void addstudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Cannot add more student " + schoolName);
        }
    }

    public void showstudents() {
        System.out.println("school " + schoolName);
        System.out.println("students" + student);
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + students[i].getName());
        }
    }
}
class Contact {
    private String phone;
    private String email;
    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return "Phone: " + phone + ", Email: " + email;
    }
}


class StuDent{
    private String name;
    private Contact contact; 
    public StuDent(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public void showstudentInfo() {
        System.out.print("student Name: " + name);
        System.out.println("contact: " + contact);
    }
}

// -------------------- MAIN --------------------
public class OneToOne_OneToMany {
    public static void main(String[] args) {

        
        School s = new School("Californiaschool", 3);
        s.addstudent(new Student("Los Angeles"));
        s.addstudent(new Student("San Diego"));
        s.addstudent(new Student("San Francisco"));

        s.showstudents();

       
        Contact c = new Contact("123-456-7890");
        StuDent s1 = new StuDent("John Doe", c);
        s1.showstudentInfo();

        Contact c1 = new Contact("123-456-7890");
        StuDent s2 = new StuDent("John Doe", c1);
        s2.showstudentInfo();

        Contact c2 = new Contact("123-456-7890");
        StuDent s3 = new StuDent("John Doe", c2);


        s3.showstudentInfo();
    }
}