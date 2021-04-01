package com.example.listrecycleview;

public class Mahasiswa {
    private String Nama;
    private String npm;
    private String nohp;

    public Mahasiswa(String nama, String npm, String nohp) {
        Nama = nama;
        this.npm = npm;
        this.nohp = nohp;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
