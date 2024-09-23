package restaurant;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addItem(new MenuItem("Pasta", 8.99, 600));
        menu.addItem(new MenuItem("Burger", 5.49, 800));
        menu.addItem(new MenuItem("Salad", 4.99, 300));

        menu.sortByName();
        for (MenuItem item : menu) {
            System.out.println(item.getName() + " - $" + item.getPrice() + " - " + item.getCalories() + " calories");
        }

        menu.sortByPrice();
        for (MenuItem item : menu) {
            System.out.println(item.getName() + " - $" + item.getPrice() + " - " + item.getCalories() + " calories");
        }

        MenuItem clonedItem = menu.iterator().next().clone();
        System.out.println("Cloned item: " + clonedItem.getName() + " - $" + clonedItem.getPrice());
    }
}
