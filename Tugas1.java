package BPO;
/**
 *
 * @author Hanif Setyananda
 * 
 */
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
