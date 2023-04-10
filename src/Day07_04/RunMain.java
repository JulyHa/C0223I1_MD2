package Day07_04;

import java.util.Scanner;

public class RunMain {
    public static void displayFullTime(Employee[] employees){
        for(Employee employee : employees){
            if(employee instanceof FullTime){
                System.out.println(employee);
            }
        }
    }
    public static void displayPartTime(Employee[] employees){
        for(Employee employee : employees){
            if(employee instanceof PartTime){
                System.out.println(employee);
            }
        }
    }

    public static boolean findIndexById(int id, Employee[] employees){
        // kiểm tra xem id có trong employee không?
        for(Employee e : employees){
            if(e.getId() == id){
               return true;
            }
        }
        return false;
    }
    public static Employee[] deleteById(int id, Employee[] employees){
        Employee[] newEmployee;
        // kiểm tra xem id có trong employee không?
        if(findIndexById(id, employees)){ // nếu có thì độ dài mảng mới - 1
           newEmployee = new Employee[employees.length - 1];
        }
        else { // nếu có thì độ dài mảng mới = độ dài mảng cũ.
            newEmployee = new Employee[employees.length];
        }
        int index = 0;
        for(Employee e : employees){
            if(e.getId() != id){
                newEmployee[index] = e;
                index++;
            }
        }
        return newEmployee;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[2];
        FullTime f = new FullTime(1, "NguyenNgu", 21, 10 );
        PartTime p = new PartTime(2, "Van A", 20, 24);

        employees[0] = (Employee) f;
        employees[1] = (Employee) p;

//        for(int i =0; i< 2; i++){
//            if(employees[i] instanceof FullTime){ // instanceof tương tự type of
//                FullTime f1 = (FullTime) employees[i];
//                System.out.println(f1.getYearsOfExp() * 2000000);
//            }
//            else {
//                PartTime f1 = (PartTime) employees[i];
//                System.out.println(f1.getWorkTime() * 25000);
//            }
//        }
        int choice;
        do {
            System.out.println("-------------Menu---------------");
            System.out.println("1. Hiển thị full time");
            System.out.println("2. Hiển thị part time");
            System.out.println("3. Thêm 1 nhân viên mới");
            System.out.println("4. Xóa nhân viên theo id");
            System.out.println("Mời bạn nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayFullTime(employees);
                    break;
                case 2:
                    displayPartTime(employees);
                    break;
                case 3:
                    // hiển thị menu con
                    // tạo 1 hàm nhập nv full time
                    // tạo 1 hàm nhập nv part time
                    // => Quy về thêm 1 nv vào 1 mảng

                    break;
                case 4:
                    employees = deleteById(1, employees);
                    for(Employee e : employees){
                        System.out.println(e);
                    }
                    break;
                default:
                    System.out.println("Không có lựa chọn trên!");
            }
        }while (choice != 0);


    }



}
