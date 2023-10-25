/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ti_regpagi.pkg22205043.latihan21.programrataratanilai;

/*
 *  Nama      : Danish Fadlan Azam
 *  NIM       : 22205043
 *  Prodi     : Teknik Informatika
 *  Deskripsi : program ini untuk menghitung rata-rata nilai mahasiswa dari jumlah banyaknya mahasiswa
 */

import java.util.Scanner;

public class TI_RegPagi22205043Latihan21ProgramRataRataNilai {
    
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        int jumlahMahasiswa = inputan.nextInt();
        
        int totalNilai = 0;
        for(int i=1; i<=jumlahMahasiswa; i++){
            System.out.print("Nilai mahasiswa ke-" +i+ " : ");
            int nilai = inputan.nextInt();   
            
            if(nilai < 1 || nilai > 100){
                System.out.println("Masukan nilai dengan benar (1-100)");
                i--;
                continue;
            }
            totalNilai += nilai;
        }
        
        double rataRata = (double) totalNilai / jumlahMahasiswa;
        
        System.out.println("\nMaka rata-rata nilainya adalah " +rataRata);                
        System.out.println("Developed by : Danish Fadlan Azam");    
        
    }
    
}


