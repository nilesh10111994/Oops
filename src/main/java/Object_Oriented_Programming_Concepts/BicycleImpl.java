package Object_Oriented_Programming_Concepts;
 public class BicycleImpl implements BicycleInterface{
    @Override
    public String toString() {
        return "BicycleImpl{" +
                "name='" + name + '\'' +
                '}';
    }

    String name= "hero";
    @Override
    public void changeGear() {
        System.out.println(20);
    }

    @Override
    public void changeSpeed() {
        System.out.println(22);
    }

    public static void main(String[] args) {
        BicycleImpl bi=new BicycleImpl();
        bi.changeGear();
        bi.changeSpeed();
        System.out.println(bi);
    }
}
