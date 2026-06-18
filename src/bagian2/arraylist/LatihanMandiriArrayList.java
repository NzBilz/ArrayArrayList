/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

    import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        
        // --- SOAL 1: ArrayList Daftar Belanja ---
        System.out.println("=== SOAL 1: Daftar Belanja ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Menambah 4 item
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula Pasir");
        daftarBelanja.add("Telur");
        
        // Menghapus item ke-2 (indeks ke-1 karena indeks ArrayList dimulai dari 0)
        // Item yang dihapus adalah "Beras"
        daftarBelanja.remove(1);
        
        // Menampilkan isi list dan jumlah akhirnya
        System.out.println("Isi daftar belanja setelah dihapus: " + daftarBelanja);
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
        System.out.println(); // Baris baru untuk jarak


        // --- SOAL 2: Mencari Nilai Terbesar di ArrayList ---
        System.out.println("=== SOAL 2: Nilai Terbesar ===");
        ArrayList<Integer> angka = new ArrayList<>();
        
        // Mengisi 5 angka ke dalam ArrayList
        angka.add(24);
        angka.add(87);
        angka.add(12);
        angka.add(55);
        angka.add(68);
        
        // Menelusuri elemen untuk mencari nilai terbesar
        int terbesar = angka.get(0); // Inisialisasi awal dengan elemen pertama
        for (int num : angka) {
            if (num > terbesar) {
                terbesar = num;
            }
        }
        System.out.println("Isi angka: " + angka);
        System.out.println("Nilai terbesar adalah: " + terbesar);
        System.out.println();


        // --- SOAL 3: Filter Nama Diawali Huruf 'A' ---
        System.out.println("=== SOAL 3: Filter Nama Awalan 'A' ===");
        ArrayList<String> daftarNama = new ArrayList<>();
        
        // Menambah 6 nama ke dalam ArrayList
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Anisa");
        daftarNama.add("Nabil");
        daftarNama.add("Arlott");
        daftarNama.add("Syafa");
        
        System.out.println("Nama yang diawali dengan huruf 'A':");
        // Melakukan perulangan dan pengecekan menggunakan startsWith
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}