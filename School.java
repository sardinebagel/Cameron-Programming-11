import java.util.ArrayList;

public class School {
    // starting arraylists and fields
    public ArrayList<Teacher> teachers = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<String> courses = new ArrayList<>();
    int numberOfRooms;
    int numberOfFloors;
    String slogan;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    // add values to students and teachers
    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void addTeacher(Teacher newTeacher){
        teachers.add(newTeacher);
    }

    // remove values to students and teachers
    public void removeStudents(ArrayList<Student> students) {
        students.remove(students.size() - 1);

    }

    public void removeTeachers(ArrayList<Teacher> teachers){
        teachers.remove(teachers.size() - 1);
    }

    // return teachers and students
    public void printTeachers() {
        System.out.println("++ Teacher Count: " + teachers.size());
        for (Teacher tea : teachers) {
            tea.printTeacher();
        }
    }



    public void printStudents() {
        System.out.println("++ Student count: " + students.size());
        for (Student stu : students) {
            stu.printStudent();
        }
    }

    // constructor that needs no parameters
    School(){
        int numberOfRooms = 0;
        int numberOfFloors = 0;
        String slogan = "";
        ArrayList<Teacher> teachers;
        ArrayList<Student> students;
        ArrayList<String> courses;
    }
}