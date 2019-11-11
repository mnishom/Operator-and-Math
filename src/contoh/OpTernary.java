package contoh;

public class OpTernary {
    static String get_data(String select, String where){
        String data = where.isEmpty() ? select : select+where;
        return data;
    }
    
    public static void main(String[] args) {
        String data = "L";
        String jk;
        if("L".equals(data)){
            jk = "Laki-Laki";
        }else {
            jk = "Perempuan";
        }
        
        String jk2 = "L".equals(data) ? "Laki-Laki" : "Perempuan";
        
        
        String sel = "SELECT * FROM dosen ";
        String where = "";
        String query = get_data(sel, where);
        System.out.println("=> "+query);
        where = "WHERE nama LIKE '%M%'";
        query = get_data(sel, where);
        System.out.println("=> "+query);
        
        int nilai = 1;
        nilai += 1; // nilai = nilai + 1;
        System.out.println(nilai);
        
        String nilai2 = "Urutan ";
        nilai2 += "ke-2"; // nilai2 = nilai2 + "ke-2";
        System.out.println(nilai2);
    }
}
