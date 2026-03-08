class Tanaman {
    String nama;
    String namaLatin;
    String manfaat;

    Tanaman(String nama, String namaLatin, String manfaat) {
        this.nama = nama;
        this.namaLatin = namaLatin;
        this.manfaat = manfaat;
    }

    void tampilInfo() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("Nama Latin  : " + this.namaLatin);
        System.out.println("Manfaat     : " + this.manfaat);
    }
}