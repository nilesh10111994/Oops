package Object_Oriented_Programming_Concepts;

public class MountainBicycle extends BicycleObj{
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String color;
    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed+1);
    }

    @Override
    public String toString() {
        return "MountainBicycle{" +
                "color='" + color + '\'' +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void setGear(int gear) {
        super.setGear(gear+2);
    }

    public static void main(String[] args) {
        MountainBicycle mb=new MountainBicycle();
        mb.setGear(4);
        mb.setSpeed(400);
mb.setColor("Blue");
        System.out.println(mb);
    }
}
