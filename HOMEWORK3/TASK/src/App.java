import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> aList = new ArrayList<>();
        FillArrayList(aList);
        System.out.println(aList.toString());
        DeleteEven(aList);
        System.out.println(aList.toString());
        System.out.println(FindMax(aList));
        System.out.println(FindMin(aList));
        System.out.println(FindMiddle(aList));
    }
    static void FillArrayList(ArrayList<Integer> aList){
        for(int i = 0;i<7;i++){
            aList.add(new Random().nextInt(50));
        }
    }
    static void DeleteEven(ArrayList<Integer> aList){
        for(int i = 0;i<aList.size();i++){
            if (aList.get(i)%2==0) {
                aList.remove(i);
            }
        }
    }
    static Integer FindMin(ArrayList<Integer> aList){
        int min = aList.get(0);
        for(int i = 0;i<aList.size();i++){
            if (aList.get(i)<min) {
                min = aList.get(i);
            }
        }
        return min;
    }
    static Integer FindMax(ArrayList<Integer> aList){
        int max = aList.get(0);
        for(int i = 0;i<aList.size();i++){
            if (aList.get(i)>max) {
                max = aList.get(i);
            }
        }
        return max;
    }
    static double FindMiddle(ArrayList<Integer> aList){
        double summa = 0;
        for(int i = 0;i<aList.size();i++){
            summa+=aList.get(i);
        }
        return summa/aList.size();
    }
}
