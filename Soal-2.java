class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    private double ipk;

    Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
    }

    void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status  : Lulus");
        } else {
            System.out.println("Status  : Belum Lulus");
        }
        System.out.println("--------------------------");
    }

    void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }
}

public class Main {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("Faizal", "220101", "Informatika", 2.8);

        System.out.println("Data Mahasiswa Awal");
        m1.tampilkanInfo();
        m1.cekKelulusan();

        // Update IPK tanpa input
        m1.updateIpk(3.4);

        System.out.println("Data Mahasiswa Setelah Update");
        m1.tampilkanInfo();
        m1.cekKelulusan();
    }
}
