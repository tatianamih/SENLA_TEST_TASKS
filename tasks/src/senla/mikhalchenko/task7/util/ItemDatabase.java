package senla.mikhalchenko.task7.util;

import senla.mikhalchenko.task7.bean.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDatabase {

    public static List<Item> createItemDatabase() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Gold", 4, 3, 50));
        items.add(new Item("Silver", 10, 4, 6));
        items.add(new Item("Platinum", 3, 5, 80));
        items.add(new Item("Iridium", 5, 2, 434));
        return items;
    }
}
