public class implementasi {
    public static void main(String[] args) {
        Employee karyawan1 = new Employee("19000", "Andi", 8);
        Employee karyawan2 = new Employee("09902", "Budi", 10);
        
        System.out.println("Data Karyawan 1:");
        System.out.println("NIP: " + karyawan1.getNIP());
        System.out.println("Nama: " + karyawan1.getNama());
        System.out.println("Gaji Pokok: " + karyawan1.getGajiPokok());
        System.out.println("Lembur: " + karyawan1.getLembur());
        System.out.println("Uang Makan: " + karyawan1.getUangMakan());
        System.out.println("Transport: " + karyawan1.getTransport());
        System.out.println("Take Home Pay: " + karyawan1.TakeHomePay());
        
        System.out.println("\nData Karyawan 2:");
        System.out.println("NIP: " + karyawan2.getNIP());
        System.out.println("Nama: " + karyawan2.getNama());
        System.out.println("Gaji Pokok: " + karyawan2.getGajiPokok());
        System.out.println("Lembur: " + karyawan2.getLembur());
        System.out.println("Uang Makan: " + karyawan2.getUangMakan());
        System.out.println("Transport: " + karyawan2.getTransport());
        System.out.println("Take Home Pay: " + karyawan2.TakeHomePay());
    }
}
