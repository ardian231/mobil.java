public class mobil {

private String merek;
private String jenis;
private String bahanbakar;
private double cc;

public mobil(String mrk, String jns){
merek = mrk;
jenis = jns;
}
public void setMerk(String mrk){merek=mrk ;}
public void setjenis(String jns){jenis =jns ;}
public void setbahanbakar(String bb){bahanbakar = bb;} 
public void setcc(double cyl){cc = cyl;}
public String getmerek(){return merek;}
public String getjenis(){return jenis;}
public String getBB(){return bahanbakar;}
public double getcc(){return cc;}
}
