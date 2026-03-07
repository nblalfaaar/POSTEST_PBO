import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static void main(String[] args) {
        ArrayList<Tanaman> daftarTanaman = new ArrayList<>();
        ArrayList<Manfaat> daftarManfaat = new ArrayList<>();
        ArrayList<Resep> daftarResep = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n================================");
            System.out.println("  SISTEM MANAJEMEN TOGA");
            System.out.println("================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Semua Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("0. Keluar");
            System.out.println("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.println("Nama Tanaman   : ");
                String nama = sc.nextLine();
                System.out.println("Nama Latin     : ");
                String namaLatin = sc.nextLine();
                System.out.println("Penyakit       : ");
                String penyakit = sc.nextLine();
                System.out.println("Bagian Tanaman : ");
                String bagian = sc.nextLine();
                System.out.println("Bahan          : ");
                String bahan = sc.nextLine();
                System.out.println("Cara Buat      : ");
                String caraBuat = sc.nextLine();

                daftarTanaman.add(new Tanaman(nama, namaLatin));
                daftarManfaat.add(new Manfaat(penyakit, bagian));
                daftarResep.add(new Resep(bahan, caraBuat));
                System.out.println("Data berhasil ditambahkan!");

            } else if (pilihan == 2) {
                if (daftarTanaman.isEmpty()) {
                    System.out.println("Belum ada data.");
                } else {
                    for (int i = 0; i < daftarTanaman.size(); i++) {
                        System.out.println("\nNo. " + (i + 1));
                        daftarTanaman.get(i).tampilInfo();
                        daftarManfaat.get(i).tampilInfo();
                        daftarResep.get(i).tampilInfo();
                    }
                }
            } else if (pilihan == 3) {
                if (daftarTanaman.isEmpty()) {
                    System.out.println("Belum ada data.");
                } else {
                    for (int i = 0; i < daftarTanaman.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarTanaman.get(i).nama);
                    }
                    System.out.println("Pilih nomor: ");
                    int no = sc.nextInt();
                    sc.nextLine();

                    if (no >= 1 && no <= daftarTanaman.size()) {
                        Tanaman t = daftarTanaman.get(no - 1);
                        Manfaat m = daftarManfaat.get(no - 1);
                        Resep r = daftarResep.get(no - 1);

                        System.out.println("Nama Tanaman   : ");
                        t.nama = sc.nextLine();
                        System.out.println("Nama Latin     : ");
                        t.namaLatin = sc.nextLine();
                        System.out.println("Penyakit       : ");
                        m.penyakit = sc.nextLine();
                        System.out.println("Bagian Tanaman : ");
                        m.bagianTanaman = sc.nextLine();
                        System.out.println("Bahan          : ");
                        r.bahan = sc.nextLine();
                        System.out.println("Cara Buat      : ");
                        r.caraBuat = sc.nextLine();
                        System.out.println("Data berhasil diubah!");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                }

            } else if (pilihan == 4) {
                if (daftarTanaman.isEmpty()) {
                    System.out.println("Belum ada data.");
                } else {
                    for (int i = 0; i < daftarTanaman.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarTanaman.get(i).nama);
                    }
                    System.out.println("Pilih nomor: ");
                    int no = sc.nextInt();
                    sc.nextLine();

                    if (no >= 1 && no <= daftarTanaman.size()) {
                        System.out.println(daftarTanaman.get(no - 1).nama + " berhasil dihapus!");
                        daftarTanaman.remove(no - 1);
                        daftarManfaat.remove(no - 1);
                        daftarResep.remove(no - 1);
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                }
            }
        } while (pilihan != 0);

        System.out.println("Program selesai. Terima kasih!");
        sc.close();
    }
}