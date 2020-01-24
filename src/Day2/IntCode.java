package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class IntCode {

    ArrayList<Integer> intCodeList;
    Scanner aScan;

    public IntCode(String nameOfFile) throws FileNotFoundException {

        intCodeList = new ArrayList<>();
        File aFile = new File(nameOfFile);

        aScan = new Scanner(aFile);
        aScan.useDelimiter(",");

        while (aScan.hasNext()) {
            intCodeList.add(Integer.parseInt(aScan.next()));


        }

    }
}
