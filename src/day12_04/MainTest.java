package day12_04;

import java.util.Scanner;

public class MainTest {
    public static Brand findBrandById(Brand[] brands, int id){
        for (Brand brand:brands) {
            if(brand.getId() == id){
                return brand;
            }
        }
        return new Brand();
    }
    public static Product createProduct(Scanner scanner, Brand[] brands){
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập des: ");
        String des = scanner.nextLine();
        for (Brand brand : brands) {
            System.out.println(brand);
        }
        System.out.println("Nhập brand: ");
        int idBrand = Integer.parseInt(scanner.nextLine());
        Brand newBrand = findBrandById(brands,idBrand);
        return new Product(name, price, des, newBrand);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Brand[] brands = new Brand[]{new Brand( "Apple"), new Brand( "SamSung"), new Brand("Nokia")};
        Product[] products = new Product[3];
        for(int i=0; i< products.length; i++){
            products[i] = createProduct(scanner, brands);
        }
        for(Product p : products){
            System.out.println(p);
        }
    }
}
