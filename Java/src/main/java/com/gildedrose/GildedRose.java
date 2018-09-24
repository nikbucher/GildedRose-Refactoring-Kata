package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {
                item.increaseQuality();

                item.sellIn = item.sellIn - 1;

                if (item.sellIn < 0) {
                    item.increaseQuality();
                }
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (item.sellIn < 11) {
                        item.increaseQuality();
                    }

                    if (item.sellIn < 6) {
                        item.increaseQuality();
                    }
                }

                item.sellIn = item.sellIn - 1;

                if (item.sellIn < 0) {
                    item.quality = 0;
                }
            } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {

            } else {
                item.decreaseQuality();

                item.sellIn = item.sellIn - 1;

                if (item.sellIn < 0) {
                    item.decreaseQuality();
                }
            }
        }
    }

}