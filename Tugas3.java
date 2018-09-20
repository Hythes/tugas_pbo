package BPO;
import java.util.Scanner;
/**
 *
 * @author Hanif Setyananda
 * 
 */

public class Tugas3 {
    public static void main(String[] x){
        Scanner r = new Scanner(System.in);
        pd("Data Pelajar : ");
        pd("----------INPUT DATA----------");
        pd("Masukkan NIP : ");
        String nip = r.next();
        pd("Masukkan NAMA : ");
        String nama = r.next();
        pd("Masukkan Nilai Ujian 1 : ");
        double ujian1 = r.nextDouble();
        pd("Masukkan Nilai Ujian 2 : ");
        double ujian2 = r.nextDouble();
        pd("Masukkan Nilai Tugas : ");
        double tugas = r.nextDouble();
        pd("----Mengeksekusi Data------");
        Pelajar p = new Pelajar();
        p.setNip(nip);
        p.setNama(nama);
        p.setNilaiUjian1(ujian1);
        p.setNilaiUjian2(ujian2);
        p.setNilaiTugas(tugas);
        System.out.println("\n\n\nData  Pelajar  :");
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
    public static void pd(String data){
         System.out.println(data);
    }
    public static void pr(double data){
        System.out.print(data);
    }

}
