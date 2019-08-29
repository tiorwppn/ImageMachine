package com.prospace.imagemachine.model;

public class MachineDataModel {
    public int gambar ;
    public String nama, id, tipe ,date, QR;

    public MachineDataModel(int gambar, String nama, String id, String tipe, String QR, String date) {
        this.gambar = gambar;
        this.nama = nama;
        this.id = id;
        this.tipe = tipe;
        this.QR = QR;
        this.date = date;
    }

    public int getGambar() {return gambar;}
    public void setGambar(int gambar) {this.gambar = gambar;}
    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getTipe() {return tipe;}
    public void setTipe(String tipe) {this.tipe = tipe;}
    public String getQR() {return QR;}
    public void setQR(String QR) {this.id = QR;}
    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}
}
