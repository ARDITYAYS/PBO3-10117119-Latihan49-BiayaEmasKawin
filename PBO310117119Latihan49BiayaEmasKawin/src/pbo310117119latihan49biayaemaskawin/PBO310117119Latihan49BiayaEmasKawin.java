/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan49biayaemaskawin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S
 * NIM : 10117119
 * Kelas : PBO 3
 * Deskripsi Program : Program ini dapat menampilkan biaya emas kawin
 */
public class PBO310117119Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DecimalFormat mataUangIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();

        formatRP.setCurrencySymbol("Rp.");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');

        mataUangIndonesia.setDecimalFormatSymbols(formatRP);

        EmasKawin objEmas = new EmasKawin();
        objEmas.setHargaGram(570000);
        objEmas.setBeratEmas(15.7);
        System.out.println("====Aplikasi Hitung Harga Emas====");
        System.out.printf("Total Bayar Emas : %s %n ",
                mataUangIndonesia.format(
                        objEmas.perhitungan(objEmas.getHargaGram(),
                                objEmas.getBeratEmas())));

    }

}
