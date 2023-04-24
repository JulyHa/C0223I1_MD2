package testMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i< 5; i++){
            list.add(scanner.nextInt());
        }

        Map<Integer, Integer> maps = new HashMap<>();
        for(int element : list){
            if(!maps.containsKey(element)){ // kiem tra xem element co trong map khong
                maps.put(element, 1);
            }
            else {
                maps.put(element, maps.get(element)+1);
            }
        }
        for(int key : maps.keySet()){
            System.out.println(key + " xuat hien: " + maps.get(key));
        }
    }
}
