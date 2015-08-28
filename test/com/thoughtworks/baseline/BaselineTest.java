package com.thoughtworks.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaselineTest {

    @Test
    public void extractItemNameFromInputOfTypeOne() {
        Baseline baseline = new Baseline();

        assertEquals("box of chocolates ", baseline.extractName("1 box of chocolates at 12.49"));
    }

}