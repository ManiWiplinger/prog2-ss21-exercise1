package at.ac.fhcampuswien.ManuelWiplinger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOneTest {
    @Test
    @DisplayName("Mass = 12")
    void TestCalcFuelByMass_12(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(12);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Mass = 14")
    void TestCalcFuelByMass_14(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(14);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Mass = 1969")
    void TestCalcFuelByMass_1969(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(1969);
        int expected = 654;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Mass = 100756")
    void TestCalcFuelByMass_100756(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(100756);
        int expected = 33583;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Mass = 0")
    void TestCalcFuelByMass_0(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(0);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Mass = -20")
    void TestCalcFuelByMass_negativ20(){
        DayOne dayOne= new DayOne();
        int actual = dayOne.calcFuelByMass(-20);
        int expected = 0;
        assertEquals(expected,actual);
    }
}
