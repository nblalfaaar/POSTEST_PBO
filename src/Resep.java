public class Resep {
    String bahan;
    String caraBuat;

    Resep(String bahan, String caraBuat) {
        this.bahan = bahan;
        this.caraBuat = caraBuat;
    }

    void tampilInfo() {
        System.out.println("Bahan     : " + this.bahan);
        System.out.println("Cara Buat : " + this.caraBuat);
    }
}
