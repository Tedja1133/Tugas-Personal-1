class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    private double ipk;

    // Constructor
    Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter
    public double getIpk() {
        return ipk;
    }

    // Setter
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method menampilkan info mahasiswa
    void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
    }

    // Method cek kelulusan
    void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status  : Lulus");
        } else {
            System.out.println("Status  : Belum Lulus");
        }
    }

    // Method menentukan predikat akademik
    void hitungPredikat() {
        String predikat;

        if (ipk >= 3.75) {
            predikat = "Dengan Pujian";
        } else if (ipk >= 3.50) {
            predikat = "Sangat Memuaskan";
        } else if (ipk >= 3.00) {
            predikat = "Memuaskan";
        } else {
            predikat = "Perlu Perbaikan";
        }

        System.out.println("Predikat: " + predikat);
        System.out.println("--------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("Faizal", "220101", "Informatika", 3.8);

        m1.tampilkanInfo();
        m1.cekKelulusan();
        m1.hitungPredikat();
    }
}
