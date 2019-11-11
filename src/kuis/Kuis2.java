package kuis;

import java.util.Scanner;

public class Kuis2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ketik nilai a: "); //1
        double a = input.nextDouble();
        System.out.print("Ketik nilai b: "); //5
        double b = input.nextDouble();
        System.out.print("Ketik nilai c: "); //1
        double c = input.nextDouble();

        double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("Akarnya adalah " + r1 + " dan " + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("Akarnya adalah " + r1);
        } else {
            System.out.println("Persamaannya tidak memiliki akar yang benar.");
        }
    }    
}
