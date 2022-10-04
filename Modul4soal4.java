/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4soal4;

import javax.swing.JOptionPane;
import java.io.*;
import static java.time.Clock.system;

public class Modul4soal4 {

    public static void main(String[] args) {
//        BufferedReader dataMasuk = new BufferedReader(new InputStreamReader(System.in));
//        int angka = 0;
//            System.out.print("Angka = ");
//        try {
//            angka = Integer.parseInt(dataMasuk.readLine());
//        } catch (Exception e) {
//            System.out.println("Error!");
//        }
//        if (angka % 2 == 0) {
//            System.out.println(angka +" = Genap");
//        } else {
//            System.out.println(angka 4 = Ganjil

        int angka2 = 0;
        angka2 = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Your Number ="));
        if (angka2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Genap");
        } else {
            JOptionPane.showMessageDialog(null, " Ganjil");

        }
    }

}
