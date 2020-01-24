package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntCode {

    ArrayList<Integer> aList;
    Scanner aScan;

    public IntCode(String nameOfFile) throws FileNotFoundException {

        aList = new ArrayList<>();
        File aFile = new File(nameOfFile);

        aScan = new Scanner(aFile);
        aScan.useDelimiter(",");

        while (aScan.hasNext()) {
            aList.add(Integer.parseInt(aScan.next()));
        }
    }

    public ArrayList<Integer> getaList() {
        return aList;
    }

    public void setaList(ArrayList<Integer> aList) {
        this.aList = aList;
    }

    public void process(List<Integer> aList) {

        //aList.set(1, 12);
        //aList.set(2, 2);

        for (int i = 0; i+3 < aList.size() && aList.get(i) != 99; i+=4) {

            int opCode = aList.get(i);
            int firstUnit = aList.get(i + 1);
            int secondUnit = aList.get(i + 2);
            int location = aList.get(i + 3);
            int total = 0;

            if (opCode == 1) {
                total = aList.get(firstUnit) + aList.get(secondUnit);
                aList.set(location, total);
            } else if (opCode == 2) {
                total = aList.get(firstUnit) * aList.get(secondUnit);
                aList.set(location, total);
            }

        }
    }
}


class Testers {
    public static void main(String[] asasas) throws FileNotFoundException {
        IntCode aCode = new IntCode("Day2Data.txt");

        aCode.aList.set(1, 12);
        aCode.aList.set(2, 2);
        //String[] arrays = {"1, 2, 3, 4"};
        //List<String> stringList = Arrays.asList(arrays);

        //Integer[] aList = {1, 1, 1, 4, 99, 5, 6, 0, 99};
        //Integer[] test2 = {1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50};
        //List<Integer> test2List = Arrays.asList(test2);
        //List<Integer> aListers = Arrays.asList(aList);

        //aCode.process(test2List);
        aCode.process(aCode.aList);

    }
}