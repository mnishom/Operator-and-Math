package operator;

/**
 *
 * @author nishom
 */
public class Methods {
    
    public static double aritmatika_pemula(int pilihan, double operand1, 
            double operand2){
        switch (pilihan) {
            case Konstanta.TAMBAH:
                return operand1 + operand2;
            case Konstanta.KURANG:
                return operand1 - operand2;
            case Konstanta.BAGI:
                return operand1 / operand2;
            case Konstanta.KALI:
                return operand1 * operand2;
            default:
                break;
        }
        return 0;
    }
    
    public static double aritmatika_medium(int pilihan, double... operand){
        double hasil = operand[0];
        for (int i = 1; i < operand.length; i++) {
            double opr = operand[i];
            switch (pilihan) {
                case Konstanta.TAMBAH:
                    hasil += opr;
                    break;
                case Konstanta.KALI:
                    hasil *= opr;
                    break;
                case Konstanta.BAGI:
                    hasil /= opr;
                    break;
                case Konstanta.KURANG:
                    hasil -= opr;
                    break;
                default:
                    break;
            }
        }
        return hasil;
    }    
}
