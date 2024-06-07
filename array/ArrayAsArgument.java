import java.util.*;

public class ArrayAsArgument {
    public static void main(String[] args) {
        int marks[] = { 89, 67, 99 };
        update(marks);

        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
}
