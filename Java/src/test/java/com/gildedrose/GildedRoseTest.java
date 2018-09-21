package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.reporters.UseReporter;
import org.junit.Test;

@UseReporter(IdeaDiffReporter.class)
public class GildedRoseTest {

    @Test
    public void shouldBeGreen() throws Exception {
        // given:
        final String[] names = new String[]{null, "", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"};
        final Integer[] sellIns = new Integer[]{Integer.MIN_VALUE, -1, 0, 1, 5, 6, 7, 10, 11, 12, Integer.MAX_VALUE};
        final Integer[] qualities = new Integer[]{Integer.MIN_VALUE, -1, 0, 1, 49, 50, 51, Integer.MAX_VALUE};

        CombinationApprovals.verifyAllCombinations((name, sellIn, quality) -> {
            // given:
            final Item item = new Item(name, sellIn, quality);
            GildedRose app = new GildedRose(new Item[]{item});
            // when:
            app.updateQuality();
            // then:
            return item.toString();
        }, names, sellIns, qualities);
    }

}
