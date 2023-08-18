package Language_Basics.Variables;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.IntConsumer;

public class Arrays_util_demo {
    public static void main(String[] args) {
        int [] arr={1,9,2,8,3,7,4,6,4,6};
        int [] arr1={1,9,2,8,3,7,4,6,4,6};
        int [] arr2={1,-9,2,8,3,7,4,6,4,6};
        System.out.println(Arrays.compare(arr,arr1));
        System.out.println(Arrays.compareUnsigned(arr,arr2));
        Arrays.sort(arr);

        Arrays.sort(arr,2,arr.length-1);



        System.out.println(Arrays.toString(arr));

        Arrays.parallelSort(arr);

        System.out.println(Arrays.toString(arr
        ));

        List<Integer> lis = Arrays.asList(1,2,3);

        System.out.println(lis);

        System.out.println(Arrays.binarySearch(arr,1));


       int [] newArr= Arrays.copyOf(arr,20);
        System.out.println(Arrays.toString(newArr));


      int [] gi = Arrays.copyOfRange(arr,2,5);

        System.out.println(Arrays.toString(gi));


        System.out.println(Arrays.deepHashCode(new String[] {"HI"}));

        System.out.println(Arrays.deepToString(new String[] {"HI"}));
        int [] asd=new int[4];
        Arrays.fill(asd,3);
        System.out.println(Arrays.toString(asd));

        System.out.println(Arrays.mismatch(asd,asd));


        Arrays.parallelPrefix(asd , (a,b) -> a+b);

        System.out.println(Arrays.toString(asd));

        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));


        Arrays.setAll(
                asd,i -> i*i
        );

        System.out.println(Arrays.toString(asd));


        Spliterator.OfInt df = Arrays.spliterator(arr);

        df.forEachRemaining((IntConsumer) x -> System.out.println(x));
}
    }

