package kata2;

import java.util.ArrayList;

public class Kata2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            list.add((int)(Math.random()*80));
        }
        System.out.println("Primera Lista");
        
        for (Integer value : list) {
            System.out.println(value);
        }
        
        
        ArrayList<Integer> elderPeople = new ArrayList<>();
        for (Integer value : list) {
            if (value <= 70) continue;
            elderPeople.add(value);
        }
        list.removeAll (elderPeople);
        
        System.out.println("Segunda Lista");
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
