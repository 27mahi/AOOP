package restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Menu implements Iterable<MenuItem> {
    private List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void sortByName() {
        Collections.sort(items);
    }

    public void sortByPrice() {
        items.sort(Comparator.comparingDouble(MenuItem::getPrice));
    }

    public void sortByCalories() {
        items.sort(Comparator.comparingInt(MenuItem::getCalories));
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return items.iterator();
    }
}
