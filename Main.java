import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean dataAda = false;
            int jmlhData = 99;
            String[] nama = new String[jmlhData];
            String[] noHP = new String[jmlhData];
            String[] alamat = new String[jmlhData];
        int menu = 1;
        do {
            System.out.println("===MENU===");
            System.out.println("ketik 1 : input data ");
            System.out.println("ketik 2 : mencari data ");
            System.out.println("ketik 3 : keluar dari program ");
            System.out.print("pilih : ");
            menu = scan.nextInt();


                if (menu == 1) {
                    System.out.print("masukan jumlah data pegawai : ");
                    jmlhData = scan.nextInt();
                    inputData(scan, nama, noHP, alamat, jmlhData);
                } if (menu == 2) {
                    int ketemu = cariData(jmlhData, nama, scan, dataAda);
                    tampilData(ketemu, dataAda, nama, noHP, alamat, scan);
                } else if (menu == 3) {
                    break;
                }
        } while (menu == 1 || menu == 2);
        
    }
    
    // method input data pegawai 
    static void inputData(Scanner scan, String[] nama, String[] noHP, String[] alamat, int jmlhData) {

        for (int i = 0; i < jmlhData; i++) {
            scan.nextLine();
            System.out.print("\nmasukan nama pegawai ke-" + (i+1) + " : ");
            nama[i] = scan.nextLine();
            System.out.print("masukan nomor HP pegawai ke-" + (i+1) + " : ");
            noHP[i] = scan.next();
            System.out.print("masukan alamat pegawai ke-" + (i+1) + " : ");
            alamat[i] = scan.next();
        }
    }

    // method pencarian data 
    static int cariData(int jmlhData, String[] nama, Scanner scan, boolean dataAda) {
        scan.nextLine();
        System.out.print("masukan nama yang di cari : ");
        String cari = scan.nextLine();
        for (int i = 0; i < jmlhData; i++) {
            if (nama[i].equalsIgnoreCase(cari)) {
                dataAda = true;
                return i;
            }
        }
        return -1;
    }

    // method tampil data 
    static void tampilData(int ketemu, boolean dataAda, String[] nama, String[] noHP, String[] alamat, Scanner scan) {
        if (dataAda) {
            System.out.println("nama : " + nama[ketemu]);
            System.out.println("nomor HP : " + noHP[ketemu]);
            System.out.println("alamat : " + alamat[ketemu]);
        } else {
            System.out.println("data tidak ditemukan!");
        }

    }
}