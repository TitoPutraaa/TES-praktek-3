import java.util.Scanner;

public class Sendiri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // data array
        String[] nama = new String[0];
        String[] noHp = new String[0];
        String[] alamat = new String[0];
        
        do{
            System.out.println("===MENU===");
            System.out.println("1 = untuk menginput data ");
            System.out.println("2 = untuk mencari data data ");
            System.out.println("3 = untuk keluar dari program ");
            System.out.print("Pilih : ");
            int pilih = scan.nextInt();

            switch (pilih) {
                case 1:
                System.out.print("masukan jumlah data : ");
                int jmlhData = scan.nextInt();
                nama = new String[jmlhData];
                noHp = noHp[jmlhData];
                alamat = alamat[jmlhData];
                inputData(scan, nama, noHp, alamat);
                        break;
                case 2:
                    
                        break;
                    
                case 3:
                    
                        break;
                default:
                    System.out.println("masukan pilihan yang tersedia 1/2/3");
                        break;
            }
        } while(true);
    }
                    
        static void inputData(Scanner scan, String[] nama, String[] noHp, String[] alamat) {

            for (int i = 0; i < nama.length; i++) {
                System.out.println("      PEGAWAI KE - " + (i+1));  
                System.out.print("masukan nama : ");
                nama[i] = scan.nextLine();
                System.out.print("masukan nomor HP : ");
                noHp[i] = scan.next();
                System.out.print("masukan alamat : ");
                alamat[i] = scan.next();
            }
        }
}