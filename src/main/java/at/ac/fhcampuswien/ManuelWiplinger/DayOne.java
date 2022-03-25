package at.ac.fhcampuswien.ManuelWiplinger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DayOne {
    public static int calcFuelByMass(int mass) {
        if(mass <= 0){
            return 0;
        }
        return mass/3-2;
    }

    public static int calcTotalFuel(ArrayList<Integer> values) {
        int total = 0;
        for (int value:values) {
            total +=calcFuelByMass(value);
        }
        return total;
    }

    public static int calcTotalFuelPartTwo(ArrayList<Integer> values) {
        int total = 0;
        int temp;
        for (int value:values) {
            temp=calcFuelByMass(value);
            total+=temp;
            while(calcFuelByMass(temp)>0){
                temp =calcFuelByMass(temp);
                total += temp;
            }
        }
        return total;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File puzzle = new File("src/main/resources/Puzzle.txt");
        Scanner scanner = new Scanner(puzzle);
        ArrayList<Integer> Masses = new ArrayList<>();
        while(scanner.hasNextLine())
        {
            Masses.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("Part1: "+calcTotalFuel(Masses));
        System.out.println("Part2: "+calcTotalFuelPartTwo(Masses));
    }
}

