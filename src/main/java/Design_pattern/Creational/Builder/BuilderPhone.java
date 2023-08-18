package Design_pattern.Creational.Builder;

public class BuilderPhone {
    public static void main(String[] args) {
        BuilderPattern bp=new BuilderPattern("MI","INTEL","10.1");

        System.out.println(bp);

        System.out.println(new BuilderPattern().setPhone("IPHONE").setChip("16").setVersion("67"));
    }
}
