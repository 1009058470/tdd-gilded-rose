package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void given_a_good_and_value_and_sellIn_when_given_today_then_output_value()
    {
        GildedRose gildedRose = new GildedRose();
        gildedRose.SellIn = 10;
        gildedRose.Quality = 3;
        int value = gildedRose.getCurrentValue(1);
        Assert.assertEquals(3,value);
    }

}