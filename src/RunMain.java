import java.util.Scanner;

public class RunMain {
    static Scanner scanner = new Scanner(System.in);

    public static Student createStudent(){
        System.out.println("Mời bạn nhập tuổi: ");
        int age  = scanner.nextInt();
        scanner.nextLine(); // đọc bộ nhớ đệm để làm mất ký tự enter khi nhập số
        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        return new Student(name, age);
    }
    public static void createStudent(Student student){
        System.out.println("Mời bạn nhập tuổi: ");
        int age  = scanner.nextInt();
        student.setAge(age);
        scanner.nextLine(); // đọc bộ nhớ đệm để làm mất ký tự enter khi nhập số
        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        student.setName(name);
    }

    public static void main(String[] args) {
        Student student =new Student();
        createStudent(student);
        Student student2 = createStudent();

        System.out.println(student);
        System.out.println(student2);

    }
}
