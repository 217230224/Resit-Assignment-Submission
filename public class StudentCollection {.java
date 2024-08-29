public class StudentCollection 
    private ArrayList<Student> students;

    public StudentCollection() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() 
        return students;
    

    public void addStudents(String filePath)
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 7) { 
                    Student student = new Student(data[0], data[1], Integer.parseInt(data[2]), data[3].charAt(0), Integer.parseInt(data[4]), data[5], data[6]);
                    students.add(student);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from CSV file: " + e.getMessage());
        }