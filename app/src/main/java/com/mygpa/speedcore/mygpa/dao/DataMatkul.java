package com.mygpa.speedcore.mygpa.dao;

public class DataMatkul {

    private String namaMatkul;
    private int sks;
    private Nilai nilai;

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getNamaMatkul() {
        return this.namaMatkul;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSks() {
        return this.sks;
    }

    public void setNilai(Nilai nilai) {
        this.nilai = nilai;
    }

    public Nilai getNilai() {
        return this.nilai;
    }

}
