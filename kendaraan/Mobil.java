package kendaraan;
import mesin.Mesin;

public class Mobil {
    private String merek;
    private String bahanBakar;
    private String kapasitasBensin;
    private Mesin spekMesin;


    public void setMerek(String setMerek){
        this.merek = setMerek;
    }
    public void setBahanBakar(String setBahanBakar){
        this.bahanBakar = setBahanBakar;
    }
    public void setKapasitasBensin(String setKapasitasBensin){
        this.kapasitasBensin = setKapasitasBensin;
    }
    public void setSpekMesin(Integer setJumlahSilinder, String setKapasitasSilinder, String setLangkahMesin){
        this.spekMesin = new Mesin(setJumlahSilinder, setKapasitasSilinder, setLangkahMesin);
    }




    public String getMerek(){
        return this.merek;
    }
    public String getBahanBakar(){
        return this.bahanBakar;
    }
    public String getKapasitasBensin(){
        return this.kapasitasBensin;
    }
    public Mesin getSpekMesin(){
        return this.spekMesin;
    }

}
