package Day1;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fuel {


    public static long calcFuel(int mass) {
        long total = 0;

        while (mass > 0) {
            int fuel = (int) Math.floor(mass / 3) - 2;
            if (fuel > 0) {
                total += fuel;
            }
            mass = fuel;
        }
        return total;
    }

    public long process(String nameOfFile) throws FileNotFoundException {
        File aFile = new File("Data.txt");

        Scanner aScan = new Scanner(aFile);
        long total = 0;

        while (aScan.hasNext()) {
            total += calcFuel(Integer.parseInt(aScan.nextLine()));
        }
        return total;
    }
}

class Testers {
    public static void main(String[] asdasdasd) throws FileNotFoundException {
        Fuel aFuel = new Fuel();

        System.out.println(System.getProperty("user.dir"));

        System.out.println(aFuel.process("Data.txt"));

        System.out.println(Fuel.calcFuel(14));
    }
}
