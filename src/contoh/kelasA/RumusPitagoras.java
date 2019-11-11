package contoh.kelasA;

import java.util.Scanner;

public class RumusPitagoras {

    static double pitagoras(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }        
    public static void main(String[] args) {
        double v1, v2, hasil;
        System.out.print("Nilai a: ");
        Scanner a = new Scanner(System.in);
        v1 = a.nextDouble();
        System.out.print("Nilai b: ");
        Scanner b = new Scanner(System.in);
        v2 = b.nextDouble();
        hasil = pitagoras(v1, v2);
        System.out.println(""+hasil);
    }    
}
