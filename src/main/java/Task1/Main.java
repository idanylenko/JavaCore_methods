package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        int[] result = arrayProcessing.uniqueElements(new int[]{2, 2, 1, 4, 5, 0, 6, 6});
        System.out.println(Arrays.toString(result));
    }
}
