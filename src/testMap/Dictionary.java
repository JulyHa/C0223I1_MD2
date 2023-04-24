package testMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, String> dictionary = new HashMap<>();
    public static void main(String[] args) {
        do{
            System.out.println("-------Menu-------------");
            System.out.println("1. Thêm từ điểm");
            System.out.println("2. Tra từ điểm");
            System.out.println("3. Sửa từ điểm");
            System.out.println("0. Thoát");
            System.out.println("Mời ban nhap lua chon: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addDictionary();
                    break;
                case 2:
                    System.out.println("Nhap tu can tra: ");
                    String search = scanner.nextLine();
                    String translate = searchDictionary(search);
                    if(translate.equals("")){
                        System.out.println("Khong co trong tu dien");
                    }
                    else {
                        System.out.println("Dich: " + translate);
                    }

                    break;
                case 3:
                    editDictionary();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khong co lua chon tren");
            }
        }while(true);

    }
    public static void addDictionary(){
        System.out.println("Nhap tu tieng anh: ");
        String key = scanner.nextLine();
        System.out.println("Moi ban nhap nghia: ");
        String value = scanner.nextLine();
        dictionary.put(key, value);
        System.out.println("Them thanh cong!");
    }
    public static String searchDictionary(String search){
//        Set<String> keySet = dictionary.keySet();
//        for(String k : keySet){
//            if(k.equalsIgnoreCase(search)){
//                return dictionary.get(k);
//            }
//        }
        if(dictionary.containsKey(search)){
            return dictionary.get(search);
        }
        return "";
    }
    public static void editDictionary(){
        System.out.println("Nhap tu tieng anh: ");
        String key = scanner.nextLine();
        System.out.println("Moi ban nhap nghia: ");
        String value = scanner.nextLine();
        System.out.println(dictionary.replace(key, dictionary.get(key), value) );

//        String words = searchDictionary(key);
//
//        if(words.equals("")){
//            System.out.println("Khong co tu");
//        }
//        else {
//           System.out.println("Moi ban nhap nghia: ");
////            String value = scanner.nextLine();
//////            dictionary.put(key, value);
//
//            System.out.println("Sua thanh cong!");
//        }

    }
}
