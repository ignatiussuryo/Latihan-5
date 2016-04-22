package bukutamu;

public class BukuTamu {
    private int ID;
    private String Nama;
    private String Alamat;
    private String noTelepon;
    private static final int kuotaTamu = 100;
    private static int count;
    
    public BukuTamu(){
        Nama      = null;
        Alamat    = null;
        noTelepon = null;
        count++;
        ID        = count;
    }
    
    public void setIdentitas(String n, String a, String p){
        Nama      = n;
        Alamat    = a;
        noTelepon = p;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
    public String getnoTelepon(){
        return noTelepon;
    }
    
    public void displayIdentitas(){
        System.out.println("ID          :"+getID());
        System.out.println("Nama        :"+getNama());
        System.out.println("Alamat      :"+getAlamat());
        System.out.println("No Telepon  :"+getnoTelepon());
    }
    
    public static int getkuotaTamu(){
        return kuotaTamu;
    }
    
    public static int jumlahTamu(){
        return count;
    }
    
}
