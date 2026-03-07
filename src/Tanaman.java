public class Tanaman {
    String nama;
    String namaLatin;

    Tanaman() {
        this.nama = "-";
        this.namaLatin = "-";
    }

    Tanaman(String nama, String namaLatin) {
        this.nama = nama;
        this.namaLatin = namaLatin;
    }

    void tampilInfo() {
        System.out.println("Nama       : " + this.nama);
        System.out.println("Nama Latin : " + this.namaLatin);
    }

}
