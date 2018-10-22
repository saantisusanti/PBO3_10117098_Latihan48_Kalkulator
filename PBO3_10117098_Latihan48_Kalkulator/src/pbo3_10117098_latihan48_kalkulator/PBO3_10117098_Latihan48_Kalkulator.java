/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan48_kalkulator;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Menghitung operasi kali bagi tambah kurang dengan nilai 
 *                     yang telah ditentukan
 */
public class PBO3_10117098_Latihan48_Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalku = new Kalkulator();
        kalku.setValue1(7);
        kalku.setValue2(5);

        System.out.println("VALUE 1 = "+kalku.getValue1());
        System.out.println("VALUE 2 = "+kalku.getValue2());
        kalku.setNameProject();
        kalku.setNoteProject("This project shown you how to manage method"
                + " in java");
        System.out.println("Result Add is = "+kalku.add(kalku.getValue1(),
                kalku.getValue2()));
        System.out.println("Result Minus is = "+kalku.minus(kalku.getValue1(),
                kalku.getValue2()));
        System.out.println("Result Multiplication is = "+kalku.multiplication
        (kalku.getValue1(),kalku.getValue2()));
        System.out.println("Result Division is = "+kalku.division
        (kalku.getValue1(),kalku.getValue2()));
    }
    
}
