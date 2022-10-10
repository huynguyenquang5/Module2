package BaiTap;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String isOn() {
        if (on) {
            return "off";
        }
        return "on";
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayFan() {
        System.out.println("Speed is " + getSpeed());
        System.out.println("Radius is " + getRadius());
        System.out.println("Color is " + getColor());
        System.out.println("Fan is " + isOn());
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(FAST,10,"yellow", true );
        Fan fan2 = new Fan(MEDIUM, 5, "blue", false);
        System.out.println("Fan 1:");
        fan1.displayFan();
        System.out.println("Fan 2:");
        fan2.displayFan();
    }
}
