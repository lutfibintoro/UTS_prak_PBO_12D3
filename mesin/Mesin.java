package mesin;

public class Mesin {
    private Integer jumlahSilinder;
    private String kapasitasSilinder;
    private String langkahMesin;

    public Mesin(Integer setJumlahSilinder, String setKapasitasSilinder, String setLangkahMesin){
        this.jumlahSilinder = setJumlahSilinder;
        this.kapasitasSilinder = setKapasitasSilinder;
        this.langkahMesin = setLangkahMesin;
    }


    public Integer getJumlahSilinder(){
        return this.jumlahSilinder;
    }
    public String getKapasitasSilinder(){
        return this.kapasitasSilinder;
    }
    public String getLangkahMesin(){
        return this.langkahMesin;
    }

}