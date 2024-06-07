import java.util.*;

// time complexity: 0(n)


public class ArrayLinearSearch {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, 4, 2, 5, 6, 7, 5, 33, 78, 90, 34, 23, 12 };
        int key = 13;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found " + index);
        }
    }
}
