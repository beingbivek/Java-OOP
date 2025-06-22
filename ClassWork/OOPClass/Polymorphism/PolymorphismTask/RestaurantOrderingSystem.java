abstract class MenuItem {
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Preparing appetizer: chopping and seasoning...");
    }

    @Override
    void serve() {
        System.out.println("Serving appetizer with dipping sauce.");
    }
}

class MainCourse extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Preparing main course: cooking and plating...");
    }

    @Override
    void serve() {
        System.out.println("Serving main course with sides.");
    }
}

class Beverage extends MenuItem {
    @Override
    void prepare() {
        System.out.println("Preparing beverage: mixing and chilling...");
    }

    @Override
    void serve() {
        System.out.println("Serving beverage in a glass.");
    }
}

public class RestaurantOrderingSystem {
    public static void main(String[] args) {
        MenuItem[] order = {
            new Appetizer(),
            new MainCourse(),
            new Beverage()
        };

        for (MenuItem item : order) {
            System.out.println("Order for: " + item.getClass().getSimpleName());
            item.prepare();
            item.serve();
            System.out.println("-----");
        }
    }
}
