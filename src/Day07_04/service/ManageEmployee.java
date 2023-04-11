package Day07_04.service;

import Day07_04.model.Employee;
import Day07_04.model.FullTime;
import Day07_04.model.PartTime;

import java.util.Scanner;

public class ManageEmployee {
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public ManageEmployee() {
        employees = new Employee[2];
        FullTime f = new FullTime(1, "NguyenNgu", 21, 10);
        PartTime p = new PartTime(2, "Van A", 20, 24);
        employees[0] = f;
        employees[1] = p;
    }

    public void displayFullTime() {
        for (Employee employee : employees) {
            if (employee instanceof FullTime) {
                System.out.println(employee);
            }
        }
    }

    public void displayPartTime() {
        for (Employee employee : employees) {
            if (employee instanceof PartTime) {
                System.out.println(employee);
            }
        }
    }

    public void displayAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public int findIndexById(int id) {
        // tìm vị trí của phần từ có id = id vừa truyền vào
        for (int i =0; i< employees.length; i++) {
            if (employees[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void deleteById(int id) {
        Employee[] newEmployee;
        // kiểm tra xem id có trong employee không?
        if (findIndexById(id) > -1) { // nếu có thì độ dài mảng mới - 1
            newEmployee = new Employee[employees.length - 1];
        } else { // nếu có thì độ dài mảng mới = độ dài mảng cũ.
            newEmployee = new Employee[employees.length];
        }
        int index = 0;
        for (Employee e : employees) {
            if (e.getId() != id) {
                newEmployee[index] = e;
                index++;
            }
        }
        employees = newEmployee;
    }

    public Employee addEmployee(Scanner scanner) {
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        System.out.println("Nhập name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập age: ");
        int age = scanner.nextInt();
        return new Employee(id, name, age);
    }

    public void addFullTime(Scanner scanner) {
        Employee employee = addEmployee(scanner);
        System.out.println("Nhập năm kinh nghiệm: ");
        int yearsOfExp = scanner.nextInt();
        Employee newEmployee = new FullTime(employee, yearsOfExp);
        Employee[] newList = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, newList, 0, employees.length);
        newList[newList.length - 1] = newEmployee;
        employees = newList;
    }

    public void addPartTime(Scanner scanner) {
        Employee employee = addEmployee(scanner);
        System.out.println("Nhập năm giờ làm: ");
        int yearsOfExp = scanner.nextInt();
        Employee newEmployee = new PartTime(employee, yearsOfExp);
        Employee[] newList = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, newList, 0, employees.length);
        newList[newList.length - 1] = newEmployee;
        employees = newList;
    }

    public void editEmployee(int id, Scanner scanner) {
        int index = findIndexById(id);
        if(index < 0){
            System.out.println("Không có id trên!");
            return;
        }
        Employee employee = addEmployee(scanner);
        if(employees[index] instanceof FullTime){
            System.out.println("Nhập năm kinh nghiệm: ");
            int yearsOfExp = scanner.nextInt();
            Employee newEmployee = new FullTime(employee, yearsOfExp);
            employees[index] = newEmployee;
        }
        else {
            System.out.println("Nhập năm giờ làm: ");
            int yearsOfExp = scanner.nextInt();
            Employee newEmployee = new PartTime(employee, yearsOfExp);
            employees[index] = newEmployee;
        }
    }
}
