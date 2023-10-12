import java.util.Scanner;

public class AgeMessages {
    public static void main (String [] args){
        Scanner keyboard = new Scanner (System.in);
        int umur;

        System.out.println("Berapa umur kamu ? : ");
        umur = keyboard.nextInt();

        if (umur >= 18){
            System.out.println("Kamu dapat membuat surat izin mengemudi (SIM)");
        }
        if(umur >= 17){
            System.out.println("Kamu mendapatkan kartu tanda Kependudukan (KTP)");
        }
        if(umur >= 25){
            System.out.println("Kamu sudah bisa menikah");
        }
    }
}
