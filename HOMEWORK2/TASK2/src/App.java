import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

// 2) Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];
        FillArray(array);
        System.out.println(Arrays.toString(array));
        Logger logger = Logger.getLogger(App.class.getName());
        FileHandler info = new FileHandler("log.txt");
        logger.addHandler(info);
        SimpleFormatter Format = new SimpleFormatter();
        info.setFormatter(Format);
        boolean sorted = false;
        int temp;
        int count = 0;
        while (!sorted) {
            sorted = true;
            for(int i = 0;i<array.length - 1; i++){
                if(array[i]>array[i+1]){
                    temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    sorted=false;
                    count++;
                    logger.info( "text log " + Integer.toString(count));
                }
            }
        }
    }
   
    static void FillArray(int[] array){
        for(int i = 0;i<array.length;i++){
            array[i] = (int)(Math.random()*30);
        }
    }
        
}
