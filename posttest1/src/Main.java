import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<Tanaman> daftarTanaman = new ArrayList<>();
        ArrayList<Pengguna> daftarPengguna = new ArrayList<>();
        ArrayList<Catatan> daftarCatatan = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n================================");
            System.out.println("  SISTEM MANAJEMEN TOGA");
            System.out.println("================================");
            System.out.println("1. Kelola Data Tanaman");
            System.out.println("2. Kelola Data Pengguna");
            System.out.println("3. Kelola Data Catatan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                int sub;
                do {
                    System.out.println("\n--- MENU TANAMAN ---");
                    System.out.println("1. Tambah Tanaman");
                    System.out.println("2. Lihat Semua Tanaman");
                    System.out.println("3. Ubah Tanaman");
                    System.out.println("4. Hapus Tanaman");
                    System.out.println("0. Kembali");
                    System.out.print("Pilih: ");
                    sub = sc.nextInt();
                    sc.nextLine();

                    if (sub == 1) {
                        System.out.print("Nama Tanaman : ");
                        String nama = sc.nextLine();
                        System.out.print("Nama Latin   : ");
                        String namaLatin = sc.nextLine();
                        System.out.print("Manfaat      : ");
                        String manfaat = sc.nextLine();
                        daftarTanaman.add(new Tanaman(nama, namaLatin, manfaat));
                        System.out.println("Tanaman berhasil ditambahkan!");

                    } else if (sub == 2) {
                        if (daftarTanaman.isEmpty()) {
                            System.out.println("Belum ada data tanaman.");
                        } else {
                            for (int i = 0; i < daftarTanaman.size(); i++) {
                                System.out.println("\nNo. " + (i + 1));
                                daftarTanaman.get(i).tampilInfo();
                            }
                        }

                    } else if (sub == 3) {
                        if (daftarTanaman.isEmpty()) {
                            System.out.println("Belum ada data tanaman.");
                        } else {
                            for (int i = 0; i < daftarTanaman.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarTanaman.get(i).nama);
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarTanaman.size()) {
                                Tanaman t = daftarTanaman.get(no - 1);
                                System.out.print("Nama Tanaman : ");
                                t.nama = sc.nextLine();
                                System.out.print("Nama Latin   : ");
                                t.namaLatin = sc.nextLine();
                                System.out.print("Manfaat      : ");
                                t.manfaat = sc.nextLine();
                                System.out.println("Tanaman berhasil diubah!");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }

                    } else if (sub == 4) {
                        if (daftarTanaman.isEmpty()) {
                            System.out.println("Belum ada data tanaman.");
                        } else {
                            for (int i = 0; i < daftarTanaman.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarTanaman.get(i).nama);
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarTanaman.size()) {
                                String namaHapus = daftarTanaman.get(no - 1).nama;
                                daftarTanaman.remove(no - 1);
                                daftarCatatan.removeIf(c -> c.namaTanaman.equals(namaHapus));
                                System.out.println(namaHapus + " berhasil dihapus.");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }
                    }

                } while (sub != 0);

            } else if (pilihan == 2) {
                int sub;
                do {
                    System.out.println("\n--- MENU PENGGUNA ---");
                    System.out.println("1. Tambah Pengguna");
                    System.out.println("2. Lihat Semua Pengguna");
                    System.out.println("3. Ubah Pengguna");
                    System.out.println("4. Hapus Pengguna");
                    System.out.println("0. Kembali");
                    System.out.print("Pilih: ");
                    sub = sc.nextInt();
                    sc.nextLine();

                    if (sub == 1) {
                        System.out.print("Nama    : ");
                        String nama = sc.nextLine();
                        System.out.print("Alamat  : ");
                        String alamat = sc.nextLine();
                        daftarPengguna.add(new Pengguna(nama, alamat));
                        System.out.println("Pengguna berhasil ditambahkan!");

                    } else if (sub == 2) {
                        if (daftarPengguna.isEmpty()) {
                            System.out.println("Belum ada data pengguna.");
                        } else {
                            for (int i = 0; i < daftarPengguna.size(); i++) {
                                System.out.println("\nNo. " + (i + 1));
                                daftarPengguna.get(i).tampilInfo();
                            }
                        }

                    } else if (sub == 3) {
                        if (daftarPengguna.isEmpty()) {
                            System.out.println("Belum ada data pengguna.");
                        } else {
                            for (int i = 0; i < daftarPengguna.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarPengguna.get(i).nama);
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarPengguna.size()) {
                                Pengguna p = daftarPengguna.get(no - 1);
                                System.out.print("Nama    : ");
                                p.nama = sc.nextLine();
                                System.out.print("Alamat  : ");
                                p.alamat = sc.nextLine();
                                System.out.println("Pengguna berhasil diubah!");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }

                    } else if (sub == 4) {
                        if (daftarPengguna.isEmpty()) {
                            System.out.println("Belum ada data pengguna.");
                        } else {
                            for (int i = 0; i < daftarPengguna.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarPengguna.get(i).nama);
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarPengguna.size()) {
                                String namaHapus = daftarPengguna.get(no - 1).nama;
                                daftarPengguna.remove(no - 1);
                                daftarCatatan.removeIf(c -> c.namaPengguna.equals(namaHapus));
                                System.out.println(namaHapus + " berhasil dihapus.");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }
                    }

                } while (sub != 0);

            } else if (pilihan == 3) {
                int sub;
                do {
                    System.out.println("\n--- MENU CATATAN ---");
                    System.out.println("1. Tambah Catatan");
                    System.out.println("2. Lihat Semua Catatan");
                    System.out.println("3. Ubah Catatan");
                    System.out.println("4. Hapus Catatan");
                    System.out.println("0. Kembali");
                    System.out.print("Pilih: ");
                    sub = sc.nextInt();
                    sc.nextLine();

                    if (sub == 1) {
                        if (daftarPengguna.isEmpty() || daftarTanaman.isEmpty()) {
                            System.out.println("Pastikan data pengguna dan tanaman sudah ada terlebih dahulu ya!.");
                        } else {
                            System.out.println("Pilih Pengguna:");
                            for (int i = 0; i < daftarPengguna.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarPengguna.get(i).nama);
                            }
                            System.out.print("Pilih nomor: ");
                            int noPengguna = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Pilih Tanaman:");
                            for (int i = 0; i < daftarTanaman.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarTanaman.get(i).nama);
                            }
                            System.out.print("Pilih nomor: ");
                            int noTanaman = sc.nextInt();
                            sc.nextLine();

                            if (noPengguna >= 1 && noPengguna <= daftarPengguna.size() &&
                                    noTanaman >= 1 && noTanaman <= daftarTanaman.size()) {
                                String namaPengguna = daftarPengguna.get(noPengguna - 1).nama;
                                String namaTanaman = daftarTanaman.get(noTanaman - 1).nama;
                                System.out.print("Keterangan   : ");
                                String keterangan = sc.nextLine();
                                daftarCatatan.add(new Catatan(namaPengguna, namaTanaman, keterangan));
                                System.out.println("Catatan berhasil ditambahkan!");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }

                    } else if (sub == 2) {
                        if (daftarCatatan.isEmpty()) {
                            System.out.println("Belum ada data catatan.");
                        } else {
                            for (int i = 0; i < daftarCatatan.size(); i++) {
                                System.out.println("\nNo. " + (i + 1));
                                daftarCatatan.get(i).tampilInfo();
                            }
                        }

                    } else if (sub == 3) {
                        if (daftarCatatan.isEmpty()) {
                            System.out.println("Belum ada data catatan.");
                        } else {
                            for (int i = 0; i < daftarCatatan.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarCatatan.get(i).namaPengguna + " - " + daftarCatatan.get(i).namaTanaman);
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarCatatan.size()) {
                                Catatan c = daftarCatatan.get(no - 1);
                                System.out.print("Keterangan baru : ");
                                c.keterangan = sc.nextLine();
                                System.out.println("Catatan berhasil diubah!");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }

                    } else if (sub == 4) {
                        if (daftarCatatan.isEmpty()) {
                            System.out.println("Belum ada data catatan.");
                        } else {
                            for (int i = 0; i < daftarCatatan.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarCatatan.get(i).namaPengguna + " - " + daftarCatatan.get(i).namaTanaman);
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarCatatan.size()) {
                                System.out.println("Catatan berhasil dihapus.");
                                daftarCatatan.remove(no - 1);
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }
                    }

                } while (sub != 0);
            }

        } while (pilihan != 0);

        System.out.println("Program selesai. Terimakasih!");
        sc.close();
    }
}