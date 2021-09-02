import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Hospital H = new Hospital();

        int nd;
        int i;

        System.out.println("Enter number of doctors");
        nd = e.nextInt();

        for (i = 0; i < nd; i++) {
            System.out.println("Enter Doctor number" + (i + 1) + "name");

            String name = e.next();

            System.out.println("Age");
            int age = e.nextInt();

            System.out.println("EXP");
            int yearsOfExp = e.nextInt();

            System.out.println("SP");
            String specialzation = e.next();

            H.addDoctor(new Doctor(name, age, yearsOfExp, specialzation));
            // H.addDoctor(xn, xa, xy, xs);

        }
        ArrayList<Doctor> allDoctors = H.getDoctors();
        System.out.println(allDoctors);
    }
}
