package SOLID;

public class OPEN_FOR_EXTENSION_CLOSED_FOR_MODIFICATION {
    public String getVehicleNumber(String state){
        if(state.equals("Bihar")){
            return "BH";
        }

        if(state.equals("Karnataka")){
            return "KA";
        }

        return state;
    }
}

abstract class VehicleNumber{
    public abstract String number();
}

class BiharNumber extends VehicleNumber{

    @Override
    public String number() {
        return "BH";
    }
}

class KarnatakaNumber extends VehicleNumber{

    @Override
    public String number() {
        return "KA";
    }
}
