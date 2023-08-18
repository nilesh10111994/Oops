package Object_Oriented_Programming_Concepts;

public class BicycleObj {
    int gear;
    int speed;

    @Override
    public String toString() {
        return "BicycleObj{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public static void main(String[] args) {
        BicycleObj one = new BicycleObj(); //class and object
        BicycleObj two = new BicycleObj();

        one.setGear(1);
        one.setSpeed(20);
        System.out.println(one);

    }
}
