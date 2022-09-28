package bagasmuhammadshaka_praktikum6;

public class Mahasiswa {
    public String nama;
    public String npm;
    private double nilaiUas;
    private double nilaiUts;
    
    public void insertNilaiUas(double nilai){
     nilaiUas = nilai;
    }
    public void insertNilaiUts(double nilai){
     nilaiUts = nilai;
    }
    public double nilaiAkhir(){
    double jumlah = nilaiUts + nilaiUas;
    return jumlah/2;
    }
    
    public void dataMhs(){
        
     System.out.println("-----------------------------------");  
     System.out.println("Nama :" + nama);
     System.out.println("Npm  :" + npm);
     System.out.println("Uas :" + nilaiUas);
     System.out.println("Uts :" + nilaiUts);   
     System.out.println("Rata rata nilai :" + nilaiAkhir());  
    }
    
}
