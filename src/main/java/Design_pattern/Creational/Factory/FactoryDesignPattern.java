package Design_pattern.Creational.Factory;

public class FactoryDesignPattern {


    public static void main(String[] args) {
        FactoryOs os=new FactoryOs();
        OS o=os.getInstance("IOS");
        o.spec();
    }
}
