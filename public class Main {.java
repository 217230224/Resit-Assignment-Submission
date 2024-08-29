public class Main {
    public static void main(String[] args) {
        initializeStudentList();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllStudents();
                    break;
                case 6:
                    Graduates.printGraduates();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void initializeStudentList() {
    }

    private static void displayAllStudents() {
    }
}