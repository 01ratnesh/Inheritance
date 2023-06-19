public class Car extends Vechile {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, int wheels, String type, int doors, int gears, boolean isManaul) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManaul;
        this.currentGear=1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called: changed to "+currentGear+ " gear");
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("change speed method called: speed-> "+newSpeed+ " direction -> "+newDirection);
    }
}
