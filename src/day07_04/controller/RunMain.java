package day07_04.controller;

import day07_04.service.ManageEmployee;

import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageEmployee manageEmployee = new ManageEmployee();

        int choice;
        do {
            System.out.println("-------------Menu---------------");
            System.out.println("1. Hiển thị full time");
            System.out.println("2. Hiển thị part time");
            System.out.println("3. Hiển thị toàn bộ");
            System.out.println("4. Thêm 1 nhân viên mới");
            System.out.println("5. Xóa nhân viên theo id");
            System.out.println("6. Sửa 1 nhân viên theo id");
            System.out.println("Mời bạn nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manageEmployee.displayFullTime();
                    break;
                case 2:
                    manageEmployee.displayPartTime();
                    break;
                case 3:
                    manageEmployee.displayAll();
                    break;
                case 4:
                    int subChoice;
                    do {
                        System.out.println("1. Full time");
                        System.out.println("2. Part time");
                        System.out.println("0. Thoát");
                        System.out.print("Mời bạn nhập lựa chọn: ");
                        subChoice = scanner.nextInt();
                        switch (subChoice) {
                            case 1:
                                manageEmployee.addFullTime(scanner);
                                break;
                            case 2:
                                manageEmployee.addPartTime(scanner);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Không có lệnh trên!");
                        }
                    }while(subChoice != 0);
                    break;
                case 5:
                    System.out.print("Nhập id muốn xóa:");
                    int idDelete = scanner.nextInt();
                    manageEmployee.deleteById(idDelete);
                    break;
                case 6:
                    System.out.print("Nhập id muốn sửa:");
                    int idEdit = scanner.nextInt();
                    manageEmployee.editEmployee(idEdit, scanner);
                    break;
                default:
                    System.out.println("Không có lựa chọn trên!");
            }
        }while (choice != 0);
    }
}
