package bukutamu;

import java.util.Scanner;

public class mainBukuTamu {

    public static void main(String[] args) {
        // TODO code application logic here
        String nama, alamat, noTelepon, p,p2;
        int i = 0;
        boolean cek = true;
        
        Scanner in = new Scanner(System.in);
        
        BukuTamu[] Tamu;
        Tamu = new BukuTamu[BukuTamu.getkuotaTamu()];
        
        
        System.out.println("=======================");
        System.out.println("   Program Buku Tamu   ");
        System.out.println("=======================");
        System.out.println("1. Tambah Data Tamu");
        System.out.println("2. Tampilkan Data Tamu");
        System.out.println("3. Exit");
        System.out.println("=======================");
        
        do{
            System.out.print("Masukan pilihan anda :");
            p2 = in.nextLine();
        
            switch(p2){
            case "1":
                do{
                    Tamu[i] = new BukuTamu();
            
                    System.out.print("Masukan nama       :");
                    nama = in.nextLine();
                    System.out.print("Masukan alamat     :");
                    alamat = in.nextLine();
                    System.out.print("Masukan No Telepon :");
                    noTelepon = in.nextLine();
            
                    Tamu[i].setIdentitas(nama, alamat, noTelepon);
            
                    System.out.print("Tambah data tamu lagi ?(y/n)");
                    p = in.nextLine();
            
                    if(p.equalsIgnoreCase("y"))
                        cek = true;
                    else
                        cek = false;
            
                    i++;    
                }while(cek != false);
                break;
            
            case "2":
                System.out.println("============================");
                System.out.println("         Daftar Tamu        ");
                System.out.println("============================");
                for(int j = 0;j<BukuTamu.getkuotaTamu();j++){
                    if(Tamu[j] == null)
                        System.out.print("");
                    else{
                        Tamu[j].displayIdentitas();
                        System.out.println("");
                    }       
                }
                System.out.println("============================");
                System.out.println("Jumlah Tamu :"+BukuTamu.jumlahTamu()+"\n");
                break;
            
            case "3":
                System.out.println("\nExit");
                System.exit(0);
                break;
                
            default :
                System.out.println("Menu Tidak Tersedia");
        }
            
            System.out.print("Pilih lagi ?(y/n)");
            p = in.nextLine();
            
            if(p.equalsIgnoreCase("y"))
                cek = true;
            else
                cek = false;
            
        }while(cek!=false);
        System.out.println("\nExit");
    }
    
}
