package Design_pattern.Creational.Factory;
enum OsName {WIN,IOS,AND};
public class FactoryOs {

    public OS getInstance(String osName){
        if (osName.equals(OsName.AND)){
            return new Android();
        } else if (osName.equals("IOS")){

            return new Iphone();
        } else {
            return new Windows();
        }
    }
}
