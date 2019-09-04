package com.example.recycleview;

public class Email {
    int icon;
    String nama, subjek, pesan;

    public Email(int icon, String nama, String subjek, String pesan){

        this.icon = icon;
        this.nama = nama;
        this.subjek = subjek;
        this.pesan = pesan;

    }

    public int getIcon(){
        return icon;
    }

    public String getNama(){
        return nama;
    }

    public String getSubjek(){
        return subjek;
    }

    public String getPesan(){
        return pesan;
    }
}