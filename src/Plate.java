public class Plate {
    public int food;
    int getFood() {
        return food;
    }
    public Plate (int food) {
        this.food = food;
    }
    boolean decreaseFood (int amount) {
        int balance = food - amount;
        if (balance < 0)
            return false;
        food -= amount;
        return true;
    }
    public void moreFood (int food) {
        this.food += food;
    }
}
