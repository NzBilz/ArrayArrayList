/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author USER
 */
public class LatihanMandiriArray {
    public static void main(String[] args) {
        
        // --- SOAL 1: Mencari Suhu Tertinggi dan Terendah ---
        System.out.println("=== SOAL 1: Analisis Suhu ===");
        double[] suhuHarian = {32.5, 28.0, 30.2, 34.1, 27.5, 31.8};
        
        double tertinggi = suhuHarian[0];
        double terendah = suhuHarian[0];
        
        for (double suhu : suhuHarian) {
            if (suhu > tertinggi) {
                tertinggi = suhu;
            }
            if (suhu < terendah) {
                terendah = suhu;
            }
        }
        System.out.println("Suhu Tertinggi : " + tertinggi + "°C");
        System.out.println("Suhu Terendah  : " + terendah + "°C");
        System.out.println(); // Baris baru untuk jarak


        // --- SOAL 2: Filter Nama Hari (> 5 Huruf) ---
        System.out.println("=== SOAL 2: Filter Nama Hari ===");
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("Hari dengan lebih dari 5 huruf:");
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println("- " + hari);
            }
        }
        System.out.println();


        // --- SOAL 3: Menghitung Banyak Angka Genap ---
        System.out.println("=== SOAL 3: Hitung Angka Genap ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int hitungGenap = 0;
        
        for (int num : angka) {
            if (num % 2 == 0) {
                hitungGenap++;
            }
        }
        System.out.println("Banyak angka genap di dalam array: " + hitungGenap);
    }
}
