public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        bucket.putFruit(new Banana());
        bucket.putFruit(new Apple());
        bucket.putFruit(new Banana());
        bucket.putFruit(new Apple());
        bucket.putFruit(new Apple());
        bucket.putFruit(new Orange());
        bucket.putFruit(new Apple());
        bucket.putFruit(new Banana());
        bucket.putFruit(new Orange());
        bucket.showBucket();
        bucket.takeFruit();
        bucket.showBucket();
    }
}
