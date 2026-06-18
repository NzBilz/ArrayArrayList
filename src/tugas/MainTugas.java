package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // --- SOAL 4: Array String nama mata kuliah (ukuran tetap) ---
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // --- SOAL 3 & 5: Membuat Objek KelasKuliah & Menambah Minimal 5 Mahasiswa ---
        KelasKuliah kelas = new KelasKuliah();
        
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "230101001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "230101002", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "230101003", 72.3));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi", "230101004", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "230101005", 90.0));

        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();
        
        // Menampilkan rata-rata dan jumlah kelulusan
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println("Total Data Awal       : " + kelas.getJumlahMahasiswa() + " mahasiswa");
        System.out.println();

        // --- SOAL 6: Menambahkan 1 Mahasiswa Baru & Cetak Jumlah Terbaru ---
        System.out.println("=== PENAMBAHAN DATA BARU ===");
        Mahasiswa mhsBaru = new Mahasiswa("Fahmi", "230101006", 65.5);
        kelas.tambahMahasiswa(mhsBaru);
        System.out.println("Mahasiswa baru bernama " + mhsBaru.getNama() + " berhasil ditambahkan.");
        
        System.out.println("\n=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
        System.out.println("Jumlah Data Terbaru   : " + kelas.getJumlahMahasiswa() + " mahasiswa");
        System.out.printf("Rata-rata Nilai Baru  : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Lulus Terbaru  : " + kelas.jumlahLulus());
    }
}