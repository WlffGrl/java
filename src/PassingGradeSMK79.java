import java.util.Scanner;

public class PassingGradeSMK79 {
    public static void main (String [] args){
        int matematika, bhsInggris, bhsIndonesia, ipa; //variabel untuk menyimpan nilai ujian
        int passingGradeSMK, passingGradeSastra, passingGradeTIK; //variabel untuk menyimpan nilai syarat kelulusan
        boolean isPassingSMK, isPassingSastra, isPassingTIK; //variabel untuk nyeyimpan hasil kelulusan
        double averageUjian, averageBahasa;

        Scanner keyboard = new Scanner(System.in);

        //Inisialisasi dulu nilai variabel untuk syarat kelulusan
        passingGradeSMK = 73;
        passingGradeSastra = 75;
        passingGradeTIK = 80;

        System.out.print("Masukan nilai ujian Matematika: ");
        matematika = keyboard.nextInt();

        System.out.println("Masukan nilai ujia Bhs.Indonesia: ");
        bhsIndonesia = keyboard.nextInt();

        System.out.println("Masukan nilai ujia Bhs.Inggris: ");
        bhsInggris = keyboard.nextInt();

        System.out.println("Masukan nilai ujia IPA: ");
        ipa = keyboard.nextInt();

        //menghitung rata - rata nilai ujian
        averageUjian = (matematika + bhsIndonesia + bhsInggris + ipa)/4;

        //menghitung rata - rata nilai bahasa
        averageBahasa = (bhsIndonesia + bhsInggris)/2;

        //boolean part
        //menentukan kelulusan masuk SMK
        isPassingSMK = averageUjian >= passingGradeSMK;

        //menentukan kelulusan masuk jurusan sastra
        isPassingSastra = averageBahasa >= passingGradeSastra;

        //menentukan kelulusan masuk jurusan TIK
        isPassingTIK = matematika >= passingGradeTIK;

        System.out.println("\n\nHasil dari Simulasi untuk Persyaratan Penerima Calon Siswa di SMK Padepokan 79 sebegai berikut : ");
        System.out.println("=====================================================================================================");
        System.out.println("Apakah anda memenuhi syarat untuk masuk SMK Padepokan 79 ? : " + isPassingSMK);
        System.out.println("Apakah anda memnuhi syarat untuk masuk ke jurusan sastra ? : " + isPassingSastra);
        System.out.print("Apakah anda memenuhi syarat untuk masuk juruan Teknik Komputer ? : " + isPassingTIK);
    }
}
