package com.thoughtworks.baseline;

public class Item {
    private String itemName;
    private boolean isExemptable;
    private double price;
    private double salesTax;
    private boolean isImported;

    public Item(String itemName, boolean isExemptable, boolean isImported, double price, double salesTax) {
        this.itemName = itemName;
        this.isExemptable = isExemptable;
        this.isImported = isImported;
        this.price = price;
        this.salesTax = salesTax;
    }
}
