package com.gildedrose;

public class Item {

    final String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void increaseQualityIfPossible() {
        if (quality >= 50) return;
        quality++;
    }

    public void decrementQualityIfPossible() {
        if (quality <= 0) return;
        quality--;
    }

    public void decrementSellIn() {
        sellIn--;
    }

    public void setQualityToZero() {
        quality = 0;
    }

    boolean isSellInLowerThan(int i) {
        return sellIn < i;
    }
}
