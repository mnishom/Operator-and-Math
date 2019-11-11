package contoh.kelasC;

public class Ternary {
    public static void main(String[] args) {
        String jk;
        String pilihan = "L";
        
        if(pilihan.equals("L")){
            jk = "Laki-Laki";
        }else{
            jk = "Perempuan";
        }
        
        String jk2 = pilihan.equals("L") ? "Laki-Laki":"Perempuan";
        System.out.println("=>"+(116&9));
    }
}
