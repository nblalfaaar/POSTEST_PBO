class Catatan {
    String namaPengguna;
    String namaTanaman;
    String keterangan;

    Catatan(String namaPengguna, String namaTanaman, String keterangan) {
        this.namaPengguna = namaPengguna;
        this.namaTanaman = namaTanaman;
        this.keterangan = keterangan;
    }

    void tampilInfo() {
        System.out.println("Pengguna    : " + this.namaPengguna);
        System.out.println("Tanaman     : " + this.namaTanaman);
        System.out.println("Keterangan  : " + this.keterangan);
    }
}