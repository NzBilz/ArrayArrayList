package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan daftar mahasiswa menggunakan ArrayList (Soal 2)
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method menambah mahasiswa
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method hitung rata-rata nilai kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int hitung = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                hitung++;
            }
        }
        return hitung;
    }

    // Method menampilkan seluruh data mahasiswa beserta status kelulusan
    public void tampilkanSemua() {
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %-12s %-8s %-10s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("-------------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-15s %-12s %-8.1f %-10s\n", mhs.getNpm(), mhs.getNama(), mhs.getNilai(), status);
        }
        System.out.println("-------------------------------------------------");
    }

    // Method pembantu untuk mengambil total ukuran data terbaru (Soal 6)
    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}