public class mobilberaksi {
    public static void main(String[] args) {
        mobil mbl = new mobil("Marcedes benz", "Sport");
        mbl.setbahanbakar("Bensin");
        mbl.setcc(15000);
        
     System.out.println("merek: "+ mbl.getmerek());
     System.out.println("Jenis: "+ mbl.getjenis());
     System.out.println("Bahan Bakar: "+ mbl.getBB());
     System.out.println("Cylinder : "+ mbl.getcc());


    }
}
