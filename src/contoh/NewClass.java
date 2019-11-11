package contoh;

public class NewClass {

    public static void main(String[] args) {
        int n = 1;
        int x = 12;

        if (n == 0 && n < x) { //false && true
            //
        }

        if (n == 0 & n < x) { //false && true
            //
        }

        if (n >= 0 || n < x) { //true || true
            //
        }

        if (n >= 0 | n < x) { //true | true
            //
        }

        String nama = "Rina Listiana";
        System.out.println(nama.charAt(3));
        if (nama.charAt(3) == 'a'
                && nama.charAt(7) == 's') {
            System.out.println("Satu");
        } else {
            System.out.println("Dua");
        }

        boolean b = 1 < 1; //false
        boolean c = !b;//not false = true
        System.out.println(c);

        if ( (c && !b) || (1 > 0 || 2 >= 2)) {
            System.out.println("Tiga");
        } else {
            System.out.println("Empat");
        }
        
        String jk = "Laki-Laki";
        String name1;
        if("Laki-Laki".equals(jk)){
            name1 = "Laki-Laki";
        }else {
            name1 = "Perempuan";
        }
        
        // ?:
        String name = "Laki-Laki".equals(jk) ? "Laki-Laki" : "Perempuan";
        
        
        //penugasan
        int nilai = 12;
        nilai += 12;
        ++nilai;
        System.out.println(nilai);
        
        int y = 3;
        while ( y > 0) {            
            System.out.println(y);
            y--;
        }
        
        int nilai2 = 2;
        nilai2 -= 1;
        System.out.println(nilai2);
        
        int nilai3 = -1;
        int nilai4 = Math.abs(nilai3);
        double nilai5 = Math.pow(10, 13);
        System.out.println(nilai4);
        System.out.println((long)nilai5);
    }
}
