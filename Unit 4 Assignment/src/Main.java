import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // variables for teachers and students
        Teacher richardH = new Teacher("Richard", "Hendricks", "Computer Science");
        Teacher bertramG = new Teacher("Bertram", "Gilfoyle", "Computer Science");
        Teacher dineshC = new Teacher("Dinesh", "Chugtai", "Computer Science");
        Student erlichB = new Student("Erlich", "Bachman", 12);
        Student monicaH = new Student("Monica", "Hall", 12);
        Student jianY = new Student("Jian", "Yang", 12);
        Student jaredD = new Student("Jared", "Dunn", 12);
        Student nelsonB = new Student("Nelson", "Bighetti", 12);
        Student gavinB = new Student("Gavin", "Belson", 12);
        Student russH = new Student("Russ", "Hanneman", 12);
        Student jackB = new Student("Jack", "Barker", 12);
        Student laurieB = new Student("Laurie", "Bream", 12);
        Student peterG = new Student("Peter", "Gregory", 12);
        School newSchool = new School();


        // add teachers
        newSchool.addTeacher(richardH);
        newSchool.addTeacher(bertramG);
        newSchool.addTeacher(dineshC);

        // add students
        newSchool.addStudent(erlichB);
        newSchool.addStudent(monicaH);
        newSchool.addStudent(jianY);
        newSchool.addStudent(jaredD);
        newSchool.addStudent(nelsonB);
        newSchool.addStudent(gavinB);
        newSchool.addStudent(russH);
        newSchool.addStudent(jackB);
        newSchool.addStudent(laurieB);
        newSchool.addStudent(peterG);

        // print students and teachers
        newSchool.printTeachers();
        newSchool.printStudents();

        // remove students and teachers
        newSchool.removeStudents(newSchool.students);
        newSchool.removeStudents(newSchool.students);

        newSchool.removeTeachers(newSchool.teachers);

        // print new list of students and teachers
        newSchool.printTeachers();
        newSchool.printStudents();

    }


    }









