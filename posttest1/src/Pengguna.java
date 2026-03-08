class Pengguna {
    String nama;
    String alamat;

    Pengguna(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    void tampilInfo() {
        System.out.println("Nama    : " + this.nama);
        System.out.println("Alamat  : " + this.alamat);
    }
}