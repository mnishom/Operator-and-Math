/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

/**
 *
 * @author nishom
 */
public class Logika {

    public static void main(String[] args) {
        boolean b1 = true && 1 > 3;
        boolean b2 = 1 < 9 & false;
        boolean b3 = true || 1 > 3;
        boolean b4 = 1 < 9 & false;
        boolean b5 = !b4;
        String b6 = 1 > 3 ? "OK": "default";
        System.out.println("b1 :"+b1);
        System.out.println("b2 :"+b2);
        System.out.println("b3 :"+b3);
        System.out.println("b4 :"+b4);
        System.out.println("b5 :"+b5);
        System.out.println("b6 :"+b6);
    }
}
