package contoh;

public class NewMain {

    static double sum(double... angka){
        double jumlah = angka[0];
        for (int i = 1; i < angka.length; i++) {
            jumlah += angka[i];
        }
        return jumlah;
    }
    
    public static void main(String[] args) {
        double nilai = sum(1,5,6,4,9,0,3,4,5,6,7);
        System.out.println(""+nilai);
        
        
        double hasil = Math.sqrt(27);
        System.out.println(""+hasil);
        hasil = Math.cbrt(27);
        System.out.println(""+hasil);
    }
    
}
