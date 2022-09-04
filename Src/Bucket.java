import java.util.LinkedList;

public class Bucket  {
    LinkedList<Fruits> collectionOfFruits = new LinkedList<>();

    public void putFruit(Fruits fruits) {
        if (collectionOfFruits.size() < 8) {
            collectionOfFruits.addLast(fruits);
        } else {
            System.out.println("В корзине нет места");
        }
    }

    public Fruits takeFruit() {
        if (collectionOfFruits.size() == 0) {
            System.out.println("Корзина пуста");
            return null;
        } else {
            return collectionOfFruits.removeFirst();
        }
    }

    public void showBucket() {
        System.out.println(collectionOfFruits);
    }
}


