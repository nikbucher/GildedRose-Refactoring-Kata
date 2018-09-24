package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(this::updateItemQuality);
    }

    private void updateItemQuality(Item item) {
        switch (item.name) {
            case "Aged Brie":
                handleAsAgedBrie(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                handleAsBackstagePasses(item);
                break;
            case "Sulfuras, Hand of Ragnaros":
                // do nothing
                break;
            default:
                handleAsDefault(item);
                break;
        }
    }

    private void handleAsAgedBrie(Item item) {
        item.increaseQualityIfPossible();
        item.decrementSellIn();
        if (item.isSellInLowerThan(0)) {
            item.increaseQualityIfPossible();
        }
    }

    private void handleAsBackstagePasses(Item item) {
        item.increaseQualityIfPossible();
        if (item.isSellInLowerThan(11)) {
            item.increaseQualityIfPossible();
        }
        if (item.isSellInLowerThan(6)) {
            item.increaseQualityIfPossible();
        }
        item.decrementSellIn();
        if (item.isSellInLowerThan(0)) {
            item.setQualityToZero();
        }
    }

    private void handleAsDefault(Item item) {
        item.decrementQualityIfPossible();
        item.decrementSellIn();
        if (item.isSellInLowerThan(0)) {
            item.decrementQualityIfPossible();
        }
    }

}