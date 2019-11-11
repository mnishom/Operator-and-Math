package kuis;
import java.util.Scanner;
public class RumusPitagoras {
    static double pitagoras(double a, double b){
        double nilaia = Math.pow(a, 2);
        double nilaib = Math.pow(b, 2);
        return Math.sqrt(nilaia+nilaib);
    }    
    public static void main(String[] args) {
        double v1, v2, hasil;
        Scanner a = new Scanner(System.in);
        v1 = a.nextDouble();
        Scanner b = new Scanner(System.in);
        v2 = b.nextDouble();
        hasil = pitagoras(v1, v2);
        System.out.println(""+hasil);
    }
}
