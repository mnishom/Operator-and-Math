package contoh;

public class OperatorEx1 {
    public static void main(String[] args) {
        boolean a = 10>10; //false
        boolean b = 10<=10;//true
        
        if(a && b){ //false && true
            System.out.println("1");
        }else{
            System.out.println("2"); //yang dicetak
        }
        
        if(a & b){ //false && true
            System.out.println("1");
        }else{
            System.out.println("2"); //yang dicetak
        }
        
        if(b || a){ //true || false
            System.out.println("1");//yang dicetak
        }else{
            System.out.println("2"); 
        }
        
        if(b | a){ //true | false
            System.out.println("1");//yang dicetak
        }else{
            System.out.println("2"); 
        }
        
        boolean c = 10>10; //false
        boolean d = 10<=10;//true
        if(!d && c){
            System.out.println("3");
        }else{
            System.out.println("4");
        }
        
        String name;
        if(1>0){
            name = "Tegar";
        }else{
            name = "Eli";
        }
        
        String name2 = 1>0 ? "Tegar" : "Eli";
        
        double d1 = 12;
        double d2 = 13;
        double d3 = Math.max(d1, d2);
        System.out.println(d3);
        
        double d4 = -123;
        double d5 = Math.abs(d4);
        
        //power
        long d6 = (long) Math.pow(10, 23);
        System.out.println(d6);
        
        int n = 3;
        double p = Math.pow(3, n);
        double hasil = Math.sqrt(p);
        
        
    }
}
