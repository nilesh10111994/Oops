package Object_Oriented_Programming_Concepts;

import java.util.ArrayList;

public class Counstructor_demo {
    Counstructor_demo(){

    }
    Counstructor_demo(int a){

    }


    public void returnVoid(){
        System.out.println("void");
    }

    public double returnDouble(){
        return 0.1d;
    }

    public String returnStr(){
        return "Nile";
    }

    public BicycleImpl reInter(){
        return new BicycleImpl();
    }

    public ArrayList<? extends Integer> retListINt(){
        return new ArrayList<>();
    }
}
