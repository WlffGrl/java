import java.util.Scanner;

public class OrderFood {
    public static void main (String [] args){
        Scanner keyboard = new Scanner (System.in);
        String Hujan;

        System.out.println("Cuaca sore ini ? : ");
        Hujan = keyboard.next();

        if (Hujan.equals("Hujan")){
            System.out.println("Order makanan menggunakan Gofood");
        } else if(Hujan.equals("Mendung")){
            System.out.println("Order makanan langsung ke tempatnya dengan membawa payung");
        } else if(Hujan.equals("Cerah")){
            System.out.println("Order makanan langsung ke tempatnya dengan mengendarai motor");
        } else {
            System.out.println("Tidak order");
        }
}
}
