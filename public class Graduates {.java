public class Graduates {
    private static ArrayList<Student> graduatesList; 

    public static void printGraduates() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("GraduateStudents.txt"));
            writer.write("Following students have graduated so far.\n");
            
            for (Student student : graduatesList) {
                if (student.isGraduated()) {
                    writer.write("Student ID: " + student.getStudentID() + "\n");
                    writer.write("Student Name: " + student.getName() + "\n");
                    writer.write("Age: " + student.getAge() + "\n");
                    writer.write("Gender: " + student.getGender() + "\n");
                    writer.write("Year of Admission: " + student.getAdmissionYear() + "\n");
                    writer.write("Year of Graduation: " + student.getGraduationYear() + "\n\n");
                }
            }

            writer.close();
            System.out.println("Graduates' information has been written to GraduateStudents.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

Java
public class Student {
    private String studentID;
    private String name;
    private int age;
    private char gender;
    private int admissionYear;
    private int graduationYear;
    private boolean isGraduated;

    
    public boolean isGraduated() {
        return graduationYear > admissionYear;
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

