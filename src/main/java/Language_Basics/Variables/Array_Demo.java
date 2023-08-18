package Language_Basics.Variables;

import java.util.Arrays;

public class Array_Demo {

    static int [] demo=new int[4];

    static int [] newArr=new int[demo.length];



    public static void main(String[] args) {
        demo[1]=10;
        System.out.println(Arrays.stream(demo).sum());

        System.out.println(Arrays.toString(demo));
        System.arraycopy(demo,1,newArr,0,2);

        System.out.println(Arrays.toString(newArr));

    }
}
