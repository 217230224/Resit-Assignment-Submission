public class StudentOperation {
    private ArrayList<Student> students;

    public StudentOperation(ArrayList<Student> students) {
        this.students = students;
    }


    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生详细信息:");
        String studentID = scanner.nextLine();
        String studentName = scanner.nextLine();
        int age = scanner.nextInt();
        char gender = getGenderInput(scanner);
        int yearOfAdmission = scanner.nextInt();
        int yearOfGraduation = scanner.nextInt();

        Student newStudent = new Student(studentID, studentName, age, gender,
                yearOfAdmission, yearOfGraduation);
        students.add(newStudent);
        scanner.close();
    }


    private char getGenderInput(Scanner scanner) {
        while (true) {
            System.out.println("请输入性别（M/F）：");
            String input = scanner.nextLine().toUpperCase();
            if ("M".equals(input) || "F".equals(input)) {
                return input.charAt(0);
            }
            System.out.println("输入无效，请选择M或F:");
        }
    }


    public void removeStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学生ID:");
        String id = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
                System.out.println("学生已成功删除.");
                break;
            } else {
                System.out.println("此ID不存在.");
            }
        }
        scanner.close();
    }


    public void updateStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要更新的学生ID:");
        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("请输入新名字（空则保持不变）:");
                String newName = scanner.nextLine();
                if (!newName.equals(null)) {
                    student.setName(newName);
                }

                scanner.next();
                char newGender = 'X';
                student.setGender(newGender);

                break;
            } else {
                System.out.println("此ID不存在.");
            }
        }
        scanner.close();
    }

    public void searchStudentByID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要搜索的学生ID:");
        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("学生信息如下:");
                break;
            } else {
                System.out.println("未找到该ID的学生.");
            }
        }
        scanner.close();
    }
}
import java.io.*;
import java.util.ArrayList;