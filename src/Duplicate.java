import java.util.HashMap;

public class Duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int index;
        for (int i = 0; i < numbers.length; i++) {
            index = numbers[i];
            if (index >= length)
                index -= length;
            if(numbers[index] >= length){
                duplication[0] = index;
                return true;
            }
            numbers[index] += length;

        }
        return false;
    }
}
