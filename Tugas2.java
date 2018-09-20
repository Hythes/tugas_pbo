package BPO;

/**
 *
 * @author Hanif Setyananda
 * 
 */
public class Tugas2
{
    public static void main(String[] args){
        Pelajar p = new Pelajar();
        p.setData("Dian S.","050122");
        p.setNilai(65,53.7,62.5);
        System.out.println("Data  Pelajar  : ");
        System.out.println("NIP            : "+p.getNip());
        System.out.println("Nama            : "+p.getNama());
        System.out.println("N.Ujian  1  :  "+ p.getNilaiUji1());
        System.out.println("N.Ujian  2  :  "+ p.getNilaiUji2());
        System.out.println("N.Tugas      :  "+ p.getNilaiTugas());
        System.out.println("N.Rata2  ujian  : "+ p.nilaiRata2());
        System.out.printf("Nilai  Akhir      : %.2f", p.nilaiAkhir());
        System.out.println("\nStatus        :  "+ p.isLulus());
    }
}
