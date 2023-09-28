/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan30;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Format Tugas PBO");
       String merah = "\u001B[31m";
        String hijau = "\u001B[32m";
        String kuning = "\u001B[33m";
        String biru = "\u001B[34m";
        String tosca = "\u001B[36m";

        String resetWarna = "\u001B[0m";

        System.out.print("Kamu" + merah + " ngerjain" + hijau + " sendiri" + kuning + " latihan" + biru + " 17" + resetWarna);
        System.out.print(kuning + " sampai" + biru + " latihan" + biru + " 30" + resetWarna);
        System.out.println(biru + " ini" + resetWarna + " ?");
        
        System.out.print("Jawab" + biru + " (Yoi/Enggak)" + merah + " : " + resetWarna);
        String jawaban = "Yoi"; // Ganti dengan jawaban sesuai keinginan

        System.out.println(jawaban + merah + "\nCakep" + merah + " Bener" + merah + " sih." + merah);
        System.out.println("Sing" + tosca + " penting" + tosca + " paham" + tosca + " konsepnya" + tosca + " yee." + tosca);
        System.out.println("keep the code works dude");

        // Reset warna setelah digunakan
        System.out.print(resetWarna);
        System.out.println("\nDeveloped by: Salsa Nurul Laeli");
    }
    
}
