import java.util.Arrays;
public class Demofarraycopying {
    public static void main(String[] args) {
        int[] sourceArray = {2,5,6,9,12,-2};
        int[] TargetArray = new int[sourceArray.length];

        System.out.println("Element in sourceArray -->" + Arrays.toString(sourceArray));
        System.out.println("Initial Element in TargetArray -->" + Arrays.toString(TargetArray));
        System.arraycopy(sourceArray, 4, TargetArray, 1, 2);

        // printing using toString
        System.out.println("After copy --> " +Arrays.toString(TargetArray));
        // printing using for loop
        System.out.println("After copy from source to target");
        for(int a = 0; a < TargetArray.length; a++) {
            System.out.println(TargetArray[a]);
        }
    }

}
