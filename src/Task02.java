public class Task02 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Alex";
        std1.age = 20;
//        System.out.println(std1.name);
//        System.out.println(std1.age);
//        System.out.println(std1.mark);
//        System.out.println(std1.alive);
        System.out.println(std1.getInfo());

        Student std2 = new Student();
        std2.name = "Anna";
        std2.age = 18;
//        System.out.println(std2.name);
//        System.out.println(std2.age);
//        System.out.println(std2.mark);
//        System.out.println(std2.alive);
        System.out.println(std2.getInfo());

        Student std3 = new Student();
        std3.name = "Peter";
        std3.age = 21;
//        System.out.println(std3.name);
//        System.out.println(std3.age);
//        System.out.println(std3.mark);
//        System.out.println(std3.alive);
        System.out.println(std3.getInfo());
    }
}
