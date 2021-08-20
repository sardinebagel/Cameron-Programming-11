import java.util.ArrayList;
public class Student {
    //fields
    String firstName;
    String lastName;
    int grade;
    int studentNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        studentNumber = (int) (Math.random() * 100000);
    }

    // function that is called in school to loop through the list as i was having trouble with the terminal printing nonsense for the arraylist
    public void printStudent() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Grade: " + grade);
        studentNumber = (int) (Math.random() * 100000);
        System.out.println("Student Number: " + studentNumber);
    }


    // constructor that needs parameters but also creates a random student number when created (up to 5 digits)
    Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
}


