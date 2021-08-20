import java.util.ArrayList;
public class Teacher {
    // fields
    String firstName;
    String lastName;
    String subject;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // function that is called in school to loop through the list as i was having trouble with the terminal printing nonsense for the arraylist
    public void printTeacher() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Subject: " + subject);
    }

    // constructor that needs parameters
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
}
