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

}