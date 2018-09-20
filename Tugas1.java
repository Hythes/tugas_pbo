/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
/**
 *
 * @author Ligma
 */
class Pelajar{
    private String nip,nama;
    private double nilai1,nilai2, tugas,nilai_lulus;
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
    /*NA=(nilaiUjian1*35%)+(nilaiUjian2*40%)+(nilaiTugas*25%)*/
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

public class Tugas1 {
    public static void main(String[] args) {
        Pelajar p = new Pelajar();
        p.setNip("050123");
        p.setNama("Budiono");
        p.setNilaiUjian1(55.9);
        p.setNilaiUjian2(65.8);
        p.setNilaiTugas(72);
        System.out.println("Data  Pelajar  :");
        System.out.println("NIP            : " +p.getNip());
        System.out.println("Nama            : "+p.getNama());
        System.out.println("N.Ujian  1  :  "+ 
        p.getNilaiUji1());
        System.out.println("N.Ujian  2  :  "+ 
        p.getNilaiUji2());
        System.out.println("N.Tugas      :  "+ 
        p.getNilaiTugas());
        System.out.printf("N.Rata2  ujian  : %.2f", 
        p.nilaiRata2());
        System.out.println("\nNilai  Akhir      :"+ 
        p.nilaiAkhir());
        p.status();
    }
    
}
