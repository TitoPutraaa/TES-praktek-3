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
                noHp = new String[jmlhData];
                alamat = new String[jmlhData];
                inputData(scan, nama, noHp, alamat);
                        break;
                case 2:
                    int hasilCari = cariData(scan, nama, noHp, alamat);
                    tampilData(scan, hasilCari, nama, noHp, alamat);
                        break;
                                        
                case 3:
                    return;
                default:
                    System.out.println("masukan pilihan yang tersedia 1/2/3");
                        break;
            }
        } while(true);
    }
                    
        static void inputData(Scanner scan, String[] nama, String[] noHp, String[] alamat) {
            for (int i = 0; i < nama.length; i++) {
                scan.nextLine();
                System.out.println("      PEGAWAI KE - " + (i+1));  
                System.out.print("masukan nama : ");
                nama[i] = scan.nextLine();
                System.out.print("masukan nomor HP : ");
                noHp[i] = scan.next();
                System.out.print("masukan alamat : ");
                alamat[i] = scan.next();
            }
        }

        static int cariData(Scanner scan, String[] nama, String[] noHp, String[] alamat) {
            System.out.print("masukan nama yang ingin di cari : ");
            scan.nextLine();
            String target = scan.nextLine();
            for (int i = 0; i < nama.length; i++) {
                if (nama[i].equalsIgnoreCase(target)) {
                    return i;
                }
            }
            return -1;
        }

        static void tampilData(Scanner scan, int hasilCari, String[] nama, String[] noHp, String[] alamat) {
            if (hasilCari >= 0) {
                System.out.println("Nama : " + nama[hasilCari]);
                System.out.println("nomor HP : " + noHp[hasilCari]);
                System.out.println("alamat : " + alamat[hasilCari]);
            } else {
                System.out.println("data tidak ditemukan");
            }
        }
}