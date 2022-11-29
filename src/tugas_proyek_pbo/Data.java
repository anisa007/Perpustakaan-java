package tugas_proyek_pbo;

public class Data {
    private String judul;
    private String kode;
   

    public Data(String kode, String judul) {
        this.judul = judul;
        this.kode = kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

   
    
    
    
}
