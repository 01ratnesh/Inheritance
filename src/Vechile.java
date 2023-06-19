public class Vechile {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vechile(String name) {
        this.name = name;
        this.currentSpeed=0;
        this.currentDirection=0;

    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("steer method called: streeing at " + currentDirection + " degress");
    }

    public void move(int speed, int direction){
        this.currentSpeed += speed;
        System.out.println("Move method called: Moving at: "+currentSpeed+ " speed with direction "+direction+" direction");
    }

    public void stop(){
        this.currentSpeed=0;
        System.out.println("Stop method called: Your car has stopped at "+ currentSpeed+ " degress");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}

