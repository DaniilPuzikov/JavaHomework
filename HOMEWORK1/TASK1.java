// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HOMEWORK1;

import java.util.Scanner;

/**
 * TASK1
 */
public class TASK1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = scnr.nextInt();
        System.out.printf("n-угольное число - это ");
        System.out.println(TreSum(n));
        System.out.printf("n! = "); 
        System.out.println(Fact(n));
    }

    static int TreSum(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    static int Fact(int n){
        int f = 1;
        for(int i = 2;i<=n;i++){
            f*=i;
        }
        return f;
    }
}