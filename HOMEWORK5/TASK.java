package HOMEWORK5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

public class TASK {
    public static void main(String[] args) {
        HashMap<String,LinkedList<String>> PhoneBook = new HashMap<>();
        LinkedList<String>Numbers1 = AddNumbers(2);
        LinkedList<String>Numbers2 = AddNumbers(1);
        LinkedList<String>Numbers3 = AddNumbers(3);
        LinkedList<String>Numbers4 = AddNumbers(4);
        LinkedList<String>Numbers5 = AddNumbers(6); 
        PhoneBook.put("Иванов Иван Иванович", Numbers1);
        PhoneBook.put("Васильев Василий Васильевич", Numbers2);
        PhoneBook.put("Петров Пётр Петрович", Numbers3);
        PhoneBook.put("Сергеев Сергей Сергеевич", Numbers4);
        PhoneBook.put("Кузнецов Олег Георгиевич", Numbers5);
        System.out.println("Unsorted PhoneBook");
        PrintMap(PhoneBook);
        System.out.println("");
        System.out.println("Sorted PhoneBook");
        PrintMap(sortedhMap(PhoneBook));
    }

    public static void PrintMap(Map<String,LinkedList<String>> hMap){
        for(Map.Entry<String,LinkedList<String>> entry: hMap.entrySet()){
            System.out.println(entry);
        }
    }

    public static LinkedList<String> AddNumbers(int n){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> Numbers = new LinkedList<>();
        for(int i = 0; i<n;i++){
            Numbers.add(scanner.nextLine());
        }
        System.out.println(" ");
        return Numbers;
    }

    public static LinkedHashMap<String,LinkedList<String>> sortedhMap(HashMap<String,LinkedList<String>> hMap){
        List<Integer> sizes = new ArrayList<>();
        LinkedHashMap<String,LinkedList<String>> res = new LinkedHashMap<>();
        for(Map.Entry<String,LinkedList<String>> entry: hMap.entrySet()){
            sizes.add(entry.getValue().size());
        }
        sizes.sort(null);
        for(int i = sizes.size()-1;i>=0;i--){
            for(Map.Entry<String,LinkedList<String>> entry: hMap.entrySet()){
                if(entry.getValue().size()==sizes.get(i)){
                    res.put(entry.getKey(),entry.getValue());
                }
            }
            
        }    
        return res;
    }
}
