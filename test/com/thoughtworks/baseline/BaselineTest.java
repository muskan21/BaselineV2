package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BaselineTest {

    @Test
    public void parseStringIntoWords() {
        Baseline baseline = new Baseline();
        String input = "1 box of chocolates";
        String[] testString = {"1", "box", "of", "chocolates"};

        assertEquals(testString, baseline.parseStringToWords(input));
    }

    @Test
    public void extractItemNameFromInputOfTypeOne() {
        Baseline baseline = new Baseline();
        String input = "1 box of chocolates at 23.89";

        assertEquals("box of chocolates ", baseline.extractName(baseline.parseStringToWords(input)));
    }

    @Test
    public void extractPriceFromInput() {
        Baseline baseline = new Baseline();

        String input = "1 box of chocolates at 12.49";
        assertEquals(12.49, baseline.extractPrice(baseline.parseStringToWords(input)), 0.001);
    }

    @Test
    public void shouldBeTrueForImportedItems() {
        Baseline baseline = new Baseline();
        String input = "1 imported box of chocolates at 12.49";

        assertTrue(baseline.isImportedItem(input));
    }

    @Test
    public void shouldBeTrueForExemptedItemBook() {
        Baseline baseline = new Baseline();
        String input = "1 imported box of books at 12.49";

        assertTrue(baseline.isExemptedItem(input));
    }

    @Test
    public void shouldBeTrueForExemptedItemChocolate() {
        Baseline baseline = new Baseline();
        String input = "1 imported box of chocolates at 12.49";

        assertTrue(baseline.isExemptedItem(input));
    }

    @Test
    public void shouldBeTrueForExemptedItemMedical() {
        Baseline baseline = new Baseline();
        String input = "1 imported box of headache pills at 12.49";

        assertTrue(baseline.isExemptedItem(input));
    }
}