/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BPO;

/**
 *
 * @author Hanif Setyananda
 */
public class Pelajar {
    private String nip,nama;
    private double nilai1,nilai2, tugas,nilai_lulus;
    public void setData(String data,String data2){
        this.nip = data;
        this.nama = data2;
    }
    public void setNilai(double data, double data2, double data3){
        this.nilai1 = data;
        this.nilai2 = data2;
        this.tugas = data3;
    }
    public void setNip(String data){
        this.nip = data;
    }
    public void setNama(String data){
        this.nama = data;
    }
    public void setNilaiUjian1(double data){
        this.nilai1 = data;
    }
    public void setNilaiUjian2(double data){
        this.nilai2 = data;
    }
    public void setNilaiTugas(double data){
        this.tugas = data;
    }
    public String getNama(){
        return this.nama;
    }
    public String getNip(){
        return this.nip;
    }
    public double getNilaiUji1(){
        return this.nilai1;
    }
    public double getNilaiUji2(){
        return this.nilai2;
    }
    public double getNilaiTugas(){
        return this.tugas;
    }
    public double nilaiRata2(){
        double hasil = (this.nilai1 + this.nilai2)/2;
        return hasil;
    }
    public double nilaiAkhir(){
        double hasil = (this.nilai1*((double)35/100)) + (this.nilai2*((double)40/100)) + (this.tugas*((double)25/100));
        this.nilai_lulus = hasil;
        return hasil;
    }
    public String isLulus(){
        if(this.nilai_lulus >= 60){
            return "Lulus";
        }
        else{
            return "Tidak lulus";
        }
    }
    public void status(){
        System.out.println("Status :   "+ this.isLulus());
    }
}
