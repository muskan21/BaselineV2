//The Baseline Class implements the baseline problem of calculating sales tax for a number of items according to the defined business rules.

package com.thoughtworks.baseline;

import java.util.Scanner;

public class Baseline {

    public String extractName(String input) {
        String[] details = input.split(" ");
        String name = "";
        int i = 1;
        int len = details.length;
        while (i < (len - 2)) {
            name = name + details[i++]+" ";
        }
        return name;
    }

    public double extractPrice(String input) {
        String[] details = input.split(" ");
        return Double.parseDouble(details[details.length - 1]);
    }

    public boolean isImportedItem(String input) {
        return input.contains("imported");
    }

    public boolean isExemptedItem(String input) {
        return input.contains("book") || input.contains("chocolate");
    }
}
