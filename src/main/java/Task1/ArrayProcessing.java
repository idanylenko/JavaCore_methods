package Task1;

import java.util.Arrays;

public class ArrayProcessing {

    public int[] uniqueElements(int[] arr){
        int[] uniqueArr = new int[arr.length];
        int uniqueElemCounter = 0;
        for (int arrElem : arr) {
            if(arrElem == 0) {
                uniqueElemCounter++;
                break;
            }

        }

        for (int elem : arr) {
            boolean isUnique = true;
            for (int uniqueArrElem : uniqueArr) {
                if(elem == uniqueArrElem){
                    uniqueArrElem++;
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                uniqueArr[uniqueElemCounter] = elem;
                uniqueElemCounter++;
            }
        }
        int[] finalUniqueElementArray = new int[uniqueElemCounter];
              finalUniqueElementArray = Arrays.copyOf(uniqueArr, uniqueElemCounter);
        return finalUniqueElementArray;
    }
}
