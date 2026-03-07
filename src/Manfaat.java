public class Manfaat {
    String penyakit;
    String bagianTanaman;

    Manfaat() {
        this.penyakit = "-";
        this.bagianTanaman = "-";
    }

    Manfaat(String penyakit, String bagianTanaman) {
        this.penyakit = penyakit;
        this.bagianTanaman = bagianTanaman;
    }

    void tampilInfo() {
        System.out.println("Penyakit       : " + this.penyakit);
        System.out.println("Bagian Tanaman : " + this.bagianTanaman);
    }
}
