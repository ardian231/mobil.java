public class Employee {
    private String NIP;
    private String Nama;
    private int GajiPokok;
    private int Lembur;
    private int UangMakan;
    private int Transport;
    
    public Employee(String NIP, String Nama, int JumlahJamKerja) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.GajiPokok = 2000;
        this.Lembur = 0;
        this.UangMakan = 0;
        this.Transport = 0;
        
        if (JumlahJamKerja > 7) {
            this.Lembur = (int)((JumlahJamKerja - 7) * this.GajiPokok * 1.5);
        }
        if (JumlahJamKerja >= 8) {
            this.UangMakan = 3500;
        }
        if (JumlahJamKerja >= 9) {
            this.Transport = 4000;
        }
    }
    
    public int TakeHomePay() {
        return this.GajiPokok + this.Lembur + this.UangMakan + this.Transport;
    }
    
    public String getNIP() {
        return NIP;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public int getGajiPokok() {
        return GajiPokok;
    }
    
    public int getLembur() {
        return Lembur;
    }
    
    public int getUangMakan() {
        return UangMakan;
    }
    
    public int getTransport() {
        return Transport;
    }
}
