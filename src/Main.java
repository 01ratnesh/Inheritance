
public class Main {
    public static void main(String[] args) {
        SUV fortuner = new SUV("fortuner",false);
        fortuner.move(40,0);
        fortuner.accelerate(20);
        fortuner.accelerate(-50);
        fortuner.stop();
    }
}