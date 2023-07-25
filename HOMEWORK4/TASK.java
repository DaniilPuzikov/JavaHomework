package HOMEWORK4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов 
//содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.




public class TASK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1>=0 && n2>=0){
            System.out.println("Одно из чисел должно быть отрицатьльным");
        }
        else{
            Deque<Integer> dq1 = FillDeque(n1);
            Deque<Integer> dq2 = FillDeque(n2);
            LinkedList<Integer>sum = Summa(DequeToInt(dq1), DequeToInt(dq2));
            LinkedList<Integer>mul = Multiply(DequeToInt(dq1), DequeToInt(dq2));
            System.out.println("Сумма равна: ");
            System.out.println(sum.toString());
            System.out.println("Произведение равно: ");
            System.out.println(mul.toString());
        }
        
    }
    public static Deque<Integer> FillDeque(int n){
        Deque<Integer> dq = new ArrayDeque<>();
        if(n>=0){
            while(n>0){
                dq.addLast(n%10);
                n/=10;
            }
        }
        else{
            n*=-1;
            while(n>0){
                dq.addLast(-1*(n%10));
                n/=10;
            } 
        }
        return dq;
    }
    public static int DequeToInt(Deque<Integer> dq){
        int n = 0;
        int t = 1;
        for(int num: dq){
            n+=num*t;
            t*=10;
        }
        return n;
    }
    public static LinkedList<Integer> Summa(int n1,int n2){
        int ans = n1 + n2;
        boolean trigger = false; 
        if(ans<0){
            ans*=-1;
            trigger = true;
        }
        int lenth = 0;
        LinkedList<Integer> sumList = new LinkedList<>();
        while(ans>0){
            ans/=10;
            lenth++;
        }
        ans = n1 + n2;
        if(ans<0){
            ans*=-1;
        }

        for(int i = lenth-1; i>=0;i--){
            sumList.add(ans/(int)Math.pow(10,i));
            ans%=(int)Math.pow(10,i);
        }
        if(trigger){
            int temp = sumList.get(0) * -1;
            sumList.remove(0);
            sumList.add(0, temp);
        }
        return sumList;
    }

    public static LinkedList<Integer> Multiply (int n1,int n2){
        int ans = n1 * n2;
        boolean trigger = false;
        if(ans<0){
            ans*=-1;
            trigger = true;
        }
        int lenth = 0;
        LinkedList<Integer> sumList = new LinkedList<>();
        while(ans>0){
            ans/=10;
            lenth++;
        }
        ans = n1 * n2;
        if(ans<0){
            ans*=-1;
        }

        for(int i = lenth-1; i>=0;i--){
            sumList.add(ans/(int)Math.pow(10,i));
            ans%=(int)Math.pow(10,i);
        }
        if(trigger){
            int temp = sumList.get(0) * -1;
            sumList.remove(0);
            sumList.add(0, temp);
        }
        return sumList;
    }
}
