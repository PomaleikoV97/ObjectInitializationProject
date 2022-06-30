public class Task04 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 10, true);
//        Student student2 = new Student("Alex", 20, 10, true);
//        Student student3= new Student("Alex", 20, 10, true);
//        Student student4 = new Student("Alex", 20, 10, true);

        Student student2 = new Student(student);

        Student student3 = new Student(student);

        Student student4 = new Student(student);
    }
}
