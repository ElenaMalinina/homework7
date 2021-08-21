public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Матроскин", 30);
        cats[1] = new Cat("Леопольд", 50);
        cats[2] = new Cat("Том", 70);
        Plate plate = new Plate(40);
        System.out.println("Надо покормить котов! В миске лежит " + plate.getFood());
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.moreFood(70);
        for (Cat cat: cats) {
            cat.eat(plate);
            cat.info();
            System.out.println("Количество еды в миске: " + plate.getFood());
        }
    }
}
