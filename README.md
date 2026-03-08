# Sistem Manajemen Tanaman Obat Keluarga (TOGA)

## Deskripsi
Program ini adalah aplikasi berbasis teks untuk mengelola data Tanaman Obat Keluarga (TOGA). Program dibuat menggunakan bahasa pemrograman Java dengan menerapkan konsep Object Oriented Programming (OOP) seperti class, object, property, method, dan constructor.

Program memiliki 3 class utama yaitu Tanaman, Pengguna, dan Catatan. Catatan berfungsi sebagai penghubung antara Pengguna dan Tanaman yang mencatat siapa yang menanam tanaman apa.

---

## Struktur Class
- **Tanaman** : menyimpan nama tanaman, nama latin, dan manfaat
- **Pengguna** : menyimpan nama dan alamat pengguna yang menanam TOGA
- **Catatan** : mencatat pengguna mana yang menanam tanaman apa beserta keterangannya

---

## Alur Program
1. Program menampilkan menu utama dengan 3 pilihan: Kelola Tanaman, Kelola Pengguna, dan Kelola Catatan
2. Setiap menu memiliki submenu CRUD masing-masing (Tambah, Lihat, Ubah, Hapus)
3. Untuk menambah Catatan, data Tanaman dan Pengguna harus sudah ada terlebih dahulu
4. Saat Tanaman dihapus, Catatan yang terkait dengan tanaman tersebut ikut terhapus
5. Saat Pengguna dihapus, Catatan yang terkait dengan pengguna tersebut ikut terhapus
6. Program terus berjalan sampai pengguna memilih menu keluar

---

## Tampilan Program

### Menu Utama
![Menu Utama](assets/0-menu-utama.png)

### Menu Tanaman
![Menu Utama](assets/1-menu-tanaman.png)

### Tambah Tanaman
![Tambah Tanaman](assets/2-tambah-tanaman.png)

### Lihat Tanaman
![Lihat Tanaman](assets/3-lihat-tanaman.png)

### Ubah Tanaman
![Ubah Tanaman](assets/4-ubah-tanaman.png)

### Hapus Tanaman
![Hapus Tanaman](assets/5-hapus-tanaman.png)

### Menu Pengguna
![Menu Pengguna](assets/6-menu-pengguna.png)

### Tambah Pengguna
![Tambah Pengguna](assets/7-tambah-pengguna.png)

### Lihat Pengguna
![Lihat Pengguna](assets/8-lihat-pengguna.png)

### Ubah Pengguna
![Ubah Pengguna](assets/9-ubah-pengguna.png)

### Hapus Pengguna
![Hapus Pengguna](assets/10-hapus-pengguna.png)

### Menu Catatan
![Menu Catatan](assets/11-menu-catatan.png)

### Tambah Catatan
![Tambah Catatan](assets/12-tambah-catatan.png)

### Lihat Catatan
![Lihat Catatan](assets/13-lihat-catatan.png)

### Ubah Catatan
![Ubah Catatan](assets/14-ubah-catatan.png)

### Hapus Catatan
![Hapus Catatan](assets/15-hapus-catatan.png)

### Keluar Program
![Keluar](assets/16-keluar.png)