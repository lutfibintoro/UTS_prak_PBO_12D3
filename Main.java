
import kendaraan.Mobil;
import kendaraan.SepedaMotor;
import mesin.Mesin;

public class Main {
    
    public static void main(String[] args) {
        SepedaMotor motor1 = new SepedaMotor();
        Mobil mobil1 = new Mobil();
        Mesin spekMesinMotor;
        Mesin spekMesinMobil;

        motor1.setMerek("Suzuki Thunder");
        motor1.setBahanBakar("Pertalite");
        motor1.setKapasitasBensin("15 Liter");
        motor1.setSpekMesin(1, "125 cc", "4-Stroke");
        spekMesinMotor = motor1.getSpekMesin();

        System.out.println("\nMotor\t\t\t: " +motor1.getMerek());
        System.out.println("Bahan Bakar\t\t: " +motor1.getBahanBakar());
        System.out.println("Kapasitas Bensin\t: " +motor1.getKapasitasBensin());
        System.out.println("Jumlah Silinder\t\t: " +spekMesinMotor.getJumlahSilinder());
        System.out.println("Kapasitas Silinder\t: " +spekMesinMotor.getKapasitasSilinder());
        System.out.println("Langkah Mesin\t\t: " +spekMesinMotor.getLangkahMesin()+ "\n");



        mobil1.setMerek("Pajero Sport");
        mobil1.setBahanBakar("Solar");
        mobil1.setKapasitasBensin("68 Liter");
        mobil1.setSpekMesin(4, "2477 cc", null);
        spekMesinMobil = mobil1.getSpekMesin();

        System.out.println("\nMotor\t\t\t: " +mobil1.getMerek());
        System.out.println("Bahan Bakar\t\t: " +mobil1.getBahanBakar());
        System.out.println("Kapasitas Bensin\t: " +mobil1.getKapasitasBensin());
        System.out.println("Jumlah Silinder\t\t: " +spekMesinMobil.getJumlahSilinder());
        System.out.println("Kapasitas Silinder\t: " +spekMesinMobil.getKapasitasSilinder());
        System.out.println("Langkah Mesin\t\t: " +spekMesinMobil.getLangkahMesin()+ "\n");
    }
}
