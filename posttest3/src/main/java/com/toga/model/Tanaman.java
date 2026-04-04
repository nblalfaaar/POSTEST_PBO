package com.toga.model;

import org.apache.commons.lang3.StringUtils;

public class Tanaman {
    protected String nama;
    private String namaLatin;
    private String manfaat;
    private final String jenis;

    public Tanaman(String nama, String namaLatin, String manfaat, String jenis) {
        this.nama = nama;
        this.namaLatin = namaLatin;
        this.manfaat = manfaat;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public String getNamaLatin() {
        return namaLatin;
    }

    public String getManfaat() {
        return manfaat;
    }

    public String getJenis() {
        return jenis;
    }

    public boolean setNama(String nama) {
        if (StringUtils.isBlank(nama)) {
            System.out.println("Nama tidak boleh kosong.");
            return false;
        } else {
            this.nama = nama;
            return true;
        }
    }

    public boolean setNamaLatin(String namaLatin) {
        if (StringUtils.isBlank(namaLatin)) {
            System.out.println("Nama latin tidak boleh kosong.");
            return false;
        } else {
            this.namaLatin = namaLatin;
            return true;
        }
    }

    public boolean setManfaat(String manfaat) {
        if (StringUtils.isBlank(manfaat)) {
            System.out.println("Manfaat tidak boleh kosong.");
            return false;
        } else {
            this.manfaat = manfaat;
            return true;
        }
    }

    String getInfoSingkat() {
        return nama + " (" + namaLatin + ")";
    }

    public void tampilInfo() {
        System.out.println("Nama        : " + getNama());
        System.out.println("Nama Latin  : " + getNamaLatin());
        System.out.println("Manfaat     : " + getManfaat());
    }
}