package bagasmuhammadshaka_praktikum6;
import bagasmuhammadshaka_praktikum6.Mahasiswa;
import java.util.Scanner;

public class BagasMuhammadShaka_Praktikum6 {
    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);       
     Mahasiswa mhs1 = new Mahasiswa();
   
     System.out.print("Masukkan Nama :");
         mhs1.nama = input.nextLine();
     System.out.print("Masukkan Npm :");
         mhs1.npm   = input.nextLine();
     
     System.out.print("Masukkan Nilai Uas :");
         mhs1.insertNilaiUas(input.nextDouble());
     System.out.print("Masukkan Nilai Uts :");
         mhs1.insertNilaiUts(input.nextDouble());
     
      mhs1.dataMhs();
     
     
    }  
}
