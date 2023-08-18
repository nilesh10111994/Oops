package Language_Basics.Variables;

public class Variable_demo {
    // Instance Variables (Non-Static Fields
    int speed = 10;
    int gear;

    //Class Variables (Static Fields)
    static String name="Nilesh";
    static int score;
//Constant var
    public static final double PI_VALUE =3.14;
    //local variable
    public void smaple(int paramVars){
        int localVar=9;
        System.out.println(localVar);

        System.out.println(paramVars);
    }

    public static void main(String[] args) {
        Variable_demo v1=new Variable_demo();
        System.out.println(v1.speed);
        System.out.println(v1.gear);

        Variable_demo variable_demo=new Variable_demo();
        System.out.println(variable_demo.name);
        name="Kumar";
        Variable_demo variable_demo1=new Variable_demo();
        System.out.println(variable_demo1.name);

        variable_demo1.smaple(12);

        System.out.println(PI_VALUE);
    }
}
