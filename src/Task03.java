public class Task03 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 9.5, true);
//        student.name = "Alex";
//        student.age = 20;
//        student.mark = 9.5;
//        student.alive = true;

        System.out.println(student);

        Student student1 = new Student("Anna", 18, 8, true);

        System.out.println(student1);

        Student student2 = new Student("Harry", 18, 8, true);

        System.out.println(student2);
    }
}
