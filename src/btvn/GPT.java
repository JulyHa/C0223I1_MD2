package btvn;

import java.util.Scanner;

public class GPT {
    public static double inputNumber(Scanner scanner, String value) {
        double x;
        do {
            try {
                System.out.println("Nhập " + value);
                x = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi :" + e.getMessage());
            }
        } while (true);
        return x;
    }

    public static void ptBac2(Scanner scanner) {
        double a = inputNumber(scanner, "a");
        double b = inputNumber(scanner, "b");
        double c = inputNumber(scanner, "c");
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Pt vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Pt có nghiệm kép " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta) / (2 * a));
            double x2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("Pt có 2 nghiệm x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void ptBac1(Scanner scanner) {
        double a = inputNumber(scanner, "a");
        double b = inputNumber(scanner, "b");
        if (a != 0) {
            double x = -b / a;
            System.out.println("pt co nghiem là " + x);
        } else if (b != 0) System.out.println("pt vô nghiệm");
        else System.out.println("Pt vô số nghiệm");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("---------MENU----------");
            System.out.println("1. Giải pt bậc 1");
            System.out.println("2. Giải pt bậc 2");
            System.out.println("0. Thoát");
            System.out.println("Mời nhập vào lựa chọn");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
            switch (choice) {
                case 1:
                    ptBac1(scanner);
                    break;
                case 2:
                    ptBac2(scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
