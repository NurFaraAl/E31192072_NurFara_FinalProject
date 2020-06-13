/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beli;

/**
 *
 * @author Nur Fara
 */
public class databeli {
private String tanggalbulantahun,  namapembeli;
   
public String getTanggal(){
    return tanggalbulantahun;
}
public void setTanggal(String tanggalbulantahun){
    this.tanggalbulantahun = tanggalbulantahun;
}
public String getNamaPembeli(){
    return namapembeli;
}
public void setNamaPembeli(String namapembeli){
    this.namapembeli = namapembeli;
}
int total,banyaknyapesanan,kembali;

public int getTotal(){
    return total;
}
public void setTotal(int total){
    this.total = total;
}
public int getBanyakPesanan(){
    return banyaknyapesanan;
}
public void setBanyakPesanan(int banyaknyapesanan){
    this.banyaknyapesanan = banyaknyapesanan;
}
public int getKembali(){
    return kembali;
}
public void setKembali(int kembali){
    this.kembali = kembali;
}
}
