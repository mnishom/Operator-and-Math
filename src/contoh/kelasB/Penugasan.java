package contoh.kelasB;

public class Penugasan {
    static double sum(double... nilai){
        double d = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            d += nilai[i];
        }
        return d;
    }    
    public static void main(String[] args) {
        double jumlah = sum(1,2,3,4,5,6,7,78.9,90.9,98);
        System.out.println(""+jumlah); 
    }
}
