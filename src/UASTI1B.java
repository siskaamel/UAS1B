import java.util.ArrayList;
import java.util.Scanner;

public class UASTI1B {
    public static void main(String [] args ){
        System.out.println("Masukkan angka = ");
        Scanner inputUser = new Scanner(System.in);
        int number = inputUser.nextInt();
        int batas_atas = 200;

        while (number <= batas_atas){
            System.out.println("Angka = " + number);
            number++;
        }

        System.out.println("masukkan angka = ");
        inputUser = new Scanner(System.in);
        int batasatas = 200;
        int bilangan= inputUser.nextInt();
        System.out.println("Angka random" + bilangan + " hingga" + batasatas + " :");
        do {
            boolean Angkarandom = true;
            for (int angka = 80; angka < 100; angka += 200) {
                System.out.println("angka");
            }

            // Membuat 2 ArrayList
            ArrayList<Integer> angka = new ArrayList<>();
            number.add(85);
            number.add(90);

            int x=number.get(1);
            int f=number.get(2);

            //Method type 2



        }

    }
}
