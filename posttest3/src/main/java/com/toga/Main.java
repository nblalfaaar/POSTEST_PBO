package com.toga;

import com.toga.model.Tanaman;
import com.toga.model.TanamanRempah;
import com.toga.model.TanamanDaun;
import com.toga.model.TanamanBuah;
import com.toga.model.Pengguna;
import com.toga.model.Catatan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
                        System.out.println("Pilih jenis tanaman:");
                        System.out.println("1. Tanaman Rempah");
                        System.out.println("2. Tanaman Daun");
                        System.out.println("3. Tanaman Buah");
                        System.out.print("Pilih: ");
                        int jenis = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Tanaman : ");
                        String nama = sc.nextLine();
                        System.out.print("Nama Latin   : ");
                        String namaLatin = sc.nextLine();
                        System.out.print("Manfaat      : ");
                        String manfaat = sc.nextLine();

                        if (jenis == 1) {
                            System.out.print("Aroma        : ");
                            String aroma = sc.nextLine();
                            daftarTanaman.add(new TanamanRempah(nama, namaLatin, manfaat, aroma));
                        } else if (jenis == 2) {
                            System.out.print("Bentuk Daun  : ");
                            String bentukDaun = sc.nextLine();
                            daftarTanaman.add(new TanamanDaun(nama, namaLatin, manfaat, bentukDaun));
                        } else if (jenis == 3) {
                            System.out.print("Musim Berbuah: ");
                            String musimBerbuah = sc.nextLine();
                            daftarTanaman.add(new TanamanBuah(nama, namaLatin, manfaat, musimBerbuah));
                        } else {
                            System.out.println("Jenis tidak valid.");
                            continue;
                        }
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
                                System.out.println((i + 1) + ". " + daftarTanaman.get(i).getNama());
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarTanaman.size()) {
                                Tanaman t = daftarTanaman.get(no - 1);
                                System.out.print("Nama Tanaman : ");
                                while (!t.setNama(sc.nextLine())) {
                                    System.out.print("Nama Tanaman : ");
                                }
                                System.out.print("Nama Latin   : ");
                                while (!t.setNamaLatin(sc.nextLine())) {
                                    System.out.print("Nama Latin   : ");
                                }
                                System.out.print("Manfaat      : ");
                                while (!t.setManfaat(sc.nextLine())) {
                                    System.out.print("Manfaat      : ");
                                }

                                if (t instanceof TanamanRempah) {
                                    TanamanRempah tr = (TanamanRempah) t;
                                    System.out.print("Aroma        : ");
                                    while (!tr.setAroma(sc.nextLine())) {
                                        System.out.print("Aroma        : ");
                                    }
                                } else if (t instanceof TanamanDaun) {
                                    TanamanDaun td = (TanamanDaun) t;
                                    System.out.print("Bentuk Daun  : ");
                                    while (!td.setBentukDaun(sc.nextLine())) {
                                        System.out.print("Bentuk Daun  : ");
                                    }
                                } else if (t instanceof TanamanBuah) {
                                    TanamanBuah tb = (TanamanBuah) t;
                                    System.out.print("Musim Berbuah: ");
                                    while (!tb.setMusimBerbuah(sc.nextLine())) {
                                        System.out.print("Musim Berbuah: ");
                                    }
                                }
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
                                System.out.println((i + 1) + ". " + daftarTanaman.get(i).getNama());
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarTanaman.size()) {
                                String namaHapus = daftarTanaman.get(no - 1).getNama();
                                daftarTanaman.remove(no - 1);
                                daftarCatatan.removeIf(c -> c.getNamaTanaman().equals(namaHapus));
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
                                System.out.println((i + 1) + ". " + daftarPengguna.get(i).getNama());
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarPengguna.size()) {
                                Pengguna p = daftarPengguna.get(no - 1);
                                System.out.print("Nama    : ");
                                while (!p.setNama(sc.nextLine())) {
                                    System.out.print("Nama    : ");
                                }
                                System.out.print("Alamat  : ");
                                while (!p.setAlamat(sc.nextLine())) {
                                    System.out.print("Alamat  : ");
                                }
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
                                System.out.println((i + 1) + ". " + daftarPengguna.get(i).getNama());
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarPengguna.size()) {
                                String namaHapus = daftarPengguna.get(no - 1).getNama();
                                daftarPengguna.remove(no - 1);
                                daftarCatatan.removeIf(c -> c.getNamaPengguna().equals(namaHapus));
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
                            System.out.println("Pastikan data pengguna dan tanaman sudah ada terlebih dahulu.");
                        } else {
                            System.out.println("Pilih Pengguna:");
                            for (int i = 0; i < daftarPengguna.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarPengguna.get(i).getNama());
                            }
                            System.out.print("Pilih nomor: ");
                            int noPengguna = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Pilih Tanaman:");
                            for (int i = 0; i < daftarTanaman.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarTanaman.get(i).getNama());
                            }
                            System.out.print("Pilih nomor: ");
                            int noTanaman = sc.nextInt();
                            sc.nextLine();

                            if (noPengguna >= 1 && noPengguna <= daftarPengguna.size() &&
                                    noTanaman >= 1 && noTanaman <= daftarTanaman.size()) {
                                Pengguna p = daftarPengguna.get(noPengguna - 1);
                                Tanaman t = daftarTanaman.get(noTanaman - 1);
                                System.out.print("Keterangan   : ");
                                String keterangan = sc.nextLine();
                                Catatan c = new Catatan(p.getNama(), t.getNama(), keterangan);
                                System.out.println(c.buatRingkasan(t, p));
                                daftarCatatan.add(c);
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
                                System.out.println((i + 1) + ". " + daftarCatatan.get(i).getNamaPengguna() + " - " + daftarCatatan.get(i).getNamaTanaman());
                            }
                            System.out.print("Pilih nomor: ");
                            int no = sc.nextInt();
                            sc.nextLine();
                            if (no >= 1 && no <= daftarCatatan.size()) {
                                Catatan c = daftarCatatan.get(no - 1);
                                System.out.print("Keterangan baru : ");
                                while (!c.setKeterangan(sc.nextLine())) {
                                    System.out.print("Keterangan baru : ");
                                }
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
                                System.out.println((i + 1) + ". " + daftarCatatan.get(i).getNamaPengguna() + " - " + daftarCatatan.get(i).getNamaTanaman());
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