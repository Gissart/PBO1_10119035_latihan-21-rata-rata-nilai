package com.tugasPBO;
import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = menghitung rata-rata nilai mahasiswa
public class rataRata {
    public static void main(String[] args){
        int nilai[];
        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("masukkan nama petugas : ");
        String dev = scan.next();
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = scan.nextInt();
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Nilai mahasiswa ke-"+(i + 1)+" :");
            nilai[i] = scan.nextInt();
            total += nilai[i];
        }
        System.out.println("maka rata-rata nilainya adalah : "+ avg(total,jumlah));
        System.out.print("Developed by " + dev);
    }

    public static double avg(double total, double jumlah){
        double rata = total/jumlah;
        return rata;
    }
}
