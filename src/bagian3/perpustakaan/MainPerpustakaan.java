package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        
        // Menambahkan buku beserta tahun terbitnya (Soal 2)
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya", 1981));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        
        // Tampilkan Koleksi Awal
        perpus.tampilkanKoleksi();
        System.out.println();
        
        // Simulasi Pinjam Buku
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        // UJI SOAL 1: Mengembalikan Buku
        System.out.println("--- Pengujian Mengembalikan Buku ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        // UJI SOAL 3: Mencari Penulis
        System.out.println("--- Pengujian Mencari Penulis ---");
        perpus.cariPenulis("Pramoedya");
    }
}