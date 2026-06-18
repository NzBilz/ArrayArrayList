package bagian3.perpustakaan;

public class Buku {
    // Atribut
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; // Tambahan Soal 2
    
    // Constructor yang diperbarui (Tambahan Soal 2)
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit; // Tambahan Soal 2
        this.dipinjam = false; 
    }
    
    // Getter
    public String getJudul() {
        return judul;
    }
    
    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() { // Tambahan Soal 2
        return tahunTerbit;
    }
    
    public boolean isDipinjam() {
        return dipinjam;
    }
    
    // Setter status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }
    
    // Mengembalikan keterangan buku dengan format tahun terbit (Tambahan Soal 2)
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " (" + tahunTerbit + ") oleh " + penulis + " [" + status + "]";
    }
}