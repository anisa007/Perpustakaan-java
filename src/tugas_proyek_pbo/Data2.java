package tugas_proyek_pbo;


import tugas_proyek_pbo.MyInterface;
import tugas_proyek_pbo.Data;


public class Data2 extends Data implements MyInterface{
    private String tanggalTerbit;
    private String pengarang;

    public Data2(String kode, String judul, String tanggalTerbit, String pengarang) {
        super(kode, judul);
        this.tanggalTerbit = tanggalTerbit;
        this.pengarang = pengarang;
    }
    
    public Data2() {
        this("", "","","");
    }
    public String getTanggalTerbit() {
        return tanggalTerbit;
    }

    public void setTanggalTerbit(String tanggalTerbit) {
        this.tanggalTerbit = tanggalTerbit;
    }

    @Override
    public String getPengarang() {
        return pengarang;
    }
   
    
    
    
}
