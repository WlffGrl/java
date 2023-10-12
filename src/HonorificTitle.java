import java.util.Scanner;

public class HonorificTitle {
    public static void main (String [] args){
        String title, namaDepan, namaBelakang, jenisKelamin;
        int umur;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Nama Depan : ");
        namaDepan = keyboard.next();

        System.out.print("Nama Belakang : ");
        namaBelakang = keyboard.next();

        System.out.print("Umur : ");
        umur = keyboard.nextInt();

        System.out.print("Jenis kelamin (Pria/Wanita) : ");
        jenisKelamin = keyboard.next();

        if (umur < 20){
            title = namaDepan;
        } else {
            if (jenisKelamin.equals("Wanita"));
            System.out.print("Apakah anda sudah menikah ? (Ya/Tidak) : ");
            String status = keyboard.next();

            if (status.equals("Ya")){
                title = "Mrs. ";
            } else {
                title = "Ms. ";
            }
        }
        System.out.print("Hello " + title + " " + namaBelakang);
    }
}
