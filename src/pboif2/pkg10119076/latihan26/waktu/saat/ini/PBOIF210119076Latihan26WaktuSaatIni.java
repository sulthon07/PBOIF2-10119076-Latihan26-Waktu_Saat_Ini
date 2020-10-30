/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan26.waktu.saat.ini;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 */
import java.util.Date;  
import java.text.SimpleDateFormat;
public class PBOIF210119076Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date tanggal = new Date();
        
        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        System.out.println("Hari ini :"+ format.format(tanggal));
        
        System.out.println("_________________________________");
        System.out.println("Developed by Sulthon Naufal Akmal");
    }
}
    

