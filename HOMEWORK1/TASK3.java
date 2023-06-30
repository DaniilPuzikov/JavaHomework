package HOMEWORK1;

import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        try {
            double a = scnr.nextDouble();
            char op = scnr.next().charAt(0);
            double b = scnr.nextDouble();
            Calk(a, b, op);  
        } catch (Exception e) {
            System.out.println("incorrect input");
        }
        
    }

    static void Calk(double a, double b, char op){
        if (op == '+'){
            System.out.println(a+b);
        }
        else{
            if (op == '-'){
                System.out.println(a-b);
            }
            else{
                if (op == '*'){
                    System.out.println(a*b);
                }
                else{
                    if (op == '/'){
                        System.out.println(a/b);
                    }
                    else{
                        if (op == '^'){
                            System.out.println(Math.pow(a, b));
                        }
                        else{
                            System.out.println("incorrect operation");
                        }
                    }
                    
                }
            }
        }

    }
}
