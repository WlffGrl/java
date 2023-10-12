import java.util.Scanner;


public class JobVacantion {
    public static void main (String [] args){
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jeniskelamin;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Selamat datang di PT.Secret Semut 79");
        System.out.println("====================================\n");
        System.out.println("Silahkan inputkan data anda");
        System.out.println("Nama : ");
        nama = keyboard.next();

        System.out.println("Umur : ");
        umur = keyboard.nextInt();

        System.out.println("Jenis kelamin (Pria/Wanita) : ");
        jeniskelamin = keyboard.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = keyboard.next();

        System.out.print("Pengalaman : ");
        pengalaman = keyboard.nextInt();

        System.out.println("Penampilan : ");
        penampilan = keyboard.nextDouble();

        //Pengecekan data
        reqKoor1 = jeniskelamin.equalsIgnoreCase("Pria") && umur >=21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
        reqKoor2 = jeniskelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;
        isPassingKoor = reqKoor1 || reqKoor2;

        reqAdmin1 = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);
        reqAdmin2 = jeniskelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3;
        isPassingAdmin = reqAdmin1 || reqAdmin2;

        System.out.println(nama + ", Terimakasih sudah mengikuti kerja di PT. Secret Semut 79.\n");
        System.out.println("Berikut adalah hasil dari Rekrutment untuk Koordinator dan admin : ");
        System.out.println("Hasil kelulusan untuk koordinator : " + isPassingKoor);
        System.out.println("Hasil kelulusan untuk Admin : " + isPassingAdmin);

    }
    
}
