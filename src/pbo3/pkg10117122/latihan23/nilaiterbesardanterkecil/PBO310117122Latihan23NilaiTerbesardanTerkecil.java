/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class PBO310117122Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     * 
     * NAMA  : BONAVENTURA ALDINO SENDA SENI
     * KELAS : PBO-3
     * NIM   : 10117122
     * Deskripsi Program : User memasukan banyaknya nilai yang yang akan 
     *                     ditampilkan, menampilkan urutan nilai, mencari nilai
     *                     terbesar dan terkecil lalu ditampilkan.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("========Program Nilai Terbesar dan Terkecil "
                + "Nilai Mahasiswa========");
        Scanner scan = new Scanner(System.in);
          
        System.out.print("Masukkan Nama Petugas = ");
          String namaPetugas = scan.next();
  
          System.out.print("Masukkan Banyaknya Nilai Mahasiswa = ");
          int n = scan.nextInt();
          
          int[] data = new int [n];
          int i, terbesar, terkecil;
          
          for (i = 0; i < n; i++){
              System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " = ");
              data[i] = scan.nextInt();    
          }
          
          System.out.println();
          System.out.println("=========Hasil Nilai Mahasiswa========");
          for (i = 0; i < n; i++){
              System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = "+data[i]);
          }
          
          System.out.println();
          terbesar = data[0];
          for (i = 0; i < n; i++){
              if (data[i] > terbesar)
                  terbesar = data[i];
              else
                  terbesar = terbesar;
          }
          System.out.println("Nilai Terbesar adalah " + terbesar);
          terkecil = data[0];
          for (i = 0; i < n; i++){
              if (data[i] < terkecil)
                  terkecil = data[i];
              else
                  terkecil = terkecil;
          }
          System.out.println("Nilai Terkecil adalah " + terkecil);
          System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
    }  
}
