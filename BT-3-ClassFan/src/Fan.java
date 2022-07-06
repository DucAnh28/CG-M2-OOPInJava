public class Fan {
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;

    int speed = slow;
    boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public Fan(){}

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (on == true) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", Fan is on" +
                    '}';
        }
        else {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", Fan is off" +
                    '}';
        }
    }
}
