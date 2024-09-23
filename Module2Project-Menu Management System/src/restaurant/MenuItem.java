package restaurant;

public class MenuItem implements Comparable<MenuItem>, Cloneable {
    private String name;
    private double price;
    private int calories;

    public MenuItem(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public int compareTo(MenuItem other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public MenuItem clone() {
        try {
            return (MenuItem) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
