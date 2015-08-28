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
}
