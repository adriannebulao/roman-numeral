package com.adriannebulao.romannumeral;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RomanNumeralConverterTest {
    @Test
    void integer_to_roman_converter_1_to_i() {
        int num = 1;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "I";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_2_to_ii() {
        int num = 2;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "II";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_3_to_iii() {
        int num = 3;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "III";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_4_to_iv() {
        int num = 4;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "IV";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_14_to_xiv() {
        int num = 14;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "XIV";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_24_to_xxiv() {
        int num = 24;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "XXIV";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_5_to_v() {
        int num = 5;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "V";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_15_to_xv() {
        int num = 15;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "XV";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_25_to_xxv() {
        int num = 25;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "XXV";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_10_to_x() {
        int num = 10;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "X";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_20_to_xx() {
        int num = 20;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "XX";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_30_to_xxx() {
        int num = 30;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "XXX";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_50_to_l() {
        int num = 50;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "L";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_150_to_cl() {
        int num = 150;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "CL";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_250_to_ccl() {
        int num = 250;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "CCL";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_100_to_c() {
        int num = 100;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "C";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_200_to_cc() {
        int num = 200;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "CC";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_300_to_ccc() {
        int num = 300;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "CCC";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_500_to_d() {
        int num = 500;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "D";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_1500_to_md() {
        int num = 1500;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "MD";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_2500_to_mmd() {
        int num = 2500;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "MMD";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_1000_to_m() {
        int num = 1000;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "M";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_2000_to_mm() {
        int num = 2000;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "MM";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_3000_to_mmm() {
        int num = 3000;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "MMM";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_3999_to_mmmcmxcix() {
        int num = 3999;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "MMMCMXCIX";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_1234_to_mccxxxiv() {
        int num = 1234;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "MCCXXXIV";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_3949_to_mmmcmxlix() {
        int num = 3949;
        String actual = new RomanNumeralConverter().integerToRomanConverter(num);
        String expected = "MMMCMXLIX";
        assertEquals(expected, actual);
    }

    @Test
    void integer_to_roman_converter_cannot_be_0() {
        int num = 0;
        String expected = "Value of num must be positive.";
        Exception e = assertThrows(NumberFormatException.class,
                () -> new RomanNumeralConverter().integerToRomanConverter(num));
        assertEquals(e.getMessage(), expected);
    }

    @Test
    void integer_to_roman_converter_cannot_be_negative_1() {
        int num = -1;
        String expected = "Value of num must be positive.";
        Exception e = assertThrows(NumberFormatException.class,
                () -> new RomanNumeralConverter().integerToRomanConverter(num));
        assertEquals(e.getMessage(), expected);
    }

    @Test
    void integer_to_roman_converter_cannot_be_negative_3999() {
        int num = -3999;
        String expected = "Value of num must be positive.";
        Exception e = assertThrows(NumberFormatException.class,
                () -> new RomanNumeralConverter().integerToRomanConverter(num));
        assertEquals(e.getMessage(), expected);
    }

    @Test
    void integer_to_roman_converter_cannot_be_greater_than_3999_4000() {
        int num = 4000;
        String expected = "Value of num must be 3999 or less.";
        Exception e = assertThrows(NumberFormatException.class,
                () -> new RomanNumeralConverter().integerToRomanConverter(num));
        assertEquals(e.getMessage(), expected);
    }

    @Test
    void integer_to_roman_converter_cannot_be_greater_than_3999_999999() {
        int num = 999999;
        String expected = "Value of num must be 3999 or less.";
        Exception e = assertThrows(NumberFormatException.class,
                () -> new RomanNumeralConverter().integerToRomanConverter(num));
        assertEquals(e.getMessage(), expected);
    }
}
