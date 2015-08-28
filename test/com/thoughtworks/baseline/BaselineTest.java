package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BaselineTest {

    @Test
    public void extractItemNameFromInputOfTypeOne() {
        Baseline baseline = new Baseline();

        assertEquals("box of chocolates ", baseline.extractName("1 box of chocolates at 12.49"));
    }

    @Test
    public void extractPriceFromInput() {
        Baseline baseline = new Baseline();

        assertEquals(12.49, baseline.extractPrice("1 box of chocolates at 12.49"), 0.001);
    }

    @Test
    public void shouldBeTrueForImportedItems() {
        Baseline baseline = new Baseline();

        assertTrue(baseline.isImportedItem("1 imported box of chocolates at 22.80"));
    }

    @Test
    public void shouldBeTrueForExemptedItemBook() {
        Baseline baseline = new Baseline();

        assertTrue(baseline.isExemptedItem("1 book at 44.85"));
    }

    @Test
    public void shouldBeTrueForExemptedItemChocolate() {
        Baseline baseline = new Baseline();

        assertTrue(baseline.isExemptedItem("1 box of chocolates at 44.85"));
    }

}