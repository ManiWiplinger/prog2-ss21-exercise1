package at.ac.fhcampuswien.ManuelWiplinger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOneTest {
    @Test
    @DisplayName("Calculate Fuel of Mass = 12")
    void TestCalcFuelByMass_12(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(12);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Calculate Fuel of Mass = 14")
    void TestCalcFuelByMass_14(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(14);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Calculate Fuel of Mass = 1969")
    void TestCalcFuelByMass_1969(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(1969);
        int expected = 654;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Calculate Fuel of Mass = 100756")
    void TestCalcFuelByMass_100756(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(100756);
        int expected = 33583;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Calculate Fuel of Mass = 0")
    void TestCalcFuelByMass_0(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(0);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Calculate Fuel of Mass = -20")
    void TestCalcFuelByMass_negativ20(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(-20);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Calculate Total Fuel of Masses: 0,0")
    void TestCalcTotalFuel_0(){
        DayOne dayOne= new DayOne();
        ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(0,0));
        int actual = dayOne.calcTotalFuel(values);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Calculate Total Fuel of Masses: 12,14,1969")
    void TestCalcTotalFuel_3Integers(){
        DayOne dayOne= new DayOne();
        ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(12,14,1969));
        int actual = dayOne.calcTotalFuel(values);
        int expected = 2+2+654;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Part2: Calculate Total Fuel of Masses: 0,0")
    void TestCalcTotalFuelPartTwo_0(){
        DayOne dayOne= new DayOne();
        ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(0,0));
        int actual = dayOne.calcTotalFuelPartTwo(values);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Part2: Calculate Total Fuel of Masses: 14")
    void TestCalcTotalFuelPartTwo_14(){
        DayOne dayOne= new DayOne();
        ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(14));
        int actual = dayOne.calcTotalFuelPartTwo(values);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Part2: Calculate Total Fuel of Masses: 14,1969,100756")
    void TestCalcTotalFuelPartTwo_3Integers(){
        DayOne dayOne= new DayOne();
        ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(14,1969,100756));
        int actual = dayOne.calcTotalFuelPartTwo(values);
        int expected = 2+966+50346;
        assertEquals(expected,actual);
    }
}
