package kuis;

public class Kuis1 {

    static double pitagoras(double a, double b){
        double c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) );
        return c;
    }

    public static void main(String[] args) {
        double a = 3.2;
        double b = 4.5;

        // menggunakan atau pemanggilan method pitagoras
        double c = pitagoras(a, b);
        System.out.println("c = " + c);
    }    
}
